create table member(
id   char(20) not null primary key,
passwd   char(20) not null,
passwd1   char(20) not null,
name  char(20) not null,
email   char(50) not null,
address   char(100) not null
)default character set euckr;