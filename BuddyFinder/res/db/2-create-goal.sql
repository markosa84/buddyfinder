--DROP TABLE goal;

CREATE TABLE goal (
    goal_id   NUMBER NOT NULL,
    name      VARCHAR2(30) NOT NULL,
    CONSTRAINT goal_pk PRIMARY KEY ( goal_id )
);

INSERT INTO goal (goal_id, NAME) VALUES (1, 'Egy éjszakás kaland');
INSERT INTO goal (goal_id, NAME) VALUES (2, 'Hosszú távú kapcsolat');
INSERT INTO goal (goal_id, NAME) VALUES (3, 'SzadoMazo');
INSERT INTO goal (goal_id, NAME) VALUES (4, 'Kecske');
INSERT INTO goal (goal_id, NAME) VALUES (5, 'Társasjáték');
INSERT INTO goal (goal_id, NAME) VALUES (6, 'Túra');

COMMIT;