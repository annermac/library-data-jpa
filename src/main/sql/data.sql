INSERT INTO Person(fio, birthday) VALUES ('Иванов Иван Иванович', '14/12/1990');
INSERT INTO Person(fio, birthday) VALUES ('Кириллов Сергей Михайлович', '03/11/1996');
INSERT INTO Person(fio, birthday) VALUES ('Романова Надежда Леонидовна', '06/02/2000');

INSERT INTO Book(person_id, title, author, year, taken_at) VALUES (1, 'Чистый код. Создание, анализ и рефакторинг', 'Роберт Мартин', 2016, '10/08/2023 12:00:00');
INSERT INTO Book(person_id, title, author, year, taken_at) VALUES (1, 'Java. Руководство для начинающих', 'Герберт Шилдт', 2018, '12/07/2023 09:56:00');
INSERT INTO Book(person_id, title, author, year, taken_at) VALUES (2, 'Spring быстро', 'Спилкэ Л.', 2022, '01/08/2023 18:02:03');
INSERT INTO Book(person_id, title, author, year, taken_at) VALUES (3, 'Spark в действии', 'Жан-Жорж Перрен', 2021, '13/08/2023 08:12:55');