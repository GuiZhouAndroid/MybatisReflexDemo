create database mybatisdemo default charset utf8;
use mybatisdemo;

create table student(
id int auto_increment primary key,
name varchar(255) default null,
email varchar(255) default null,
age int default null
)engine = innodb default charset=utf8;

insert into student(name,email,age) values("zs1","121076262@qq.com",23);
insert into student(name,email,age) values("zs2","1211232132@qq.com",223);
insert into student(name,email,age) values("zs3","32476262@qq.com",24);