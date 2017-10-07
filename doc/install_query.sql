use test_db;

create table board(
	id int not null auto_increment,
	title varchar(100) not null,
	content text null,
	regdate datetime not null,
	primary key(id)
);

insert into board(title, content, regdate) values('title1', 'content1', now());
insert into board(title, content, regdate) values('title2', 'content2', now());
insert into board(title, content, regdate) values('title3', 'content3', now());

