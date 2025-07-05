-- Employee data
INSERT INTO department (dp_name) VALUES ('IT');
INSERT INTO department (dp_name) VALUES ('HR');

INSERT INTO employee (em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id) 
VALUES ('John Doe', 50000, true, '1990-01-01', 1);
INSERT INTO employee (em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id) 
VALUES ('Jane Smith', 60000, true, '1985-05-15', 2);
INSERT INTO employee (em_name, em_salary, em_permanent, em_date_of_birth, em_dp_id) 
VALUES ('Bob Johnson', 45000, false, '1995-08-20', 1);

INSERT INTO skill (sk_name) VALUES ('Java');
INSERT INTO skill (sk_name) VALUES ('Spring');
INSERT INTO skill (sk_name) VALUES ('Hibernate');
INSERT INTO skill (sk_name) VALUES ('Communication');

INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES (1, 1);
INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES (1, 2);
INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES (2, 4);
INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES (3, 1);
INSERT INTO employee_skill (es_em_id, es_sk_id) VALUES (3, 3);

-- Quiz data
INSERT INTO user (username) VALUES ('testuser');

INSERT INTO attempt (attempted_date, user_id) VALUES ('2023-05-01', 1);

INSERT INTO question (text, score) VALUES ('What is the extension of the hyper text markup language file?', 1.0);
INSERT INTO question (text, score) VALUES ('What is the maximum level of heading tag can be used in a HTML page?', 1.0);
INSERT INTO question (text, score) VALUES ('The HTML document itself begins with <html> and ends </html>. State True of False', 1.0);
INSERT INTO question (text, score) VALUES ('Choose the right option to store text value in a variable', 1.0);

-- Options for Question 1
INSERT INTO option (text, is_correct, score, question_id) VALUES ('.xhtm', false, 0.0, 1);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('.ht', false, 0.0, 1);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('.html', true, 1.0, 1);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('.htmx', false, 0.0, 1);

-- Options for Question 2
INSERT INTO option (text, is_correct, score, question_id) VALUES ('5', false, 0.0, 2);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('3', false, 0.0, 2);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('4', false, 0.0, 2);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('6', true, 1.0, 2);

-- Options for Question 3
INSERT INTO option (text, is_correct, score, question_id) VALUES ('false', false, 0.0, 3);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('true', true, 1.0, 3);

-- Options for Question 4
INSERT INTO option (text, is_correct, score, question_id) VALUES ('\'John\'', true, 0.5, 4);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('John', false, 0.0, 4);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('"John"', false, 0.5, 4);
INSERT INTO option (text, is_correct, score, question_id) VALUES ('/John/', false, 0.0, 4);

-- Attempt Questions
INSERT INTO attempt_question (attempt_id, question_id) VALUES (1, 1);
INSERT INTO attempt_question (attempt_id, question_id) VALUES (1, 2);
INSERT INTO attempt_question (attempt_id, question_id) VALUES (1, 3);
INSERT INTO attempt_question (attempt_id, question_id) VALUES (1, 4);

-- Attempt Options (user selections)
INSERT INTO attempt_option (attempt_question_id, option_id, selected) VALUES (1, 3, true);
INSERT INTO attempt_option (attempt_question_id, option_id, selected) VALUES (2, 4, true);
INSERT INTO attempt_option (attempt_question_id, option_id, selected) VALUES (3, 2, true);
INSERT INTO attempt_option (attempt_question_id, option_id, selected) VALUES (4, 1, true);
INSERT INTO attempt_option (attempt_question_id, option_id, selected) VALUES (4, 3, false);