CREATE TABLE "tags_books" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE ,
    "book_id" integer NOT NULL ,
    "tag_id" integer NOT NULL
);

CREATE TABLE "authors" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL ,
    "surname" varchar(100) NOT NULL ,
    "country_id" varchar(100) NOT NULL ,
    "birthdate" varchar(100) ,
    "gender" varchar(1) ,
    "about" text
);

CREATE TABLE "languages" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL  UNIQUE
        ON CONFLICT IGNORE
);

CREATE TABLE "countries" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL  UNIQUE
        ON CONFLICT IGNORE
);

CREATE TABLE "users" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL ,
    "surname" varchar(100) NOT NULL ,
    "birth_date" date NOT NULL ,
    "username" varchar(50) NOT NULL ,
    "password" varchar(50) NOT NULL
);

CREATE TABLE "purchases" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "user_id" integer NOT NULL ,
    "book_id" integer NOT NULL ,
    "price" float NOT NULL ,
    "status" varchar(50) NOT NULL  DEFAULT PENDIENTE
);

CREATE TABLE "books" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "isbn" varchar(13) NOT NULL ,
    "title" varchar(100) NOT NULL ,
    "pages" integer NOT NULL,
    "price" float NOT NULL ,
    "publish_date" date ,
    "summary" text,
    "sample" text,
    "author_id" integer NOT NULL,
    "language_id" integer NOT NULL
);

CREATE TABLE "tags" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(70) NOT NULL  UNIQUE
);
