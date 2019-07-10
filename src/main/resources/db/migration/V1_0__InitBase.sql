DROP TABLE IF EXISTS utilisateur;
CREATE SEQUENCE ID_SEQ;

CREATE TABLE utilisateur (
  ido    INTEGER NOT NULL PRIMARY KEY DEFAULT nextval('id_seq'),
  pseudo    VARCHAR(50) NOT NULL,
  email    VARCHAR(100) NOT NULL,
  motDePasse    VARCHAR(128) NOT NULL,
  dateInscription    VARCHAR(128)
);
