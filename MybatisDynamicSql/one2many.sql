create table customer(
	id int primary key auto_increment,
	name varchar(32),
	age int
);
insert into customer(name,age) values('张松1',18);
insert into customer(name,age) values('张松2',19);
insert into customer(name,age) values('张松3',20);

create table orders(
	id int primary key auto_increment,
	customer_id int,
	orderNumber varchar(16),
	orderPrice double,
	foreign key(customer_id) references customer(id)
);

insert into orders(customer_id,orderNumber,orderPrice) values(1,'qweqdasdqw1213',100);
insert into orders(customer_id,orderNumber,orderPrice) values(2,'gdfgfdgwre131',200);
insert into orders(customer_id,orderNumber,orderPrice) values(3,'vxcvfgfdgfhfd231',300);

select * from customer;
select * from orders;