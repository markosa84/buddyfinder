create table city (
    city_id number(20) not null,
    city_name varchar(50) not null,
    CONSTRAINT city_pk PRIMARY KEY ( city_id )
);

Insert into city values(1,'Budapest');
Insert into city values(2,'Szeged');
Insert into city values(3,'Debrecen');
Insert into city values(4,'Pécs');
Insert into city values(5,'Miskolc');
Insert into city values(6,'Kecskemét');
Insert into city values(7,'Székesfehérvár');
Insert into city values(8,'Nyíregyháza');
Insert into city values(9,'Győr');
Insert into city values(10,'Szombathely');
Insert into city values(11,'Egyéb');