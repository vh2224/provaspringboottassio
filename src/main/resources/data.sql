INSERT INTO produto(id, nome, descricao, foto_url, data_cadastro, hora_cadastro, data_hora_ultima_att, valor_unitario)
VALUES (1, 'Tenis', 'Tenis NIke', 'https://www.wikihow.com/images/1/1d/Spot-Fake-Nikes-Step-10-Version-2.jpg', '2021-09-23', '14:23:22', CURRENT_TIMESTAMP(), '127.90');

INSERT INTO produto(id, nome, descricao, foto_url, data_cadastro, hora_cadastro, data_hora_ultima_att, valor_unitario)
VALUES (2, 'Tenis', 'Tenis Adidas', 'https://www.wikihow.com/images/1/1d/', '2021-09-23', '14:23:22', CURRENT_TIMESTAMP(), '327.90');

INSERT INTO categoria(id, imagem_simbolo_url, nome, descricao)
VALUES (1, 'https://www.wikihow.com/images/1/1d/Spot-Fake-Nikes-Step-10-Version-2.jpg', 'Tenis', 'Tenis Casual');

INSERT INTO categoria(id, imagem_simbolo_url, nome, descricao)
VALUES (2, 'https://www.wikihow.com/images/1/1d/Spot-Fake-Nikes-Step-10-Version-2.jpg', 'Tenis', 'Tenis Corrida');

INSERT INTO produto_categoria(id, produto_id, categoria_id)
VALUES (1, 1, 1);

INSERT INTO produto_categoria(id, produto_id, categoria_id)
VALUES (2, 2, 2);