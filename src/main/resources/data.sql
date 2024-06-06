CREATE DATABASE catalogue_db;
USE catalogue_db;

CREATE TABLE IF NOT EXISTS projects (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    creator_name VARCHAR(100) NOT NULL,
    creator_surname VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    url VARCHAR(255) NOT NULL,
    creation_date DATE NOT NULL,
    tags VARCHAR(255)
);

-- Ajouter des index pour améliorer les performances des requêtes courantes
-- CREATE INDEX idx_title ON projects(title);
--CREATE INDEX idx_creationDate ON projects(creation_date);
--CREATE INDEX idx_tags ON projects(tags);

INSERT INTO projects (title,description,creator_name,creator_surname,email,url,creation_date,tags) VALUES
  ('ActivityFinder', 'Application permettant de poster des annonces d''activités ou d''y participer', 'Ismail', 'M','imerzg@gmail.com','https://gity.fr/activityfinder','2023-01-01','c#,reactjs,javascript,aws,postman'),
  ('Application todo list', 'Notez vos tâches à faire pour ne pas les oublier !', 'Jean', 'Dupont','jeandupont@consultants-solutec.fr','https://gity.com/topics/todolist?l=php','2022-01-01','C#, APS.net, ReactJS, Agile, Jira'),
  ('Migdrive', 'Outils de migration de données de serveurs windows vers google drive', 'Thomas', 'M','tm@gmail.com','https://gity.com/topics/Migdrive','2022-01-01','Powershell, Ansible, Appscript, Javascript, Gitlab CI CD'),
   ('My map', 'Application d''affichage d''objets personnalisés sur une carte', 'Ismail', 'M','imrzg@gmail.com','https://gity.com/topics/Mymap','2020-01-01','VueJS, Javascript, PHP, Laravel, Apache');