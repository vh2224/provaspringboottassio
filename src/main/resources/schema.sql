CREATE TABLE produto
(
    id                        INT          NOT NULL,
    nome                      VARCHAR(100) NOT NULL,
    descricao                 VARCHAR(100) NOT NULL,
    foto_url                  VARCHAR(500),
    data_cadastro             DATE,
    hora_cadastro             TIME,
    data_hora_ultima_att      TIMESTAMP,
    valor_unitario            FLOAT(5.2)
);
