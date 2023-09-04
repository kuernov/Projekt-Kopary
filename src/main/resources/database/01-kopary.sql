--liquibase formatted sql
--changeset bmalyjasiak:1`
create table kopary1(
                       id serial not null primary key,
                       brand varchar not null,
                       color varchar not null,
                       weight integer not null

);