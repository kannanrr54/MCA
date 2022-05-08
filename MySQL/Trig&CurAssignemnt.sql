SELECT * FROM trig.customer;
INSERT INTO 
	customer
VALUES 
	(1,'alive',24,'khammam',2000 ),
	(2,'bob',27,'kadappa',3000),
	(3,'catri',25,'guntur',4000 ),
	(4,'dena',28,'hyd',5000 ),
	(5,'eeshwar',27,'kurnool',6000),
	(6,'farroq',28,'nellur',7000);
create table customer_trig (
id int,
name varchar(20),
age int,
address varchar(50),
salary int
);
