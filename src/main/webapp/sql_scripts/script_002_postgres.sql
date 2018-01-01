CREATE TABLE EMPLOYEE(
      id bigserial NOT NULL PRIMARY KEY,
      version INT NOT NULL,
      name VARCHAR(50) NOT NULL,
      joining_date DATE NOT NULL,
      salary double precision NOT NULL,
      ssn VARCHAR(30) NOT NULL UNIQUE
  );


 CREATE TABLE userdetail(
      id int NOT NULL PRIMARY KEY,
      user_name VARCHAR(50) NOT NULL,
      password VARCHAR(50) NOT NULL,
      email VARCHAR(50) NOT NULL
  );

  CREATE TABLE roledetail(
      id int NOT NULL PRIMARY KEY,
      role_name VARCHAR(50) NOT NULL,
       user_id int not null
  );

  insert into userdetail (id,user_name,password,email) values
  (1,'babu','babu636009','babu@hotmail.com')

   insert into userdetail (id,user_name,password,email) values
  (2,'suren','suren36009','suren@hotmail.com')

  insert into roledetail (id,role_name,user_id) values
    (1,'admin',1)
