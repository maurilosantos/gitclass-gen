CREATE DATABASE db_ecommerce;

-- criando a tabela 
CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    valor DECIMAL(8,2),
    categoria VARCHAR(255),
    fornecedor VARCHAR(255)
);

-- Inserindo valores:

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("The Witcher 3: Wild Hunt", 119.99, "Aventura", "PS4");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("Red Dead Redemption 2", 199.99, "Ação", "Rockstar Games");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("Grand Theft Auto V", 399.99, "Ação", "Rockstar Games");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("Destiny 2", 599.99, "Ficção Científica", "PS4");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES (" Forza Horizon 5", 260.99, "Corrida", "PS4");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("Halo Infinite", 609.99, "Ficção Científica", "Xbox");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("Mortal Kombat 11", 709.99, "Luta", "Xbox");

INSERT INTO tb_produtos(nome, valor, categoria, fornecedor)
VALUES ("Gears 5", 809.99, "Tiro", "Xbox");
-- retornando valores maires que 500 ou menor:
SELECT * FROM tb_produtos WHERE valor > 500;
SELECT * FROM tb_produtos WHERE valor < 500;

UPDATE tb_produtos
SET valor = 600.00
WHERE id = 3;

SELECT * FROM tb_produtos;
