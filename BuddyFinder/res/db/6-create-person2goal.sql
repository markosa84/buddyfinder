--DROP SEQUENCE person2goal_seq;

--DROP TABLE person2goal;

CREATE TABLE person2goal (
    person2goal_id   NUMBER(20) NOT NULL,
    person_id        NUMBER(20) NOT NULL,
    goal_id          NUMBER(20) NOT NULL,
    CONSTRAINT person2goal_pk PRIMARY KEY (person2goal_id),
    CONSTRAINT person2goal_fk1 FOREIGN KEY (person_id)
        REFERENCES person(person_id),
    CONSTRAINT person2goal_fk2 FOREIGN KEY (goal_id)
        REFERENCES goal(goal_id)
);

CREATE SEQUENCE person2goal_seq;