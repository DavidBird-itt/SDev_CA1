# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups
-- id,type,fName,lName,dob,salary

create table Employees (
    id                  bigint auto_increment not null,
    type                varchar(255),
    fName               varchar(255),
    lName               varchar(255),
    dob                 date not null,
    salary              integer not null,
    CONSTRAINT pk_Employees primary key (id)
);







