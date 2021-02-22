INSERT INTO users(id, name, email, password) VALUES
 (1, 'A_Teacher', 'a_teacher@gmail.com', 'abc@123'),
 (2, 'B_Teacher', 'b_teacher@gmail.com', 'abc@123'),
 (3, 'C_Student', 'c_student@gmail.com', 'abc@123'),
 (4, 'D_Student', 'd_student@gmail.com', 'abc@123');

INSERT INTO teachers(id, phone, experiences) VALUES
 (1, '0978999888', 5),
 (2, '0988888888', 7);

INSERT INTO students(id, year) VALUES
 (3, 2020),
 (4, 2021);

INSERT INTO courses(id, teacher_id, name, description, location, opened) VALUES
 (1, 1, 'English', 'English for children', 'Ha Noi', '2021-01-10'),
 (2, 1, 'French', 'French for children', 'Da Nang', '2021-01-11'),
 (3, 2, 'Japanese', 'Japanese for children', 'Ho Chi Minh', '2021-02-20');