use book_management;

-- 폐기도서 트리거
delimiter $$
create trigger trigger_DiscardBook
after delete on Book
for each row
begin
insert into DiscardedBooks (book_id, discard_date)
values (old.book_id,curdate());
END$$	
delimiter ;

-- 도서 대출 프로시저
delimiter $$
create procedure BorrowBook(IN bookID int,IN userID int)
begin
	declare today date;
    declare restriction_date date;
	declare status varchar(20);
    declare book_borrowed int;
    
    set today = curdate();
    
    start transaction;
    
    -- 입력된 도서의 대출상태와 입력된 회원의 도서대출권수, 대출제한시작일을 가져온다
	select book_status into status from books where book_id=bookID;
    select user_borrow_count into book_borrowed from user where user_id=userID;
    select user_borrow_restrection_start into restriction_date from user where user_id=userID;
    
    -- 반납제한중인데 오늘 날짜가 반납제한 시작일부터 2주이내이면, 대출제한기간임을 알려준다
    if(restriction_date is not null and today < date_add(restriction_date,interval 2 week)) then
	   signal sqlstate '45000' set message_text='대출 제한 기간입니다.';
       rollback;
	-- 대출권수가 5권 이상이 되면
	elseif book_borrowed>=5 then
		signal sqlstate '45000' set message_text='더이상 대출할 수 없습니다';
        rollback;
	-- 도서가 대출가능상태면, 대출중으로 바꾸고 입력된 회원이 빌린 권수에 1을 더한다
	elseif status='대출가능' then
		update book set book_status = '대출중' where book_id=bookID;		
		update user set user_borrow_count = book_borrowed+1 where user_id=userID;
        commit;
	-- 그 외의 모든 경우에 책은 대출할 수 없다
    else 
		signal sqlstate '45000' set message_text='이 책은 대출할 수 없습니다';
        rollback;
	end if;
end$$
delimiter ;

-- 도서반납 프로시저
delimiter $$
create procedure ReturnBook(IN bookID int, IN userID int, IN isLate boolean)
begin
	declare today DATE;
    declare delay_count int;
    set today = curdate();
    
    start transaction;
    
    -- 입력된 회원의 반납지연횟수를 가져온다
    select user_return_delay_count into delay_count from user where user_id=userID;
    -- 입력된 도서상태를 일단 대출가능으로 바꾼다
    update book set status = '대출가능' where book_id=bookID;
    -- 입력된 유저의 대출도서수를 1 줄인다
    update user
    set user_borrow_count = user_borrow_count-1,
		 user_point = case
			when isLate then user_point
			else user_point+10
		 end,
		 user_return_delay_count = case
			when isLate then delay_count+1
			else delay_count
		 end,
		 user_borrow_restriction_start = case
			when isLate and (delay_count+1)>=3 then today
			else null
		 end		
    where use_id=userID;
    commit;
end$$
delimiter ;