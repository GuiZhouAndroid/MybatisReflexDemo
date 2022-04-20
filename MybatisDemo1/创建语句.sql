create database mybatisdemo default charset utf8;
use mybatisdemo;

create table student(
id int auto_increment primary key,
name varchar(255) default null,
email varchar(255) default null,
age varchar(255) default null
)engine = innodb default charset=utf8;