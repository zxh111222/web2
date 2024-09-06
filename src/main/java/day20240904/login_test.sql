show databases;

create database if not exists login_test;

use login_test;

show tables;

insert into users(id, username, password) values
    (1, 'user1', '123456'), (2, 'user2', '123456'), (3, 'user3', '123456');


