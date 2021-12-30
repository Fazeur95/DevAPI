DROP TABLE IF EXISTS articles;

DROP TABLE IF EXISTS categories;

DROP TABLE IF EXISTS comments;

DROP TABLE IF EXISTS users;

CREATE TABLE articles (
  article_id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  content TEXT NOT NULL,
  date DATE NOT NULL,
  id_author INT NOT NULL
);

INSERT INTO
  articles (title, content,date, id_author)
VALUES
  (
    'Mbappé, le PSG y croit toujours',
    'Sous contrat avec le PSG ...',
    '2019-06-26',
    1
  ),
  (
    'Épiphanie 2022 : les meilleures brioches et galettes des Rois',
    'Après les bûches de Noël et autres gourmandises...',
    '2019-06-26',
    2
  ),
  (
    'Ces doudounes qui donnent de l''allure',
    'La doudoune bien choisie ne nous donne pas des allures de Bibendum...',
    '2019-06-26',
    1
  );

CREATE TABLE comments (
  id INT AUTO_INCREMENT PRIMARY KEY,
  content VARCHAR(250) NOT NULL,
  id_article INT(250)
);

INSERT INTO
  comments (content, id_article)
VALUES
  ('trop bien', 1),
  ('trop cool', 1),
  ('useless', 3);

CREATE TABLE categories (
  category_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO
  categories (name)
VALUES
  ('sport'),
  ('cuisine'),
  ('mode');

CREATE TABLE category_article (
  category_id INT NOT NULL,
  article_id INT NOT NULL
);

INSERT INTO
  category_article (category_id, article_id)
VALUES
  (1, 1),
  (2, 2),
  (3, 3);

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255),
  password VARCHAR(255)
);

INSERT INTO
  users (username, password)
VALUES
  (
    'user',
    '$2a$12$3QJUKRUlH6eOldgAeEhBXuVXnFYcdG9L6TeJ8Dtw726lmYrFPomgW'
  ),
  (
    'admin',
    '$2a$12$hJuHwAbUTK77f5iv51yRLeUjot6rL4pwzJNC3u4K2wQSSho1CjBla'
  );