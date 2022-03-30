use movie;
show tables;
create table dept (
deptno int primary key,
dname varchar(20),
loc varchar(20));
rename table dept to department;
alter table department add pincode INT (10) NOT NULL; 
SELECT * from department;
alter table department drop column pincode; 
alter table department change column dname dept_name varchar(20);
alter table department modify column loc char (10);
drop table department;