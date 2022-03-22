use movie;
create table employee(
empno varchar(20) primary key,
emp_name varchar(20),
dept varchar(20),
salary float,
doj varchar(20),
branch varchar(20));
insert into employee values('E101','Amit','Production','45000','12-Mar-00','Banglore');
insert into employee values('E102','Amit','HR','70000','03-jul-02','Banglore');
insert into employee values('E103','Amit','Management','120000','11-Jan-01','mysore');
insert into employee values('E105','Amit','IT','67000','01-Aug-01','mysore');
insert into employee values('E106','Amit','Civil','145000','20-Sep-03','Mumbai');
select * from employee;
select empno,salary from employee;
select avg(salary) from employee;
select count(empno) from employee;
select count(distinct emp_name) from employee;
select emp_name,count(empno) from employee group by emp_name;
select emp_name,sum(salary) from employee group by emp_name;
select emp_name,sum(salary) 'salary' from employee where salary > 120000 group by emp_name;
select distinct emp_name from employee order by emp_name desc;
select * from employee where emp_name="amit" and salary>50000;


