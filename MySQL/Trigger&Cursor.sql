use trig;
create table student(id int,name varchar(20),m1 int,m2 int,m3 int,status varchar(5));
call insertdetails(1,"Ann",70,60,80);
select name,percntage(m1,m2,m3) from student;
call c_st();
select * from student;
create table st_status(Status varchar(10));
select * from st_status;

