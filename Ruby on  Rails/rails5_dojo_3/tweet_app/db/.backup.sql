PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "schema_migrations" ("version" varchar NOT NULL PRIMARY KEY);
INSERT INTO schema_migrations VALUES('20170331045923');
INSERT INTO schema_migrations VALUES('20170418070645');
INSERT INTO schema_migrations VALUES('20200531010523');
INSERT INTO schema_migrations VALUES('20200531015252');
CREATE TABLE IF NOT EXISTS "ar_internal_metadata" ("key" varchar NOT NULL PRIMARY KEY, "value" varchar, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL);
INSERT INTO ar_internal_metadata VALUES('environment','development','2017-03-31 05:21:00.324397','2017-03-31 05:21:00.324397');
CREATE TABLE IF NOT EXISTS "posts" ("id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "content" text, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL);
INSERT INTO posts VALUES(1,'I wonder what I should read next...','2017-03-31 05:24:15.529063','2017-03-31 05:24:15.529063');
INSERT INTO posts VALUES(2,'Lunch was delicious today!','2017-03-31 05:24:32.004378','2017-03-31 05:24:32.004378');
CREATE TABLE IF NOT EXISTS "users" ("id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "name" varchar, "email" varchar, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL, "image_name" varchar, "password" varchar);
INSERT INTO users VALUES(1,'RAHUL KUMAR','rahulrai2822march@gmail.com','2020-05-31 01:20:19.934562','2020-05-31 01:20:19.934562','default_user.jpg',NULL);
INSERT INTO users VALUES(2,'RAHUL KUMAR','parveenyasmin.315','2020-05-31 11:24:52.361389','2020-05-31 11:24:52.361389','default_user.jpg','aa');
DELETE FROM sqlite_sequence;
INSERT INTO sqlite_sequence VALUES('posts',2);
INSERT INTO sqlite_sequence VALUES('users',2);
COMMIT;
