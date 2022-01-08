DROP TABLE IF EXISTS articles;

DROP TABLE IF EXISTS categories;

DROP TABLE IF EXISTS comments;

DROP TABLE IF EXISTS users;

CREATE TABLE articles (
  article_id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  content TEXT NOT NULL,
  date VARCHAR(250) NOT NULL,
  id_author INT NOT NULL
);

INSERT INTO
  articles (title, content,date, id_author)
VALUES
  (
    'Mbappé, le PSG y croit toujours',
    'C''est un feuilleton qui n''en finit pas. Déjà au cœur des rumeurs l''été dernier, Kylian Mbappé n''a toujours pas prolongé son contrat au PSG qui s''achève le 30 juin. Par conséquent, il est libre de discuter avec le club de son choix depuis le 1er janvier en vue d''une arrivée l''été prochain. Mais comme ce feuilleton n''en est pas à son premier rebondissement, l''agent italien Giovanni Branchini a révélé dans les colonnes de La Gazzetta dello Sport que « ces jours-ci, le Real Madrid est revenu à la charge pour obtenir Mbappé immédiatement et a offert 50 millions d''euros. »',
    '2019-06-26',
    1
  ),
  (
    'Épiphanie 2022 : les meilleures brioches et galettes des Rois',
    'Après les bûches de Noël et autres gourmandises, vient le tour de la traditionnelle période des galettes des Rois. Si tous les ans, les pâtissiers redoublent de créativité pour surprendre nos papilles, 2022 n’échappe pas à la règle. Acidulée, fruitée ou chocolatée, chacun y va de sa particularité. Cyril Lignac opte pour une brioche des Rois à la fleur d’oranger, aux oranges confites, avec pistaches et noisettes. Lenôtre rejoint cette idée de brioche fruitée en ajoutant une crème de citron et un confit de mandarine. Mais la nuance avec une touche de soleil tout droit venu d’Aix-en-Provence avec sa pâte façon calisson.',
    '2019-06-26',
    2
  ),
  (
    'Ces doudounes qui donnent de l''allure',
    'La doudoune bien choisie ne nous donne pas des allures de Bibendum. Au contraire, elle peut nous ériger en reine du style tout en nous préservant du froid. Une valeur sûre pour laquelle on signe tout de suite. Cette année, pas de grands changements en vue si ce n''est que l''on ose un peu plus la couleur. En revanche, longue ou courte, c''est à votre guise. Il ne vous reste plus qu''à choisir votre modèle sur le site de LUISAVIAROMA. En attendant, voici notre sélection de pièces coup de cœur et nos astuces pour bien les porter.',
    '2019-06-26',
    1
  );

CREATE TABLE comments (
  comment_id INT AUTO_INCREMENT PRIMARY KEY,
  content VARCHAR(250) NOT NULL,
  author INT NOT NULL,
  date DATE NOT NULL,
  article_id INT(250)
);

INSERT INTO
  comments (content, author, date, article_id)
VALUES
  ('trop bien', 1, '2021-12-31', 1),
  ('trop cool', 1, '2021-12-31', 1),
  ('useless', 1, '2021-12-31', 3);

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