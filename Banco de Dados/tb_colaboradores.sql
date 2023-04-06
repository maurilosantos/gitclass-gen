CREATE DATABASE db_rh;

CREATE TABLE tb_colaboradores (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30),
    idade INT(2),
    salario DECIMAL(6,2),
    cargo VARCHAR(255)
    
);

INSERT INTO tb_colaboradores(nome,idade,salario,cargo)
VALUES("Aline",26, 1000.99,"Desenvolvedora");

SELECT * FROM tb_colaboradores;
SELECT * FROM tb_colaboradores WHERE salario > 2000;
SELECT * FROM tb_colaboradores WHERE salario < 2000;
-- atualizando dados:
UPDATE tb_colaboradores
SET salario = 5001.99
WHERE id=2;
