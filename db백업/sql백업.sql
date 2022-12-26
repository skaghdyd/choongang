drop table user;
drop table reservation;
drop table chart;
drop table patient;

select * from user;
select * from reservation;
select * from chart;
select * from patient;

create table user(
id varchar(20) primary key,
name varchar(20),
password varchar(20)
);

insert into user
values('admin','어드민','admin'),
('a','a','a');

create table reservation(
date varchar(20),
name varchar(20),
doctor varchar(20),
ssn varchar(20),
phoneNum varchar(20),
primary key(date, ssn)
);

insert into reservation
values('20221223','서재원','손유나','930411-1******','01012345678'),
('20221223','임총민','손유나','950124-1******','01012345678'),
('20221223','남호용','손유나','930408-1******','01012345678'),
('20221223','안지훈','손유나','940722-1******','01012345678');

create table chart(
chartNum int auto_increment primary key,
date varchar(20),
name varchar(20),
ssn varchar(20),
Symptom varchar(100),
opinion varchar(100)
);

insert into chart
values(0,'20220305','손유나','900930-2******','목 아픔','주사 한방'),
(0,'20220307','손유나','900930-2******','두통','주사 두방'),
(0,'20220308','손유나','900930-2******','코 막힘','주사 세방'),
(0,'20220310','임총민','950124-1******','무릎 아픔','수술 요함'),
(0,'20220311','임총민','950124-1******','허리 아픔','수술 요함'),
(0,'20220313','서재원','930411-1******','성장통','게보린 처방'),
(0,'20220313','서재원','930411-1******','악몽 꿈','안정제 처방'),
(0,'20220318','안지훈','940722-1******','꾀병','곤장 한방'),
(0,'20220319','안지훈','940722-1******','잦은 배고픔','고구마 한개'),
(0,'20220320','남호용','930408-1******','조울증','아스피린 처방'),
(0,'20220320','남호용','930408-1******','골절','부목');

create table patient(
name varchar(20),
ssn varchar(20) primary key,
phoneNum varchar(20),
fileName varchar(20)
);

insert into patient
values('손유나', '900930-2******', '01012345678','syn.jpg'),
('임총민', '950124-1******', '01012345678','icm.jpg'),
('서재원', '930411-1******', '01012345678','sjw.jpg'),
('안지훈', '940722-1******', '01012345678','ajh.jpg'),
('남호용', '930408-1******', '01012345678','nhy.jpg');