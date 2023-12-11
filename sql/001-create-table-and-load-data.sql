DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  gender VARCHAR(10) NOT NULL,
  age INT,
  PRIMARY KEY(id)
);

INSERT INTO users (name, gender, age) VALUES ("ゆうき", "男性", 25);
INSERT INTO users (name, gender, age) VALUES ("たろう", "男性", 30);
INSERT INTO users (name, gender, age) VALUES ("りか", "女性", 22);
