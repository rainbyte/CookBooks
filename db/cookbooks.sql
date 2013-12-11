PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE "tags_books" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE ,
    "book_id" integer NOT NULL ,
    "tag_id" integer NOT NULL
);
INSERT INTO "tags_books" VALUES(3,9,11);
INSERT INTO "tags_books" VALUES(4,9,12);
CREATE TABLE "authors" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL ,
    "surname" varchar(100) NOT NULL ,
    "country_id" varchar(100) NOT NULL ,
    "birthdate" date ,
    "gender" varchar(1) ,
    "about" text
);
INSERT INTO "authors" VALUES(1,'Quique','Dacosta','61',1972,'M','null');
INSERT INTO "authors" VALUES(2,'Andoni Luis','Aduriz','61',1971,'M','null');
INSERT INTO "authors" VALUES(3,'Michel','Roux','68',1941,'M','null');
INSERT INTO "authors" VALUES(4,'Marta',' Fernández Guadaño','61',1973,'F','null');
INSERT INTO "authors" VALUES(5,'Camellia','Panjabi','103','null','F','null');
INSERT INTO "authors" VALUES(6,'Terry','Tan','41','null','M','null');
INSERT INTO "authors" VALUES(7,'Judith','Fertig','62','null','F','null');
INSERT INTO "authors" VALUES(8,'Xavier','Barriga','61','null','M','null');
INSERT INTO "authors" VALUES(9,'Harumi','Kurihara','112',NULL,'F','');
CREATE TABLE "languages" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL  UNIQUE
        ON CONFLICT IGNORE
);
INSERT INTO "languages" VALUES(1,'Amhárico');
INSERT INTO "languages" VALUES(3,'Armenio');
INSERT INTO "languages" VALUES(5,'Aymara');
INSERT INTO "languages" VALUES(4,'Azerí');
INSERT INTO "languages" VALUES(6,'Bahasa');
INSERT INTO "languages" VALUES(7,'Bengalí');
INSERT INTO "languages" VALUES(8,'Bielorruso');
INSERT INTO "languages" VALUES(9,'Birmano');
INSERT INTO "languages" VALUES(10,'Bislama');
INSERT INTO "languages" VALUES(11,'Bosnio');
INSERT INTO "languages" VALUES(12,'Bribrí');
INSERT INTO "languages" VALUES(13,'Búlgaro');
INSERT INTO "languages" VALUES(14,'Catalán');
INSERT INTO "languages" VALUES(18,'Chamorro');
INSERT INTO "languages" VALUES(19,'Checo');
INSERT INTO "languages" VALUES(20,'Chibcha');
INSERT INTO "languages" VALUES(21,'Chichewa');
INSERT INTO "languages" VALUES(22,'Chino');
INSERT INTO "languages" VALUES(15,'Cingalés');
INSERT INTO "languages" VALUES(17,'Coreano');
INSERT INTO "languages" VALUES(23,'Creole');
INSERT INTO "languages" VALUES(16,'Croata');
INSERT INTO "languages" VALUES(24,'Danés');
INSERT INTO "languages" VALUES(25,'Divehi');
INSERT INTO "languages" VALUES(26,'Dzongkha');
INSERT INTO "languages" VALUES(27,'Escocés');
INSERT INTO "languages" VALUES(28,'Eslovaco');
INSERT INTO "languages" VALUES(29,'Esloveno');
INSERT INTO "languages" VALUES(30,'Español');
INSERT INTO "languages" VALUES(31,'Estonio');
INSERT INTO "languages" VALUES(32,'Euskera');
INSERT INTO "languages" VALUES(33,'Feroés');
INSERT INTO "languages" VALUES(34,'Filipino');
INSERT INTO "languages" VALUES(35,'Finés');
INSERT INTO "languages" VALUES(36,'Francés');
INSERT INTO "languages" VALUES(37,'Frisón');
INSERT INTO "languages" VALUES(38,'Gagauzo');
INSERT INTO "languages" VALUES(40,'Gallego');
INSERT INTO "languages" VALUES(39,'Galés');
INSERT INTO "languages" VALUES(41,'Georgiano');
INSERT INTO "languages" VALUES(42,'Gibelterse');
INSERT INTO "languages" VALUES(43,'Griego');
INSERT INTO "languages" VALUES(44,'Guaraní');
INSERT INTO "languages" VALUES(45,'Hebreo');
INSERT INTO "languages" VALUES(46,'Hindi');
INSERT INTO "languages" VALUES(47,'Húngaro');
INSERT INTO "languages" VALUES(48,'Inglés');
INSERT INTO "languages" VALUES(49,'Irlandés');
INSERT INTO "languages" VALUES(50,'Islandés');
INSERT INTO "languages" VALUES(51,'Italiano');
INSERT INTO "languages" VALUES(52,'Japonés');
INSERT INTO "languages" VALUES(53,'Jemer');
INSERT INTO "languages" VALUES(54,'Kaqchikel');
INSERT INTO "languages" VALUES(55,'Kazajo');
INSERT INTO "languages" VALUES(56,'Kinyarwanda');
INSERT INTO "languages" VALUES(57,'Kirguís');
INSERT INTO "languages" VALUES(58,'Kirundi');
INSERT INTO "languages" VALUES(59,'Kiswahili');
INSERT INTO "languages" VALUES(60,'Kurdo');
INSERT INTO "languages" VALUES(61,'Lao');
INSERT INTO "languages" VALUES(62,'Latín');
INSERT INTO "languages" VALUES(63,'Letón');
INSERT INTO "languages" VALUES(64,'Lingala');
INSERT INTO "languages" VALUES(65,'Lituano');
INSERT INTO "languages" VALUES(66,'Luxemburgués');
INSERT INTO "languages" VALUES(67,'Macedonio');
INSERT INTO "languages" VALUES(68,'Malayo');
INSERT INTO "languages" VALUES(69,'Maltés');
INSERT INTO "languages" VALUES(70,'Mam');
INSERT INTO "languages" VALUES(71,'Maorí');
INSERT INTO "languages" VALUES(72,'Mapudungun');
INSERT INTO "languages" VALUES(73,'Marshalés');
INSERT INTO "languages" VALUES(74,'Moldavo');
INSERT INTO "languages" VALUES(75,'Mongol');
INSERT INTO "languages" VALUES(76,'Nahuatl');
INSERT INTO "languages" VALUES(77,'Nauruano');
INSERT INTO "languages" VALUES(78,'Neerlandés');
INSERT INTO "languages" VALUES(79,'Nepalí');
INSERT INTO "languages" VALUES(80,'Noruego');
INSERT INTO "languages" VALUES(81,'Panyabí');
INSERT INTO "languages" VALUES(82,'Patois');
INSERT INTO "languages" VALUES(83,'Persa');
INSERT INTO "languages" VALUES(84,'Pocomam');
INSERT INTO "languages" VALUES(85,'Polaco');
INSERT INTO "languages" VALUES(86,'Portugués');
INSERT INTO "languages" VALUES(87,'Q''eqchí');
INSERT INTO "languages" VALUES(88,'Quechua');
INSERT INTO "languages" VALUES(89,'Quiché');
INSERT INTO "languages" VALUES(90,'Retorrománico');
INSERT INTO "languages" VALUES(91,'Rumano');
INSERT INTO "languages" VALUES(92,'Ruso');
INSERT INTO "languages" VALUES(93,'Serbio');
INSERT INTO "languages" VALUES(94,'Sesotho');
INSERT INTO "languages" VALUES(95,'Shona');
INSERT INTO "languages" VALUES(96,'Somalí');
INSERT INTO "languages" VALUES(97,'Sueco');
INSERT INTO "languages" VALUES(99,'Swahili');
INSERT INTO "languages" VALUES(98,'Swati');
INSERT INTO "languages" VALUES(100,'Tailandés');
INSERT INTO "languages" VALUES(101,'Tamil');
INSERT INTO "languages" VALUES(102,'Tayik');
INSERT INTO "languages" VALUES(103,'Tetun');
INSERT INTO "languages" VALUES(104,'Tigriña');
INSERT INTO "languages" VALUES(105,'Tongano');
INSERT INTO "languages" VALUES(106,'Tswana');
INSERT INTO "languages" VALUES(107,'Turco');
INSERT INTO "languages" VALUES(108,'Turcomano');
INSERT INTO "languages" VALUES(109,'Tuvaluano');
INSERT INTO "languages" VALUES(110,'Ucraniano');
INSERT INTO "languages" VALUES(111,'Urdú');
INSERT INTO "languages" VALUES(112,'Uzbek');
INSERT INTO "languages" VALUES(114,'Venda');
INSERT INTO "languages" VALUES(113,'Vietnamita');
INSERT INTO "languages" VALUES(115,'Xinca');
INSERT INTO "languages" VALUES(116,'Zulú');
INSERT INTO "languages" VALUES(2,'Árabe');
CREATE TABLE "countries" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL  UNIQUE
        ON CONFLICT IGNORE
);
INSERT INTO "countries" VALUES(1,'Afganistán');
INSERT INTO "countries" VALUES(2,'Albania');
INSERT INTO "countries" VALUES(3,'Alemania');
INSERT INTO "countries" VALUES(4,'Andorra');
INSERT INTO "countries" VALUES(5,'Angola');
INSERT INTO "countries" VALUES(6,'Anguilla');
INSERT INTO "countries" VALUES(7,'Antigua y Barbuda');
INSERT INTO "countries" VALUES(8,'Antillas Holandesas');
INSERT INTO "countries" VALUES(9,'Arabia Saudí');
INSERT INTO "countries" VALUES(10,'Argelia');
INSERT INTO "countries" VALUES(11,'Argentina');
INSERT INTO "countries" VALUES(12,'Armenia');
INSERT INTO "countries" VALUES(13,'Aruba');
INSERT INTO "countries" VALUES(14,'Australia');
INSERT INTO "countries" VALUES(15,'Austria');
INSERT INTO "countries" VALUES(16,'Azerbayan');
INSERT INTO "countries" VALUES(17,'Bahamas');
INSERT INTO "countries" VALUES(18,'Bahrain');
INSERT INTO "countries" VALUES(19,'Bangladesh');
INSERT INTO "countries" VALUES(20,'Barbados');
INSERT INTO "countries" VALUES(22,'Belice');
INSERT INTO "countries" VALUES(23,'Benin');
INSERT INTO "countries" VALUES(24,'Bermudas');
INSERT INTO "countries" VALUES(25,'Bielorrusia');
INSERT INTO "countries" VALUES(26,'Bolivia');
INSERT INTO "countries" VALUES(27,'Botswana');
INSERT INTO "countries" VALUES(28,'Brasil');
INSERT INTO "countries" VALUES(29,'Brunei');
INSERT INTO "countries" VALUES(30,'Bulgaria');
INSERT INTO "countries" VALUES(31,'Burkina Faso');
INSERT INTO "countries" VALUES(32,'Burma (Myanmar)');
INSERT INTO "countries" VALUES(33,'Burundi');
INSERT INTO "countries" VALUES(34,'Bután');
INSERT INTO "countries" VALUES(21,'Bélgica');
INSERT INTO "countries" VALUES(35,'Cabo Verde');
INSERT INTO "countries" VALUES(36,'Camboya');
INSERT INTO "countries" VALUES(37,'Camerún');
INSERT INTO "countries" VALUES(38,'Canada');
INSERT INTO "countries" VALUES(39,'Chad');
INSERT INTO "countries" VALUES(40,'Chile');
INSERT INTO "countries" VALUES(41,'China');
INSERT INTO "countries" VALUES(42,'Chipre');
INSERT INTO "countries" VALUES(43,'Colombia');
INSERT INTO "countries" VALUES(44,'Comoros');
INSERT INTO "countries" VALUES(45,'Congo');
INSERT INTO "countries" VALUES(46,'Corea del Norte');
INSERT INTO "countries" VALUES(47,'Corea del Sur');
INSERT INTO "countries" VALUES(49,'Costa Rica');
INSERT INTO "countries" VALUES(48,'Costa de Marfil');
INSERT INTO "countries" VALUES(50,'Croacia');
INSERT INTO "countries" VALUES(51,'Cuba');
INSERT INTO "countries" VALUES(52,'Dinamarca');
INSERT INTO "countries" VALUES(53,'Dominica');
INSERT INTO "countries" VALUES(54,'Ecuador');
INSERT INTO "countries" VALUES(55,'Egipto');
INSERT INTO "countries" VALUES(56,'El Salvador');
INSERT INTO "countries" VALUES(57,'Emiratos Arabes Unidos');
INSERT INTO "countries" VALUES(58,'Eritrea');
INSERT INTO "countries" VALUES(59,'Eslovaquia');
INSERT INTO "countries" VALUES(60,'Eslovenia');
INSERT INTO "countries" VALUES(61,'España');
INSERT INTO "countries" VALUES(62,'Estados Unidos');
INSERT INTO "countries" VALUES(63,'Estonia');
INSERT INTO "countries" VALUES(64,'Etiopia');
INSERT INTO "countries" VALUES(65,'Fiji');
INSERT INTO "countries" VALUES(66,'Filipinas');
INSERT INTO "countries" VALUES(67,'Finlandia');
INSERT INTO "countries" VALUES(68,'Francia');
INSERT INTO "countries" VALUES(69,'Gabón');
INSERT INTO "countries" VALUES(70,'Gambia');
INSERT INTO "countries" VALUES(71,'Georgia');
INSERT INTO "countries" VALUES(72,'Ghana');
INSERT INTO "countries" VALUES(73,'Gibraltar');
INSERT INTO "countries" VALUES(74,'Granada');
INSERT INTO "countries" VALUES(75,'Grecia');
INSERT INTO "countries" VALUES(76,'Groenlandia');
INSERT INTO "countries" VALUES(77,'Guadalupe');
INSERT INTO "countries" VALUES(78,'Guam');
INSERT INTO "countries" VALUES(79,'Guatemala');
INSERT INTO "countries" VALUES(80,'Guayana');
INSERT INTO "countries" VALUES(81,'Guayana Francesa');
INSERT INTO "countries" VALUES(82,'Guinea');
INSERT INTO "countries" VALUES(83,'Guinea Ecuatorial');
INSERT INTO "countries" VALUES(84,'Guinea-Bissau');
INSERT INTO "countries" VALUES(85,'Haití');
INSERT INTO "countries" VALUES(86,'Holanda');
INSERT INTO "countries" VALUES(87,'Honduras');
INSERT INTO "countries" VALUES(88,'Hong Kong');
INSERT INTO "countries" VALUES(89,'Hungría');
INSERT INTO "countries" VALUES(90,'I. Caimán');
INSERT INTO "countries" VALUES(91,'I. Cocos (Keeling)');
INSERT INTO "countries" VALUES(92,'I. Cook');
INSERT INTO "countries" VALUES(93,'I. Feroe');
INSERT INTO "countries" VALUES(94,'I. Galápagos');
INSERT INTO "countries" VALUES(95,'I. Malvinas');
INSERT INTO "countries" VALUES(96,'I. Marianas del Norte');
INSERT INTO "countries" VALUES(97,'I. Marshall');
INSERT INTO "countries" VALUES(98,'I. Reunión');
INSERT INTO "countries" VALUES(99,'I. Salomón');
INSERT INTO "countries" VALUES(100,'I. Vírgenes Británicas');
INSERT INTO "countries" VALUES(101,'I. Vírgenes EEUU');
INSERT INTO "countries" VALUES(102,'I. Wallis y Futuna');
INSERT INTO "countries" VALUES(103,'India');
INSERT INTO "countries" VALUES(104,'Indonesia');
INSERT INTO "countries" VALUES(106,'Iraq');
INSERT INTO "countries" VALUES(107,'Irlanda');
INSERT INTO "countries" VALUES(105,'Irán');
INSERT INTO "countries" VALUES(108,'Islandia');
INSERT INTO "countries" VALUES(109,'Israel');
INSERT INTO "countries" VALUES(110,'Italia');
INSERT INTO "countries" VALUES(111,'Jamaica');
INSERT INTO "countries" VALUES(112,'Japón');
INSERT INTO "countries" VALUES(113,'Jordania');
INSERT INTO "countries" VALUES(114,'Kazajistán');
INSERT INTO "countries" VALUES(115,'Kenia');
INSERT INTO "countries" VALUES(116,'Kirguizistán');
INSERT INTO "countries" VALUES(117,'Kiribati');
INSERT INTO "countries" VALUES(118,'Kuwait');
INSERT INTO "countries" VALUES(119,'Laos');
INSERT INTO "countries" VALUES(120,'Lesotho');
INSERT INTO "countries" VALUES(121,'Letonia');
INSERT INTO "countries" VALUES(123,'Liberia');
INSERT INTO "countries" VALUES(125,'Liechtenstein');
INSERT INTO "countries" VALUES(126,'Lituania');
INSERT INTO "countries" VALUES(127,'Luxemburgo');
INSERT INTO "countries" VALUES(122,'Líbano');
INSERT INTO "countries" VALUES(124,'Líbia');
INSERT INTO "countries" VALUES(128,'Macao');
INSERT INTO "countries" VALUES(129,'Macedonia');
INSERT INTO "countries" VALUES(130,'Madagascar');
INSERT INTO "countries" VALUES(131,'Malasia');
INSERT INTO "countries" VALUES(132,'Malawi');
INSERT INTO "countries" VALUES(133,'Maldivas');
INSERT INTO "countries" VALUES(134,'Mali');
INSERT INTO "countries" VALUES(135,'Malta');
INSERT INTO "countries" VALUES(136,'Marruecos');
INSERT INTO "countries" VALUES(137,'Martinica');
INSERT INTO "countries" VALUES(138,'Mauricio');
INSERT INTO "countries" VALUES(139,'Mauritania');
INSERT INTO "countries" VALUES(141,'Micronesia');
INSERT INTO "countries" VALUES(142,'Moldavia');
INSERT INTO "countries" VALUES(144,'Mongolia');
INSERT INTO "countries" VALUES(145,'Montserrat');
INSERT INTO "countries" VALUES(146,'Mozambique');
INSERT INTO "countries" VALUES(140,'México');
INSERT INTO "countries" VALUES(143,'Mónaco');
INSERT INTO "countries" VALUES(147,'Namibia');
INSERT INTO "countries" VALUES(148,'Nauru');
INSERT INTO "countries" VALUES(149,'Nepal');
INSERT INTO "countries" VALUES(150,'Nicaragua');
INSERT INTO "countries" VALUES(152,'Nigeria');
INSERT INTO "countries" VALUES(153,'Noruega');
INSERT INTO "countries" VALUES(154,'Nueva Caledonia');
INSERT INTO "countries" VALUES(155,'Nueva Zelanda');
INSERT INTO "countries" VALUES(151,'Níger');
INSERT INTO "countries" VALUES(156,'Omán');
INSERT INTO "countries" VALUES(157,'Pakistán');
INSERT INTO "countries" VALUES(158,'Palau');
INSERT INTO "countries" VALUES(159,'Panamá');
INSERT INTO "countries" VALUES(160,'Papua Nueva Guinea');
INSERT INTO "countries" VALUES(161,'Paraguay');
INSERT INTO "countries" VALUES(162,'Peru');
INSERT INTO "countries" VALUES(163,'Polinesia Francesa');
INSERT INTO "countries" VALUES(164,'Polonia');
INSERT INTO "countries" VALUES(165,'Portugal');
INSERT INTO "countries" VALUES(166,'Puerto Rico');
INSERT INTO "countries" VALUES(167,'Qatar');
INSERT INTO "countries" VALUES(168,'Reino Unido');
INSERT INTO "countries" VALUES(169,'Rep. Centroafricana');
INSERT INTO "countries" VALUES(170,'Rep. Checa');
INSERT INTO "countries" VALUES(171,'Rep. Dominicana');
INSERT INTO "countries" VALUES(172,'Ruanda');
INSERT INTO "countries" VALUES(173,'Rumania');
INSERT INTO "countries" VALUES(174,'Rusia');
INSERT INTO "countries" VALUES(176,'Samoa');
INSERT INTO "countries" VALUES(177,'San Marino');
INSERT INTO "countries" VALUES(178,'Sao Tomé y Príncipe');
INSERT INTO "countries" VALUES(179,'Senegal');
INSERT INTO "countries" VALUES(180,'Seychelles');
INSERT INTO "countries" VALUES(181,'Sierra Leona');
INSERT INTO "countries" VALUES(182,'Singapur');
INSERT INTO "countries" VALUES(183,'Siria');
INSERT INTO "countries" VALUES(184,'Somalia');
INSERT INTO "countries" VALUES(185,'Sri Lanka');
INSERT INTO "countries" VALUES(186,'St. Vicent y Grenadines');
INSERT INTO "countries" VALUES(187,'St.Kitts & Nevis');
INSERT INTO "countries" VALUES(188,'Sudán');
INSERT INTO "countries" VALUES(189,'Suecia');
INSERT INTO "countries" VALUES(190,'Suiza');
INSERT INTO "countries" VALUES(191,'Sur Georgia e I. Sandwich');
INSERT INTO "countries" VALUES(193,'Surinam');
INSERT INTO "countries" VALUES(192,'Suráfrica');
INSERT INTO "countries" VALUES(194,'Swazilandia');
INSERT INTO "countries" VALUES(175,'Sáhara Occidental');
INSERT INTO "countries" VALUES(195,'Tailandia');
INSERT INTO "countries" VALUES(196,'Taiwán');
INSERT INTO "countries" VALUES(197,'Tajikistán');
INSERT INTO "countries" VALUES(198,'Tanzania');
INSERT INTO "countries" VALUES(199,'Togo');
INSERT INTO "countries" VALUES(200,'Tonga');
INSERT INTO "countries" VALUES(201,'Trinidad y Tobago');
INSERT INTO "countries" VALUES(203,'Turkmenistán');
INSERT INTO "countries" VALUES(204,'Turquia');
INSERT INTO "countries" VALUES(205,'Tuvalu');
INSERT INTO "countries" VALUES(202,'Túnez');
INSERT INTO "countries" VALUES(206,'Ucrania');
INSERT INTO "countries" VALUES(207,'Uganda');
INSERT INTO "countries" VALUES(208,'Uruguay');
INSERT INTO "countries" VALUES(209,'Uzbekistán');
INSERT INTO "countries" VALUES(210,'Vanuatu');
INSERT INTO "countries" VALUES(211,'Vaticano');
INSERT INTO "countries" VALUES(212,'Venezuela');
INSERT INTO "countries" VALUES(213,'Vietnam');
INSERT INTO "countries" VALUES(214,'Yemen');
INSERT INTO "countries" VALUES(215,'Yibuti');
INSERT INTO "countries" VALUES(216,'Yugoslavia');
INSERT INTO "countries" VALUES(217,'Zaire');
INSERT INTO "countries" VALUES(218,'Zambia');
INSERT INTO "countries" VALUES(219,'Zimbabwe');
CREATE TABLE "users" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(100) NOT NULL ,
    "surname" varchar(100) NOT NULL ,
    "birth_date" date ,
    "email" varchar(100) NOT NULL  UNIQUE
		ON CONFLICT IGNORE ,
    "password" varchar(50) NOT NULL ,
    "province" varchar(50) NOT NULL ,
    "city" varchar(50) NOT NULL ,
    "street" varchar(50) NOT NULL ,
    "nro" integer NOT NULL ,
    "floor" integer ,
    "dept" varchar(1) ,
    "postal_code" integer NOT NULL ,
    "phone" varchar(13) NOT NULL ,
    "card_number" varchar(16) NOT NULL ,
    "card_code" varchar(4) NOT NULL ,
    "is_admin" tinyint NOT NULL
        DEFAULT 0
);
INSERT INTO "users" VALUES(1,'Alejandro','Martínez',NULL,'usuario@dominio.com','1234','Buenos Aires','Domselaar','San Martín',302,0,NULL,1984,'02225491066','1111111111111111','ato3',0);
INSERT INTO "users" VALUES(2,'Alejandro','Martínez',NULL,'usuariow@dominio.com','1234','Buenos Aires','Domselaar','San Martín',302,0,NULL,1984,'02225491066','1111111111111111','ato3',0);
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
    "isbn" varchar(13) NOT NULL  UNIQUE
		ON CONFLICT IGNORE ,
    "title" varchar(100) NOT NULL ,
    "pages" integer NOT NULL,
    "price" float NOT NULL ,
    "publish_date" date ,
    "summary" text,
    "sample" text,
    "author_id" integer NOT NULL,
    "language_id" integer NOT NULL,
    "image_path" varchar(255) NOT NULL
);
INSERT INTO "books" VALUES(1,'9dh329rn3dbu','Ingenieria de Software 9ed',700,500.0,NULL,NULL,NULL,2,0,'');
INSERT INTO "books" VALUES(2,'s8dahdsodhas98','Sistemas Operativos',0,70.0,NULL,NULL,NULL,3,0,'');
INSERT INTO "books" VALUES(5,'ddfdsdfjds8jd9j','Geometria Analitica',0,100.0,NULL,'','',6,0,'');
INSERT INTO "books" VALUES(6,'84-253-3882-4','La Cocina Japonesa de Harumi',165,300.0,NULL,'','',7,0,'');
INSERT INTO "books" VALUES(7,'84-253-3882-5','La Cocina Japonesa de Harumi (Version Extendida)',200,300.0,NULL,'','',8,0,'');
INSERT INTO "books" VALUES(9,'84-253-3882-8','La Cocina Japonesa de Harumi',165,300.0,NULL,'','',9,52,'/home/rainbyte/equiv.jpeg');
CREATE TABLE "tags" (
    "id" integer PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE
        ON CONFLICT IGNORE ,
    "name" varchar(70) NOT NULL  UNIQUE
);
INSERT INTO "tags" VALUES(1,'Aperitivos y entradas');
INSERT INTO "tags" VALUES(4,'Arroces y pasta');
INSERT INTO "tags" VALUES(8,'Carnes');
INSERT INTO "tags" VALUES(11,'Comida Japonesa');
INSERT INTO "tags" VALUES(2,'Ensaladas');
INSERT INTO "tags" VALUES(6,'Guisos y verduras');
INSERT INTO "tags" VALUES(10,'Light y dieteticas');
INSERT INTO "tags" VALUES(5,'Marisco');
INSERT INTO "tags" VALUES(7,'Pescados');
INSERT INTO "tags" VALUES(9,'Postres');
INSERT INTO "tags" VALUES(3,'Sopas y cremas');
INSERT INTO "tags" VALUES(12,'Sushi');
DELETE FROM sqlite_sequence;
INSERT INTO "sqlite_sequence" VALUES('countries',220);
INSERT INTO "sqlite_sequence" VALUES('authors',9);
INSERT INTO "sqlite_sequence" VALUES('languages',117);
INSERT INTO "sqlite_sequence" VALUES('books',9);
INSERT INTO "sqlite_sequence" VALUES('tags',12);
INSERT INTO "sqlite_sequence" VALUES('users',2);
INSERT INTO "sqlite_sequence" VALUES('tags_books',4);
COMMIT;
