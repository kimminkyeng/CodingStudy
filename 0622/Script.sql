--<ScriptOptions statementTerminator=";"/>

CREATE TABLE bookorder (
	idx INT NOT NULL,
	mid VARCHAR(20) NOT NULL,
	pwd VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL,
	address VARCHAR(20) NOT NULL,
	Book VARCHAR(20) NOT NULL,
	PRIMARY KEY (idx)
) ENGINE=InnoDB;

CREATE TABLE hoewonpra (
	idx INT NOT NULL,
	mid VARCHAR(20) NOT NULL,
	pwd VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL,
	PRIMARY KEY (idx)
) ENGINE=InnoDB;

CREATE TABLE membertest (
	m_id VARCHAR(20) NOT NULL,
	pwd VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL,
	age INT DEFAULT 20 NOT NULL,
	gender CHAR(2) DEFAULT m NOT NULL,
	birthday DATETIME NOT NULL,
	address VARCHAR(50) NOT NULL
) ENGINE=InnoDB;

