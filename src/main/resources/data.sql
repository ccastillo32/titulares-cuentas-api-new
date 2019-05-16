-- Tipos de titulares

INSERT INTO tipo_titular (id, nombre, habilitado) VALUES (1, 'FISICO', TRUE);
INSERT INTO tipo_titular (id, nombre, habilitado) VALUES (2, 'JURIDICO', TRUE);

-- Titular (Tabla común)

--INSERT INTO titular (cuit, tipo) VALUES ('20-21321345-9', 1);
--INSERT INTO titular (cuit, tipo) VALUES ('20-21345645-8', 1);
--INSERT INTO titular (cuit, tipo) VALUES ('30-70860396-8', 2);

-- Titular físico

--INSERT INTO titular_fisico (id, cuit, dni, nombre, apellido ) VALUES (1, '20-21321345-9', '21321345', 'MARIA ANGELA', 'PEREZ POLO' );
--INSERT INTO titular_fisico (id, cuit, dni, nombre, apellido ) VALUES (2, '20-21345645-8', '21345645', 'RAUL ANTONIO', 'VELEZ VELEZ' );

-- Titular jurídico

--INSERT INTO titular_juridico (id, cuit, razon_social, anio_fundacion ) VALUES (3, '30-70860396-8', 'TECSO', 2002 );
