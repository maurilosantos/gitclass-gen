CREATE DATABASE db_escola;

CREATE TABLE tb_estudantes(
	cpf BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    idade BIGINT,
    sexo VARCHAR(255),
    turno VARCHAR(255)
);

-- Inserindo valores:
INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno)
VALUES (22233344411, "Bianca", 22, "Feminino", "Manhã");

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno)
VALUES (66655544433, "Rafael", 18, "Masculino", "Tarde");

ALTER TABLE tb_estudantes
ADD media DECIMAL(8,2);

UPDATE tb_estudantes
SET media = 6.5
WHERE cpf = 22233344411;

UPDATE tb_estudantes
SET media = 8.8
WHERE cpf = 66655544433;

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno, media)
VALUES (99988877766, "Daniela", 17, "Feminino", "Tarde", 7.7);

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno, media)
VALUES (77711199922, "Mariana", 24, "Feminino", "Tarde", 5.6);

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno, media)
VALUES (55599933322, "Camila", 20, "Feminino", "Tarde", 6.6);

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno, media)
VALUES (88899944466, "Gustavo", 23, "Masculino", "Manhã", 9.6);

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno, media)
VALUES (44433388899, "Oscar", 19, "Masculino", "Tarde", 7.6);

INSERT INTO tb_estudantes(cpf, nome, idade, sexo, turno, media)
VALUES (77766655511, "Tamires", 22, "Feminino", "Manhã", 6.6);

SELECT * FROM tb_estudantes WHERE media > 7;
SELECT * FROM tb_estudantes WHERE media < 7;

UPDATE tb_estudantes
SET media = 7.0
WHERE cpf = 77766655511;