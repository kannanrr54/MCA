create database banking;

create table customer(
cid int primary key,
cname varchar(20),
loc varchar(20),
sex varchar(20),
dob varchar(20));

create table bank_branch(
bcode varchar(10) primary key,
bloc varchar(20),
bstate varchar(20));

create table deposit(
dacno int primary key,
dtype varchar(20),
ddate varchar(20),
damt varchar(20));

create table loan(
lacno int primary key,
ltype varchar(20),
ldate varchar(20),
lamt float(20));

create table accounts_in(
bcode varchar(20) ,
cid int,
FOREIGN KEY (bcode) REFERENCES bank_branch(bcode) ON DELETE CASCADE,
FOREIGN KEY (cid) REFERENCES customer(cid) ON DELETE CASCADE);

create table Depositor(
cid varchar(20) ,
dacno int,
FOREIGN KEY (dacno) REFERENCES deposit(dacno) ON DELETE CASCADE/*,
FOREIGN KEY (cid) REFERENCES customer(cid) ON DELETE CASCADE*/);

create table Borrower(
cid varchar(20) ,
lacno int,
FOREIGN KEY (lacno) REFERENCES loan(lacno) ON DELETE CASCADE/*,
FOREIGN KEY (cid) REFERENCES customer(cid) ON DELETE CASCADE*/);

use banking;
show tables;

describe customer;
describe bank_branch;
describe deposit;
describe loan;
describe accounts_in;
describe Depositor;
describe Borrower;

drop table customer;
drop table bank_branch;
drop table deposit;
drop table loan;
drop table accounts_in;
drop table Depositor;
drop table Borrower;