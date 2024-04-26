CREATE TABLE `book`
(
    `book_id`    INTEGER NOT NULL,
    `book_name`    VARCHAR(40) NOT NULL,
    `book_writer`    VARCHAR(40) NOT NULL,
    `book_price`    INTEGER NOT NULL,
    `ISBN`    VARCHAR(40) UNIQUE NOT NULL,
    `book_status`    VARCHAR(30) NOT NULL,
    `is_discard`    BOOLEAN NOT NULL,
    `discard_date`    DATE,
    `library_id`    INTEGER NOT NULL,
    `publisher_id` int,
	 PRIMARY KEY (`book_id` ),
	 FOREIGN KEY (publisher_id) REFERENCES Publisher(publisher_id),
     FOREIGN KEY (library_id) REFERENCES Library(library_id)
);


CREATE TABLE `library`
(
    `library_id`    INTEGER NOT NULL,
    `library_name`    VARCHAR(40) NOT NULL,
    `library_address`    VARCHAR(40) NOT NULL,
    `library_phone`    VARCHAR(40) NOT NULL,
    `type`    VARCHAR(20) NOT NULL,
	PRIMARY KEY ( `library_id` )
);


CREATE TABLE `publisher`
(
    `publisher_id`    INTEGER NOT NULL,
    `publisher_name`    VARCHAR(40) NOT NULL,
    `publisher_address`    VARCHAR(40) NOT NULL,
    `publisher_phone_number`    VARCHAR(40) NOT NULL,
 PRIMARY KEY ( `publisher_id` )
);


CREATE TABLE `user`
(
    `user_id`    INTEGER NOT NULL,
    `user_name`    VARCHAR(40) NOT NULL,
    `user_phone_number`    VARCHAR(40) NOT NULL,
    `user_address`    VARCHAR(40) NOT NULL,
    `user_point`    INTEGER DEFAULT 0 NOT NULL,
    `user_password`    VARCHAR(40) NOT NULL,
    `user_borrow_count` INTEGER DEFAULT 0 NOT NULL,
    `user_borrow_restrict_start`    DATE,
    `user_return_delay_count` INTEGER,
    `is_signout`    VARCHAR(20),
    `signout_date`    DATE,
    `library_id` int,
	PRIMARY KEY (`user_id` ),
    FOREIGN KEY (library_id) REFERENCES Library(library_id)
);


