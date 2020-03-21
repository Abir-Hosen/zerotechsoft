CREATE SCHEMA `zerotechsoft` ;

drop table if exists user;
create table user (
   id bigint not null auto_increment,
    email varchar(100) not null,
    name varchar(100) not null,
    password varchar(50) not null,
    username varchar(30) not null,
    primary key (id)
) engine=InnoDB;

INSERT INTO user(name, username, email, password) VALUES ('Admin', 'admin', 'admin@gmail.com', 'admin');