-- Criando o banco de dados db_generation_game_online.
CREATE DATABASE db_generation_game_online;

-- Conectando com o banco de dados db_generation_game_online.
USE db_generation_game_online;

-- Criando a tabela tb_classes e determinando pelo menos 2 atributos.
CREATE TABLE tb_classes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR (200),
    nivel int (5)
);

-- Criando a tabela tb_personagens e determinando 4 atributos.
CREATE TABLE tb_personagens(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    classe_id BIGINT, -- declarando a p campo que entrará a chave estrangeira
    nome VARCHAR (200),
    nick_name VARCHAR (200),
    defesa INT (5),
    ataque INT (5),
    FOREIGN KEY (classe_id) REFERENCES tb_classes(id)  -- declarando a chave estrangeira
);

-- Insira 5 registros na tabela tb_classes
INSERT INTO tb_classes (descricao, nivel) VALUES ("Fácil",1);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Moderado",2);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Desafiante",3);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Difícil",4);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Muito Difícil",5);

-- Validando a tabela
SELECT * FROM tb_classes;

-- Insira 8 registros na tabela tb_personagens.
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (1,"MAURILO", "bob", 20000, 8000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (2,"ADRIANE", "liza", 3543, 9000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (3,"BIA", "coringa", 3234, 7000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (4,"JACQUE", "fofa", 67543, 6000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (5,"LUIS", "povo", 1000, 10000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (5,"LUCAS", "lula", 222, 6580);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (4,"JANILSON", "dimmy", 9765, 3000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (3,"MARIANA", "monica", 322, 9874);

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_personagens;

-- Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000.
SELECT * FROM tb_personagens WHERE ataque > 2000;

-- Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

-- Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
SELECT * FROM tb_personagens WHERE nome LIKE "%c%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes.
SELECT a.nome, a.nick_name, a.defesa, a.ataque
FROM tb_personagens a 
INNER JOIN tb_classes b ON a.classe_id = b.id;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, 
-- onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).
SELECT a.nome, a.nick_name, a.defesa, a.ataque,
	b.id, b.descricao, b.nivel
FROM tb_personagens a 
INNER JOIN tb_classes b ON a.classe_id = b.id
WHERE b.id = 5;

