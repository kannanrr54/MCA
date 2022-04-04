create database JA;
use JA;
CREATE TABLE actors (
  act_id varchar(20) NOT NULL,
  act_name varchar(20) NOT NULL,
  act_gender varchar(20) NOT NULL
);
CREATE TABLE directors (
  director varchar(20) DEFAULT NULL,
  dyear float DEFAULT NULL
);
CREATE TABLE movies (
  title varchar(20) NOT NULL,
  director varchar(20) DEFAULT NULL,
  myear bigint(11) DEFAULT NULL,
  rating float DEFAULT NULL
);