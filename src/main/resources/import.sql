-- Inserir categorias
INSERT INTO tb_category (name) VALUES ('Limpeza');
INSERT INTO tb_category (name) VALUES ('Alimentos');
INSERT INTO tb_category (name) VALUES ('Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Roupas');

-- Inserir produtos
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Detergente', 5.0, 100, 1);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Sabão em Pó', 10.0, 50, 1);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Arroz', 8.0, 200, 2);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Feijão', 6.0, 150, 2);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('TV LED 50"', 1500.0, 10, 3);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Notebook', 2500.0, 5, 3);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Camiseta Branca', 20.0, 30, 4);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Calça Jeans', 50.0, 20, 4);

-- Inserir mais produtos
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Pano de Limpeza', 2.5, 200, 1);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Desinfetante', 7.0, 80, 1);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Macarrão', 4.0, 120, 2);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Óleo de Cozinha', 5.0, 150, 2);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Fone de Ouvido', 50.0, 15, 3);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Monitor 27"', 800.0, 8, 3);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Tênis Esportivo', 80.0, 25, 4);
INSERT INTO tb_product (name, product_value, quantity, category_id) VALUES ('Camisa Social', 30.0, 20, 4);

-- Adicione mais produtos conforme necessário

