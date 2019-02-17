--DROP TABLE city;

CREATE TABLE city (
    city_id     NUMBER(20) NOT NULL,
    city_name   VARCHAR(50) NOT NULL,
    CONSTRAINT city_pk PRIMARY KEY (city_id)
);

INSERT INTO city VALUES(1, 'Budapest');
INSERT INTO city VALUES(2, 'Szeged');
INSERT INTO city VALUES(3, 'Debrecen');
INSERT INTO city VALUES(4, 'Pécs');
INSERT INTO city VALUES(5, 'Miskolc');
INSERT INTO city VALUES(6, 'Kecskemét');
INSERT INTO city VALUES(7, 'Székesfehérvár');
INSERT INTO city VALUES(8, 'Nyíregyháza');
INSERT INTO city VALUES(9, 'Győr');
INSERT INTO city VALUES(10, 'Szombathely');
INSERT INTO city VALUES(11, 'Egyéb');