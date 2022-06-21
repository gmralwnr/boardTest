

create table once(
num number(5) primary key,
pass varchar2(30),
userid varchar2(30),
title varchar2(50),
content varchar2(1000),
readcount number(4) default 0,
writedate date default sysdate

)
create sequence once_seq start with 1 increment by 1;

create table people(
name varchar2(30),
userid varchar2(30),
pwd varchar2(30),
phone varchar2(30),
primary key(userid)
);

insert into people values('이소미', 'somi', '1234', '010-4545-4545')


insert into once(num, pass, userid, title, content) values(once_seq.nextVal, '1234', 'somi', '안녕하세요' , '안녕하십니까 ~');
