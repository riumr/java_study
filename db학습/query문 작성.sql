use madang;
show tables;
desc book;
select bookname,publisher,price from madang.book where price>=10000;
select bookname,price from book;
select price,bookname from book;
select * from book;
select distinct(publisher) from book;
select * from book where price <20000;
select * from book where price between 10000 and 20000;
select * from book where publisher in ('굿스포츠','대한미디어');
select bookname,publisher from book where bookname LIKE "_구%";
select * from book where bookname LIKE "%축구%" and price >20000;
select * from book order by price, bookname;
select sum(saleprice) AS 총매출 from orders where custid=2;
select custid,count(*), sum(saleprice) from orders group by custid;
select custid, count(*) from orders where saleprice>=8000 group by custid having count(*)>=2;
select publisher,count(publisher) from imported_book group by publisher;
select orderid from orders where orderdate between '2014-07-04' and '2014-07-07';
select * from orders, customer;
select * from customer join orders on orders.custid = customer.custid;
select * from customer,orders where customer.custid = orders.custid order by orders.custid;
select name,sum(saleprice) from customer,orders where customer.custid = orders.custid group by orders.custid order by orders.custid;
select name,bookname from customer,orders,book where customer.custid=orders.custid and orders.bookid=book.bookid;
select name,bookname from customer,orders,book where customer.custid=orders.custid and orders.bookid=book.bookid and orders.saleprice=20000;
select customer.name, orders.saleprice from customer left outer join orders on customer.custid = orders.custid;
select name,address from customer where address like "%영국%" union select name,address from customer where address like "%대한민국%" order by name;
select bookname from book where price=(select max(price) from book);
select name from customer where custid in (select custid from orders);
select name from customer where custid in (select custid from orders where bookid in (select bookid from book where publisher like "%대한미디어%"));
select bookname from book b1 where price>(select avg(price) from book b2 where b2.publisher=b1.publisher);
select s1.brand,s1.saleprice from sales s1 where s1.saleprice>(select avg(s2.saleprice) from sales s2 where s1.brand=s2.brand);
select name from customer where address like "%대한민국%" and name not in (select name from customer where custid in (select custid from orders));
select name,address from customer where custid in (select custid from orders);
select count(publisher) from book where bookid in (select bookid from orders where custid=(select custid from customer where name like "%박지성%"));
select bookname, price,price-saleprice from book b join orders o on b.bookid=o.bookid where o.custid=(select custid from customer where name like "%박지성%");
select bookname from book where bookid not in (select bookid from orders o where custid=(select custid from customer where name like "%박지성%"));
-- 주문하지 않은 고객의 이름
select name from customer where custid not in (select custid from orders);
-- 주문금액의 총액과 주문의 평균 금액
select sum(saleprice),avg(saleprice) from orders;
-- 	고객의 이름과 고객별 구매액
select c.name, o.saleprice from customer c join orders o on c.custid = o.custid;
-- 고객의 이름과 고객이 구매한 도서 목록
select name, bookname from book b join orders o join customer c on b.bookid=o.bookid and o.custid=c.custid;
-- 도서의 가격과 판매가격의 차이가 가장 많은 주문
select orderid from orders o join book b on o.bookid = b.bookid where (b.price-o.saleprice) = (select max(b.price-o.saleprice) from book b join orders o on b.bookid=o.bookid);
-- 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select name from customer c join orders o on c.custid=o.custid group by c.name having avg(o.saleprice)>(select avg(saleprice) from orders);
-- 테이블 만들기
-- create table Newbook (bookid Integer, bookname varchar(20), publisher varchar(20), price integer)
select * from Newbook;
--  primary key
create table Newbook2 (bookid Integer, bookname varchar(20), publisher varchar(20), price integer default 10000 check(price>1000), primary key(bookid,bookname));
create table NewCustomer(custid integer auto_increment primary key, name varchar(40), addreses varchar(40), phone varchar(30));
-- 외래키
create table NewOrders(
orderid integer auto_increment primary key,
custid integer not null,
bookid integer not null,
saleprice integer,
orderdate date,
foreign key(custid) references NewCustomer(custid) on delete cascade);
-- 테이블 복사
create table NewOrdersCopy as select * from NewOrders;
-- Alter 문
alter table NewBook add isbn varchar(13);
alter table NewBook modify isbn integer;
alter table NewBook drop column isbn;
alter table NewBook modify bookid integer not null;
alter table NewBook add primary key(bookid);
-- drop 문
drop table NewBook;
drop table NewCustomer;
-- insert 문
insert into book values(11,"스포츠의학",'한솔의학서점',90000);
insert into book (bookid, bookname, publisher) values(14,'스포츠의학','한솔의학서점');
insert into book(bookid,bookname,price,publisher) select bookid,bookname,price,publisher from imported_book;
-- update 문
update customer set address="대한민국 부산" where custid=5;
update book set publisher=(select publisher from imported_book where bookid=21) where bookid=14;
-- delete 문
delete from book where bookid=11;
delete from customer;
-- 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select name from customer c join orders o join book b on c.custid=o.custid and b.bookid=o.bookid where b.publisher in (select b.publisher from book b join orders o join customer c on o.custid=c.custid and b.bookid=o.bookid where c.name="박지성") and name not like '박지성';
-- 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name from customer c join book b join orders o on c.custid=o.custid and b.bookid=o.bookid group by name having count(distinct(publisher))>=2;
-- 전체 고객의 30%이상이 구매한 도서
select bookname from book b join customer c join orders o on b.bookid=o.bookid and c.custid=o.custid group by b.bookid having count(orderid)>=(select count(*)*0.3 from customer);
-- 새로운 도서가 마당서점에 입고되었다
insert into book values (15,'스포츠세계', '대한미디어',10000);
-- 성심당에서 출판한 도서를 삭제한다
delete from book where publisher = '삼성당';
-- 이상미디어에서 출판한 도서를 삭제한다.
delete from book where publisher = '이상미디어';
-- 출판사 '대한미디어'가 '대한출판사'로 이름을 바꾸었다
update book set publisher='대한출판사' where publisher = '대한미디어';
-- 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오
select bookid, replace(bookname,'야구','농구'), publisher, price from book;
-- 굿스포츠에서 출판한 도서의 제목과 제목의 글자 수를 확인하시오
select bookname '제목', char_length(bookname) 글자수 from book where publisher = '굿스포츠';
-- 고객 중 같은 성을 가진 사람의 수
select substr(name,1,1) '성', count(name) from customer group by substr(name,1,1);
-- 10일 후가 확정일자이다. 각 주문의 확정일자를 구하시오
select *,adddate(orderdate,interval 10 day) 확정일자 from orders;
-- 주문일을 '%Y-%m-%d' 형식의 문자열로 표시하시오
select * from orders where orderdate = date_format('20140707','%Y%m%d');
-- DBMS에 저장된 현재 날짜와 시간, 요일을 확인하시오
select sysdate();
-- null 값이 포함된 테이블 생성
create table mybook (bookid integer, price integer);
insert into mybook values (1,10000);
insert into mybook values (2,20000);
insert into mybook values (3,null);
commit;
select count(price) from mybook;
select *,ifnull(price,10000) from mybook;
-- 변수 사용 행번호 출력
set @seq:=0;
select (@seq:=@seq+1), custid from customer where @seq<2;
-- DML 복습
select * from book;
select *, @RNUM:=@RNUM+1 as ROWNUM from book,(select @RNUM:=0) R where @RNUM<5;
select *, @RNUM:=@RNUM+1 as ROWNUM from book,(select @RNUM:=1) R where @RNUM<5;
select *, @RNUM:=@RNUM+1 as ROWNUM from (select * from book order by price) b, (select @RNUM:=0) R where @RNUM < 5;
select *, @RNUM:=@RNUM+1 as ROWNUM from (select * from book where @RNUM<=5) b, (select @RNUM:=0) R order by price;
select *, @RNUM:=@RNUM+1 as ROWNUM from (select * from book where @RNUM<=5 order by price)b, (select @RNUM:=0)R;
-- 마당서점의 고객별 판매액을 구하시오(고객이름, 고객별 판매액)
select (select name from customer c where o.custid = c.custid) '고객', sum(saleprice) '판매액' from orders o group by o.custid;
select name '고객', (select sum(saleprice) from orders o where o.custid=c.custid group by o.custid ) '판매액' from customer c;
-- 새로운 필드 추가(bname)
alter table orders add bname varchar(40);
-- 각 주문번호와 일치하는 도서이름 추가. scalar subquery	
set sql_safe_updates = 1;
update orders o set bname = (select b.bookname from book b where b.bookid=o.bookid);
select * from orders;
-- 고객번호가 2 이하인 고객의 판매액을 보이시오(고객이름, 고객별 판매액). inline view
select cs.name, sum(saleprice) from (select * from customer where custid<=2) cs, orders o group by cs.name;
-- 평균 주문 금액 이하의 주문에 대해서 주문번호와 금액을 보이시오. 중첩 subquery
select orderid, saleprice from orders where saleprice<=(select avg(saleprice) from orders);
-- 각 고객의 평균 주문 금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오. 비교연산자
select orderid,custid,saleprice from orders o1 where saleprice>(select avg(saleprice) from orders o2 where o1.custid=o2.custid);
-- 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오. in
select sum(saleprice) from orders where custid in (select custid from customer where address like '%대한민국%');
-- 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오. all
select orderid, saleprice from orders where saleprice> all (select max(saleprice) from orders where custid='3');
-- 뷰
create view vorders as select orderid, o.custid, name,o.bookid, bookname, saleprice, orderdate from customer c, orders o, book b where c.custid=o.custid and b.bookid=o.bookid;
select * from vorders;
-- Book 테이블에서 '축구' 라는 문구가 포함된 자료만 보여주는 뷰
create view vw_book as select * from book where bookname like "%축구%";
select * from vw_book;
-- 주소에 대한민국을 포함하는 고객들로 구성된 view
create view v_customer as select * from customer where address like '%대한민국%';
select * from v_customer;
-- orders 테이블에 고객이름과 도서이름을 바로 확인할 수 있는 뷰를 생성한 후, '김연아' 고객이 구입한 도서의 주문번호, 도서이름, 주문액을 보이시오
select orderid, bookname, saleprice from vorders where name = '김연아';
-- v_customer를 영국 주소를 가진 고객으로 변경
create or replace view v_customer(custid,name,phone) as select custid,name,phone from customer where address Like '%영국%';
select * from v_customer;
-- view drop
drop view v_customer;
-- information shema
-- update view
update v_customer set phone = '000-0000' where custid=3;
-- 판매가격이 20000 이상인 도서의 도서번호, 도서이름, 고객이름, 출판사, 판매가격을 보여주는 highorders 뷰를 작성하시오
create or replace view highorders as select b.bookid, b.bookname, name, b.publisher, o.saleprice from book b join customer c join orders o on o.custid=c.custid on b.bookid = o.bookid where saleprice>=20000;
create or replace view highorders as select b.bookid, b.bookname, name, b.publisher, o.saleprice from book b, customer c, orders o where o.custid=c.custid and b.bookid = o.bookid and saleprice>=20000;
select * from highorders;
use information_schema;
show tables;
select * from information_schema.views where table_schema="madang";
-- 생성된 뷰에서 도서의 이름과 고객의 이름 출력
select bookname, name from highorders;
-- highordres 뷰에서 판매가격 삭제
alter view highorders as select b.bookid, b.bookname, c.name, b.publisher from book b, customer c;
show variables like 'datadir';
-- book 테이블의 bookname 열을 대상으로 비 클러스터 인덱스 ix_book 생성
create index ix_book on book (bookname);
show index from book;
-- book 테이블의 publisher, price 열 대상으로 인덱스 ix_book2 생성
create index ix_book2 on book (publisher, price);
show index from book;

select * from book where publisher = "대한미디어" and price >=30000;
show table status like 'book';
analyze table book;
drop index ix_book on book;
-- 인덱스 유무에 따른 탐색시간 비교
select name, address from customer where name like '박세리';
create index ix_name on customer (name);
drop index ix_name on customer;

-- unique 값에는 index가 자동부여된다
create table usertbl (
userid varchar(8) not null,
name varchar(8) not null, 
birthYear int not null,
city varchar(5) not null);

insert into usertbl values ('zzz','name3',1990,'서울');
insert into usertbl values ('aaa','name2',1990,'서울');
insert into usertbl values ('ppp','name1',1990,'서울');

-- procedure	
-- out
call AveragePrice(@val);
select @val;
-- in and out
call maxID('첫번째 책', @myid);
call maxID('두번째 책', @myid);
call maxID('세번째 책', @myid);
select @myID;

call customAddress('박지성');