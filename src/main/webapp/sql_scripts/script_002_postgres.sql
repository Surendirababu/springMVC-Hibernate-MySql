CREATE TABLE EMPLOYEE(
      id bigserial NOT NULL PRIMARY KEY,
      version INT NOT NULL,
      name VARCHAR(50) NOT NULL,
      joining_date DATE NOT NULL,
      salary double precision NOT NULL,
      ssn VARCHAR(30) NOT NULL UNIQUE
  );