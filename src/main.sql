CREATE TABLE Car(
    id VARCHAR(255) PRIMARY KEY,
    nickname VARCHAR(64),
    speed INTEGER,
    productionYear INTEGER
);

INSERT INTO Car
VALUES ('1', 'supercar', '250', '2023');

SELECT productionYear,
    COUNT(*) AS 'years'
FROM Car
GROUP BY productionYear;

SELECT *
FROM Car
WHERE speed > 200;

SELECT nickname,
    speed
FROM Car
WHERE nickname != NULL;