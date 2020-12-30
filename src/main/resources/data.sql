DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL,
  email  VARCHAR(250) DEFAULT NULL,
  phone VARCHAR(250) DEFAULT NULL
);

INSERT INTO customers (first_name, last_name, career,email,phone) VALUES
  ('Aliko', 'Dangote', 'Industrialist','alkDan@gamil.com','11223344'),
  ('Bill', 'Gates', 'Tech Entrepreneur','biil@gmail.com','22334455'),
  ('Folrunsho', 'Alakija', 'Oil Magnate','folAlak@gmail.com','33445566');