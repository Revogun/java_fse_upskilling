-- Country table (assumes table name 'country' with code and name)
INSERT INTO country (co_code, co_name) VALUES
('BV', 'Bouvet Island'),
('DJ', 'Djibouti'),
('GP', 'Guadeloupe'),
('GS', 'South Georgia and the South Sandwich Islands'),
('LU', 'Luxembourg'),
('SS', 'South Sudan'),
('TF', 'French Southern Territories'),
('UM', 'United States Minor Outlying Islands'),
('ZA', 'South Africa'),
('ZM', 'Zambia'),
('ZW', 'Zimbabwe');

-- Department
INSERT INTO department (dp_name) VALUES
('Engineering'),
('Marketing'),
('Human Resources');

-- Skill
INSERT INTO skill (sk_name) VALUES
('Java'),
('Spring Boot'),
('SQL');

-- Employee
INSERT INTO employee (em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id) VALUES
('Alice', 50000.0, true, '1990-05-21', 1),
('Bob', 60000.0, false, '1985-03-15', 2),
('Charlie', 75000.0, true, '1988-10-30', 1);

-- Employee-Skill relationships
INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES
(1, 1), (1, 2),
(2, 2),
(3, 1), (3, 2), (3, 3);

-- Sample Stock entries
INSERT INTO stock (st_code, st_date, st_open, st_close, st_volume) VALUES
('FB', '2019-09-03', 184.00, 182.39, 9779400),
('FB', '2019-09-04', 184.65, 187.14, 11308000),
('GOOGL', '2019-04-22', 1236.67, 1253.76, 954200),
('GOOGL', '2019-04-23', 1256.64, 1270.59, 1593400),
('NFLX', '2018-12-24', 242.00, 233.88, 9547600),
('NFLX', '2018-12-21', 263.83, 246.39, 21397600);