create table class(
	id int primary key auto_increment,
	name varchar(32)
);
insert into class(name) values('计科一班');
insert into class(name) values('计科二班');
insert into class(name) values('计科三班');

create table teacher(
	id int primary key auto_increment,
	class_id int,
	name varchar(16),
	age int,
	unique(class_id),
	foreign key(class_id) references class(id)
);

insert into teacher(class_id,name,age) values(1,'老师1',20);
insert into teacher(class_id,name,age) values(2,'老师2',30);
insert into teacher(class_id,name,age) values(3,'老师3',40);

select * from class;
select * from teacher;