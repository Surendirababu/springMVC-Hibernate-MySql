CREATE TABLE spring_hibernate_tutorial.EMPLOYEE(
      id INT NOT NULL auto_increment,
      version INT NOT NULL,
      name VARCHAR(50) NOT NULL,
      joining_date DATE NOT NULL,
      salary DOUBLE NOT NULL,
      ssn VARCHAR(30) NOT NULL UNIQUE,
      PRIMARY KEY (id)
  );