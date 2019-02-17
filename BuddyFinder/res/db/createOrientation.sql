CREATE TABLE orientation
  (
    orientation_id   NUMBER(10) NOT NULL,
    orientation_name VARCHAR2(20) NOT NULL,
    CONSTRAINT orientation_pk  primary key (orientation_id)
  );