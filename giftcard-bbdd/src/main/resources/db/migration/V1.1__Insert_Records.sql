
-- usuario de prueba
INSERT INTO TBL_USUARIO (ID_USUARIO, USER_NAME, EMAIL, PASSWORD, EMAIL_VALIDO, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (1, 'user1', 'user@gt.cl', 'pItQFfmVcrmP7t3zCfO8RA==', true, true, current_date, current_timestamp);


-- Estados
INSERT INTO TBL_ESTADOS (ID_ESTADO, TXT_NOMBRE_ESTADO, TXT_DESCRIPCION_ESTADO) VALUES (1, 'Borrador', 'En estado de compra pendiente pago usuario');
INSERT INTO TBL_ESTADOS (ID_ESTADO, TXT_NOMBRE_ESTADO, TXT_DESCRIPCION_ESTADO) VALUES (2, 'PendienteAprobacion', 'Pagado por usuario y Pendiente aprobacion empresa');
INSERT INTO TBL_ESTADOS (ID_ESTADO, TXT_NOMBRE_ESTADO, TXT_DESCRIPCION_ESTADO) VALUES (3, 'Aprobado', 'Aprobado empresa');


-- Empresa
INSERT INTO TBL_EMPRESA (ID_EMPRESA, NOMBRE_EMPRESA, DESCRIPCION, EMAIL, RUT, CELULAR, TELEFONO, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA) 
VALUES (1, 'Empresa1', 'empresa de prueba', 'empresa@jj.cl', '11.111.111-1', '+56912345679', '+5621112424', true, current_date, current_timestamp);

INSERT INTO TBL_EMPRESA (ID_EMPRESA, NOMBRE_EMPRESA, DESCRIPCION, EMAIL, RUT, CELULAR, TELEFONO, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA) 
VALUES (2, 'Empresa2', 'empresa de prueba', 'empresa2@jj.cl', '22.111.111-1', '+56912345679', '+5621112424', true, current_date, current_timestamp);


-- Giftcards
INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (1, 1, 'GiftCard 1', '$10.000 en tienda1', 'descripcion', 10000, 10000, 'assets/images/giftcard5.jpg', 'assets/images/giftcard5.jpg', 'assets/images/giftcard5.jpg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (2, 1, 'GiftCard 2', '$5.000 en tienda1', 'descripcion', 4000, 5000, 'assets/images/giftcard3.png', 'assets/images/giftcard3.png', 'assets/images/giftcard3.png', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (3, 2, 'GiftCard 3', '$15.000 en tienda2', 'descripcion blablabla', 4000, 5000, 'assets/images/giftcard4.jpg', 'assets/images/giftcard4.jpg', 'assets/images/giftcard4.jpg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (4, 1, 'GiftCard 4', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/giftcard3.jpg', 'assets/images/giftcard3.jpg', 'assets/images/giftcard3.jpg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (5, 2, 'GiftCard 5', '$1.000 en tienda2', 'descripcion blablabla', 4000, 5000, 'assets/images/giftcard2.jpg', 'assets/images/giftcard2.jpg', 'assets/images/giftcard2.jpg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (6, 1, 'GiftCard 6', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/giftcard2.png', 'assets/images/giftcard2.png', 'assets/images/giftcard2.png', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (7, 1, 'GiftCard 7', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/giftcard.png', 'assets/images/giftcard.png', 'assets/images/giftcard.png', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (8, 1, 'GiftCard 8', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/Woodwe-gift-card.png', 'assets/images/Woodwe-gift-card.png', 'assets/images/Woodwe-gift-card.png', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (9, 1, 'GiftCard 9', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/gift-card.jpg', 'assets/images/gift-card.jpg', 'assets/images/gift-card.jpg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (10, 1, 'GiftCard 10', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/gitfcard1.jpeg', 'assets/images/gitfcard1.jpeg', 'assets/images/gitfcard1.jpeg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (11, 1, 'GiftCard 11', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'assets/images/giftcard6.jpg', 'assets/images/giftcard6.jpg', 'assets/images/giftcard6.jpg', true, current_date, current_timestamp);

INSERT INTO TBL_GIFTCARD (ID_GIFTCARD, ID_EMPRESA, NOMBRE_GIFTCARD, TITULO, DESCRIPCION, VALOR, MONTO, URL_IMAGE_SMALL, URL_IMAGE_MEDIUM, URL_IMAGE_LARGE, ACTIVO, FECHA_ALTA, TIMESTAMP_ALTA)
VALUES (12, 1, 'GiftCard 12', '$1.000 en tienda1', 'descripcion blablabla', 4000, 5000, 'http://placehold.it/700x400', 'http://placehold.it/700x400', 'http://placehold.it/700x400', true, current_date, current_timestamp);






