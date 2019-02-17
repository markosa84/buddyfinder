--DROP TABLE orientation;

CREATE TABLE orientation (
    orientation_id     NUMBER(10) NOT NULL,
    orientation_name   VARCHAR2(20) NOT NULL,
    CONSTRAINT orientation_pk PRIMARY KEY (orientation_id)
);

INSERT INTO orientation (orientation_id,orientation_name) VALUES (1, 'HETEROSEXUAL');
INSERT INTO orientation (orientation_id,orientation_name) VALUES (2, 'HOMOSEXUAL');
INSERT INTO orientation (orientation_id,orientation_name) VALUES (3, 'BISEXUAL');

COMMIT;