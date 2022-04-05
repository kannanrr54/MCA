
create database movie;
use movie;
CREATE TABLE actors (
  act_id int,
  act_name varchar(20) NOT NULL,
  act_gender varchar(20) NOT NULL);
CREATE TABLE directors (
  dir_id int,
  dir_name varchar(20),
  dir_Phone varchar(20));
CREATE TABLE movies (
  mov_id int,
  mov_title varchar(20),
  mov_year varchar(20),
  mov_lang varchar(20),
  dir_id int);
  CREATE TABLE movie_cast (
  mov_id int,
  act_id int,
  role varchar(20));
CREATE TABLE rating (
mov_id int,
rev_star int);
insert into actors values (1,"Tom","M"),(2,"tobie","M"),(3,"Chris","M"),(4,"Robert","M"),(5,"Angelina","F");
insert into directors value
(10,"steven spielberg","9898989898"),
(11,"Nolan","9898989898"),
(12,"James","9898989898"),
(13,"Hitchcock","9898989898"),
(14,"Ethan","9898989898");
insert into movies value 
(25,"ready one player","2020","English",10),
(20,"Jaws","1975","English",10),
(21,"Jurassic Park","1993","English",10),
(22,"Lifeboat ","1944","English",13),
(23,"rope","1948","English",13),
(24,"The Dark knight","2008","English",11);
insert into movie_cast values
(20,4,"Sailer"),
(20,5,"Sailer's GF"),
(24,3,"Batman"),
(24,1,"Robin"),
(23,2,"Dead man");
insert into rating values(20,3),(21,4),(22,5),(23,2),(24,3);
insert into rating values(20,0),(21,5),(22,2),(23,3),(24,4);
/*1*/
select m.mov_title
from movies m join directors d 
	on m.dir_id=d.dir_id
where d.dir_name="Hitchcock";

/*3*/
select distinct a.act_name 
from actors a join  movie_cast mc 
	on a.act_id=mc.act_id 
join movies m 
	on m.mov_id=mc.mov_id
where CAST(m.mov_year AS Decimal) < 2000 or CAST(m.mov_year AS Decimal) > 2015;

/*4*/
select m.mov_title,r.rev_star,max(r.rev_star) 'Top Stars' 
from rating r join movies m 
	on r.mov_id=m.mov_id 
where r.rev_star>0 
group by m.mov_title 
order by m.mov_title ;

/*5*/
update rating 
set rev_star=5
where mov_id in (select m.mov_id
				 from movies m join directors d 
					on m.dir_id=d.dir_id
				 where d.dir_name="steven spielberg");
			
  
  