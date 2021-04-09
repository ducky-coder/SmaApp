DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Matches;
DROP TABLE IF EXISTS Characters;

CREATE TABLE IF NOT EXISTS Users(
    id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL,
    password VARCHAR(250) NOT NULL,
    admin Boolean NOT NULL,
    rate INT NOT NULL,
    matching_status int NOT NULL,
    main_character_id int NOT NULL,
    sub1_character_id int,
    sub2_character_id int,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Matches(
    id INT AUTO_INCREMENT NOT NULL,
    user_id int NOT NULL,
    opponent_id int NOT NULL,
    status_code int NOT NULL,
    used_character1_id int NOT NULL,
    used_character2_id int,
    used_character3_id int,
    opponent_character1_id int NOT NULL,
    opponent_character2_id int,
    opponent_character3_id int,
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS Characters(
    id INT AUTO_INCREMENT NOT NULL,
    character_name VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO smabro_app_db.Users (name, password, admin, matching_status, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser1", "testPassword", false, 1, 1500, 1, 2, 3);

INSERT INTO Users (name, password, admin, matching_status, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser2", "testPassword", false, 0, 1600, 3, 2, 1);

INSERT INTO Users (name, password, admin, matching_status, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser3", "testPassword", false, 1, 1700, 3, 2, 1);

INSERT INTO Users (name, password, admin, matching_status, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser4", "testPassword", false, 2, 1800, 3, 2, 1);

INSERT INTO Users (name, password, admin, matching_status, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser5", "testPassword", false, 1, 1650, 3, 2, 1);

INSERT INTO Users (name, password, admin, matching_status, rate, main_character_id, sub1_character_id, sub2_character_id)
VALUES ("testUser6", "testPassword", false, 1, 1550, 3, 2, 1);
