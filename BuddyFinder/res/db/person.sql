DROP TABLE person;

DROP SEQUENCE person_seq;

CREATE TABLE person (
    person_id        NUMBER(20) NOT NULL,
    gender           CHAR(1) NOT NULL,
    user_name        VARCHAR2(20) NOT NULL,
    email            VARCHAR2(100) NOT NULL,
    date_of_birth    DATE,
    orientation_id   NUMBER(20) NOT NULL,
    last_online      TIMESTAMP,
    smoker           CHAR(1),
    status           CHAR(1) NOT NULL,
    city_id          NUMBER(20),
    introduction     VARCHAR2(4000),
    CONSTRAINT person_pk PRIMARY KEY ( person_id ),
    CONSTRAINT person_fk1 FOREIGN KEY ( orientation_id )
        REFERENCES orientation ( orientation_id ),
    CONSTRAINT person_fk2 FOREIGN KEY ( city_id )
        REFERENCES city ( city_id ),
    CONSTRAINT person_ck1 CHECK ( smoker IS NULL
                                  OR smoker IN (
        'Y',
        'N'
    ) ),
    CONSTRAINT person_ck2 CHECK ( status IN (
        'A',
        'D'
    ) )
);

CREATE SEQUENCE person_seq;