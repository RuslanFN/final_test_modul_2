create database if not exists HumanFriends;

use HumanFriends;
#Создание таблиц домашних животных и вьючных животных
create table if not exists pets 
(
    id int auto_increment primary key not null, 
    pet_name varchar(30) not null, 
    pet_id int not null 
);

 create table if not exists packs 
 ( 
    id int auto_increment primary key not null, 
    pack_name varchar(30) not null, 
    pack_id int not null 
 );
# Создание низкоуровненых таблиц
 create table if not exists cats 
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null 
 );
  create table if not exists humsters 
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null 
 );
  create table if not exists dogs 
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null 
 );

  create table if not exists hourses 
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null 
 );

  create table if not exists donkeys 
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null 
 );

  create table if not exists camels 
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null 
 );
#Заполнение низкоуровневых таблиц
insert into cats 
(name, cmd, date_birthd) 
values 
('Name', 'CMD', '2022-11-22'), 
('NAME', 'CMD', '2021-1-1'),
('NAME', 'CMD', '2019-1-1');

insert into dogs 
(name, cmd, date_birthd) 
values 
('Name', 'CMD', '2022-11-22'), 
('NAME', 'CMD', '2021-1-1'),
('NAME', 'CMD', '2019-1-1');

insert into humsters 
(name, cmd, date_birthd) 
values 
('Name', 'CMD', '2022-11-22'), 
('NAME', 'CMD', '2021-1-1'),
('NAME', 'CMD', '2019-1-1');

insert into hourses 
(name, cmd, date_birthd) 
values 
('Name', 'CMD', '2022-11-22'), 
('NAME', 'CMD', '2021-1-1'),
('NAME', 'CMD', '2019-1-1');

insert into donkeys 
(name, cmd, date_birthd) 
values 
('Name', 'CMD', '2022-11-22'), 
('NAME', 'CMD', '2021-1-1'),
('NAME', 'CMD', '2019-1-1');

insert into camels 
(name, cmd, date_birthd) 
values 
('Name', 'CMD', '2022-11-22'), 
('NAME', 'CMD', '2021-1-1'),
('NAME', 'CMD', '2019-1-1');

# Удаление верблюдов
drop table if exists camels;    

# Создание таблицы молодых животных
create table if not exists yang_animals
 ( 
    id int auto_increment primary key not null, 
    name varchar(30) not null, 
    cmd varchar(30), 
    date_birthd date not null, 
    age varchar(30) /* добавлено поле с возрастом в виде текста */
 );
# Переносим всех живоных от 1 года до 3-х лет в таблицу с молодыми животными
insert into yang_animals 
(name, cmd, date_birthd)
select name, cmd, date_birthd from cats
where TIMESTAMPDIFF(day, date_birthd, now()) > 365 AND TIMESTAMPDIFF(year, date_birthd, now()) < 3;

insert into yang_animals 
(name, cmd, date_birthd)
select name, cmd, date_birthd from dogs
where TIMESTAMPDIFF(day, date_birthd, now()) > 365 AND TIMESTAMPDIFF(year, date_birthd, now()) < 3;

insert into yang_animals 
(name, cmd, date_birthd)
select name, cmd, date_birthd from humsters
where TIMESTAMPDIFF(day, date_birthd, now()) > 365 AND TIMESTAMPDIFF(year, date_birthd, now()) < 3;

insert into yang_animals 
(name, cmd, date_birthd)
select name, cmd, date_birthd from hourses
where TIMESTAMPDIFF(day, date_birthd, now()) > 365 AND TIMESTAMPDIFF(year, date_birthd, now()) < 3;

insert into yang_animals 
(name, cmd, date_birthd)
select name, cmd, date_birthd from donkeys
where TIMESTAMPDIFF(day, date_birthd, now()) > 365 AND TIMESTAMPDIFF(year, date_birthd, now()) < 3;
# Заполняем текстовое поле возраста
update yang_animals
set age = CONCAT(TIMESTAMPDIFF(year, date_birthd, now()), 'лет ' ,TIMESTAMPDIFF(month, date_birthd, now()) % 12, 'мес.');
# Объединение всех таблиц
select * from cats
join dogs
join humsters
join donkeys
join hourses;

select * from yang_animals;