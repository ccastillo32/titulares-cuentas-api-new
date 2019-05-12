-- Tipos de titulares

INSERT INTO tipo_titular (id, nombre, habilitado) VALUES (1, 'FISICO', TRUE);
INSERT INTO tipo_titular (id, nombre, habilitado) VALUES (2, 'JURIDICO', TRUE);

-- Titular (Tabla común)

INSERT INTO titular (cuit, tipo, habilitado ) VALUES ('20-21321345-9', 1, TRUE );
INSERT INTO titular (cuit, tipo, habilitado ) VALUES ('21-2134564-8', 1, TRUE );
INSERT INTO titular (cuit, tipo, habilitado ) VALUES ('30-70860396-8', 2, TRUE );

-- Titular físico

INSERT INTO titular_fisico (cuit, dni, nombre, apellido ) VALUES ('20-21321345-9', '21321345', 'MARIA ANGELA', 'PEREZ POLO' );
INSERT INTO titular_fisico (cuit, dni, nombre, apellido ) VALUES ('21-2134564-8', '2134564', 'RAUL ANTONIO', 'VELEZ VELEZ' );

-- Titular jurídico

INSERT INTO titular_juridico (cuit, razon_social, anio_fundacion ) VALUES ('30-70860396-8', 'TECSO', 2002 );
