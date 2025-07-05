-- Employee schema
CREATE TABLE department (
    dp_id INT PRIMARY KEY AUTO_INCREMENT,
    dp_name VARCHAR(255)
);

CREATE TABLE employee (
    em_id INT PRIMARY KEY AUTO_INCREMENT,
    em_name VARCHAR(255),
    em_salary DOUBLE,
    em_permanent BOOLEAN,
    em_date_of_birth DATE,
    em_dp_id INT,
    FOREIGN KEY (em_dp_id) REFERENCES department(dp_id)
);

CREATE TABLE skill (
    sk_id INT PRIMARY KEY AUTO_INCREMENT,
    sk_name VARCHAR(255)
);

CREATE TABLE employee_skill (
    es_em_id INT,
    es_sk_id INT,
    PRIMARY KEY (es_em_id, es_sk_id),
    FOREIGN KEY (es_em_id) REFERENCES employee(em_id),
    FOREIGN KEY (es_sk_id) REFERENCES skill(sk_id)
);

-- Quiz schema
CREATE TABLE user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255)
);

CREATE TABLE attempt (
    id INT PRIMARY KEY AUTO_INCREMENT,
    attempted_date DATE,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES user(id)
);

CREATE TABLE question (
    id INT PRIMARY KEY AUTO_INCREMENT,
    text VARCHAR(1000),
    score DOUBLE
);

CREATE TABLE option (
    id INT PRIMARY KEY AUTO_INCREMENT,
    text VARCHAR(255),
    is_correct BOOLEAN,
    score DOUBLE,
    question_id INT,
    FOREIGN KEY (question_id) REFERENCES question(id)
);

CREATE TABLE attempt_question (
    id INT PRIMARY KEY AUTO_INCREMENT,
    attempt_id INT,
    question_id INT,
    FOREIGN KEY (attempt_id) REFERENCES attempt(id),
    FOREIGN KEY (question_id) REFERENCES question(id)
);

CREATE TABLE attempt_option (
    id INT PRIMARY KEY AUTO_INCREMENT,
    attempt_question_id INT,
    option_id INT,
    selected BOOLEAN,
    FOREIGN KEY (attempt_question_id) REFERENCES attempt_question(id),
    FOREIGN KEY (option_id) REFERENCES option(id)
);