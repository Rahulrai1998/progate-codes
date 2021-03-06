PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE "schema_migrations" ("version" varchar NOT NULL PRIMARY KEY);
INSERT INTO "schema_migrations" VALUES('20170512024421');
CREATE TABLE "ar_internal_metadata" ("key" varchar NOT NULL PRIMARY KEY, "value" varchar, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL);
INSERT INTO "ar_internal_metadata" VALUES('environment','development','2018-08-15 08:41:12.922341','2018-08-15 08:41:12.922341');
CREATE TABLE "posts" ("id" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "content" text, "created_at" datetime NOT NULL, "updated_at" datetime NOT NULL);
INSERT INTO "posts" VALUES(1,'What should I read next?','2018-08-15 08:41:31.359981','2018-08-15 08:41:31.359981');
INSERT INTO "posts" VALUES(2,'Lunch was great today.','2018-08-15 08:41:56.934885','2018-08-15 08:41:56.934885');
INSERT INTO "posts" VALUES(3,'Studying Rails!','2018-08-15 08:42:28.130301','2018-08-15 08:42:28.130301');
DELETE FROM sqlite_sequence;
INSERT INTO "sqlite_sequence" VALUES('posts',3);
COMMIT;
