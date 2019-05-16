-- Tipos de titulares

INSERT INTO tipo_titular (id, nombre, habilitado) VALUES (1, 'FISICO', TRUE);
INSERT INTO tipo_titular (id, nombre, habilitado) VALUES (2, 'JURIDICO', TRUE);

-- Titular (Tabla común)

INSERT INTO titular (cuit, tipo, habilitado) VALUES ('20-21321345-9', 1, TRUE);
INSERT INTO titular (cuit, tipo, habilitado) VALUES ('20-21345645-8', 1, TRUE);
INSERT INTO titular (cuit, tipo, habilitado) VALUES ('30-70860396-8', 2, TRUE);

-- Titular físico

INSERT INTO titular_fisico (dni, nombre, apellido, titular_id ) VALUES ('21321345', 'MARIA ANGELA', 'PEREZ POLO', 1);
INSERT INTO titular_fisico (dni, nombre, apellido, titular_id ) VALUES ('21345645', 'RAUL ANTONIO', 'VELEZ VELEZ', 2 );

-- Titular jurídico

INSERT INTO titular_juridico (razon_social, anio_fundacion, titular_id ) VALUES ('TECSO', 2002, 3 );
