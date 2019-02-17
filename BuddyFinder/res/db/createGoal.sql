--DROP TABLE goal;

CREATE TABLE goal (
    goal_id   NUMBER NOT NULL,
    name      VARCHAR2(30) NOT NULL,
    CONSTRAINT goal_pk PRIMARY KEY ( goal_id )
);