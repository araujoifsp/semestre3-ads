drop database if exists quiz;

create database quiz;

use quiz;

drop table if exists pontuacao;

CREATE TABLE pontuacao (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome_jogador varchar(50),
  q1 char(1),
  q2 char(1),
  q3 char(1),
  q4 char(1),
  total int
);
