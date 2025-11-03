package qa.main;

public record SQLQueries() {

/*

    CREATE TABLE employee(
            employee_id SERIAL PRIMARY KEY NOT NULL,
            employee_name VARCHAR(100) NOT NULL,
    employee_designation VARCHAR(50) NOT NULL,
    employee_department VARCHAR(50) NOT NULL,
    employee_joining_date DATE NOT NULL,
    employee_salary NUMERIC (10,2) NOT NULL
);


    SELECT * FROM employee;

    INSERT INTO
    employee (employee_name, employee_designation,
              employee_department, employee_joining_date, employee_salary)
    VALUES ('Ajit Sharma', 'SQA Engineer', 'QA', '2025-06-15', 200000.00),
				('Virat Kholi', 'DevOps Engineer', 'DevOps', '2021-03-15', 600000.00),
                        ('Reham Muzamil', 'Lead Software Engineer', 'Backend', '2018-06-15', 455000.00),
                        ('Aliza Hafeez', 'Associate Software Engineer', 'Backend', '2024-06-15', 80000.00),
                        ('Rehan', 'Automation QA Engineer', 'QA', '2023-06-15', 250000.00),
                        ('Syed Ovais Akhtar', 'Senior Software Engineer', 'Mobile', '2024-02-01', 450000.00);


    TRUNCATE TABLE employee;


    TRUNCATE TABLE employee RESTART IDENTITY;




-- =========================================================

    CREATE TABLE employee2(
            employee_id INT PRIMARY KEY NOT NULL,
            employee_name VARCHAR(100) NOT NULL,
    employee_designation VARCHAR(50) NOT NULL,
    employee_department VARCHAR(50) NOT NULL,
    employee_joining_date DATE NOT NULL,
    employee_salary NUMERIC (10,2) NOT NULL
);

    SELECT * FROM employee2;

    INSERT INTO
    employee2 (employee_id, employee_name, employee_designation,
               employee_department, employee_joining_date, employee_salary)
    VALUES (101, 'Ajit Sharma', 'SQA Engineer', 'QA', '2025-06-15', 200000.00),
				(102, 'Virat Kholi', 'DevOps Engineer', 'DevOps', '2021-03-15', 600000.00),
                        (103, 'Reham Muzamil', 'Lead Software Engineer', 'Backend', '2018-06-15', 455000.00),
                        (104, 'Aliza Hafeez', 'Associate Software Engineer', 'Backend', '2024-06-15', 80000.00),
                        (105, 'Rehan', 'Automation QA Engineer', 'QA', '2023-06-15', 250000.00),
                        (106, 'Syed Ovais Akhtar', 'Senior Software Engineer', 'Mobile', '2024-02-01', 450000.00);


-- Row Deletion
    DELETE FROM employee2
    where employee_id = 102;

-- DELETE COLUMN

    ALTER TABLE employee2
    DROP COLUMN employee_salary;

-- Delete TABLE

    DROP TABLE IF EXISTS employee2;

-- dELETE DATABASE

    DROP DATABASE company2;


-- ===========================DAY 06=========================

    CREATE TABLE users (
            user_id INT PRIMARY KEY,
            name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INTEGER CHECK (age >= 18),
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


--INSERTING DATA INTO TABLE - I
    INSERT INTO users (user_id, name, email, age)
    VALUES (1, 'John Doe', 'john.doe@example.com', 25);


-- INSERTING DATA INTO TABLE - II
    INSERT INTO users (user_id, name, email, age)
    VALUES (2, 'John Doe', 'john1.doe@example.com', 19);

-- INSERTING DATA INTO TABLE - II
    INSERT INTO users (user_id, name, email, age)
    VALUES (3, 'John Doe', 'john2.doe@example.com', 18);


    SELECT * FROM users;










*/



}
