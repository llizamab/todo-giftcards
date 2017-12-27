
-- Estados
INSERT INTO TBL_ESTADOS (ID_ESTADO, TXT_NOMBRE_ESTADO, TXT_DESCRIPCION_ESTADO) VALUES (1, 'Pendiente', 'Pendiente aprobacion');
INSERT INTO TBL_ESTADOS (ID_ESTADO, TXT_NOMBRE_ESTADO, TXT_DESCRIPCION_ESTADO) VALUES (2, 'Aprobado', 'Aprobado empresa');


-- Empresa
INSERT INTO TBL_EMPRESA (ID_EMPRESA, NOMBRE_EMPRESA, DESCRIPCION, EMAIL, RUT, CELULAR, TELEFONO, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA) 
VALUES (1, 'Empresa1', 'empresa de prueba', 'empresa@jj.cl', '11.111.111-1', '+56912345679', '+5621112424', true, current_date, current_timestamp);


-- Giftcards
INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (1, 1, 'GiftCard 1', 'Tienda xx', 'descripcion', 10000, 12000, 'images/giftcard5.jpg', 'images/giftcard5.jpg', 'images/giftcard5.jpg', true, current_date, current_timestamp);



