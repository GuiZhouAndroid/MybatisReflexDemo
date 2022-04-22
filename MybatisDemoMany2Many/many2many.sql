create table user(
	id int primary key auto_increment,
	username varchar(20),
	address varchar(60)
);
insert into user(username,address) values('张松1','贵阳1');
insert into user(username,address) values('张松2','贵阳2');
insert into user(username,address) values('张松3','贵阳3');

create table role(
	id int primary key auto_increment,
	role_name varchar(30),
	role_describe varchar(30)
);

insert into role(role_name,role_describe) values('管理员','管理整个系统');
insert into role(role_name,role_describe) values('商家','经营旗下店铺');
insert into role(role_name,role_describe) values('普通用户','使用对象');

create table user_role(
	user_id int,
	role_id int,
	foreign key(user_id) references user(id),
	foreign key(role_id) references role(id)
);

insert into user_role(user_id,role_id) values(1,1);
insert into user_role(user_id,role_id) values(1,2);
insert into user_role(user_id,role_id) values(1,3);
insert into user_role(user_id,role_id) values(2,2);
insert into user_role(user_id,role_id) values(3,3);

select * from user;
select * from role;
select * from user_role;