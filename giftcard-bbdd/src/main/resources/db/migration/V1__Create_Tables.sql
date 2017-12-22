
-- Tabla de estados
DROP TABLE IF EXISTS TBL_ESTADOS CASCADE;

CREATE TABLE TBL_ESTADOS (
	ID_ESTADO integer PRIMARY KEY NOT NULL,
	TXT_NOMBRE_ESTADO  character varying(250),
	TXT_DESCRIPCION_ESTADO  character varying(500)
);

ALTER TABLE TBL_ESTADOS OWNER TO giftcard;

-- Tabla de usuarios
DROP TABLE IF EXISTS TBL_USUARIO CASCADE;

CREATE TABLE TBL_USUARIO (
	ID_USUARIO integer PRIMARY KEY NOT NULL,
	USER_NAME  character varying(50) NOT NULL,
	EMAIL  character varying(250) NOT NULL,
	PASSWORD  character varying(500) NOT NULL,
	RUT  character varying(20),
	NOMBRES  character varying(500),
	APELLIDOS  character varying(500),
	CELULAR  character varying(20),
	TELEFONO  character varying(20),
	EMAIL_VALIDO boolean,
	ACTIVO boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_USUARIO OWNER TO giftcard;

-- Tabla de cambios historicos de usuarios
DROP TABLE IF EXISTS HIST_USUARIO CASCADE;

CREATE TABLE HIST_USUARIO (
	ID_USUARIO integer,
	ID_USUARIO_CAMBIO integer,
	USER_NAME  character varying(50),
	EMAIL  character varying(250),
	PASSWORD  character varying(500),
	RUT  character varying(20),
	NOMBRES  character varying(500),
	APELLIDOS  character varying(500),
	CELULAR  character varying(20),
	TELEFONO  character varying(20),
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE HIST_USUARIO OWNER TO giftcard;

-- Bitacora de login
DROP TABLE IF EXISTS BIT_LOGIN CASCADE;

CREATE TABLE BIT_LOGIN (
	ID_SESSION integer PRIMARY KEY NOT NULL,
	ID_USUARIO integer NOT NULL REFERENCES TBL_USUARIO (ID_USUARIO),
	TOKEN  character varying(200),
	INICIO_SESION TIMESTAMP,
	EXPIRACION_SESION TIMESTAMP
);

ALTER TABLE BIT_LOGIN OWNER TO giftcard;


-- Tabla de Perfiles
DROP TABLE IF EXISTS TBL_PERFIL CASCADE;

CREATE TABLE TBL_PERFIL (
	ID_PERFIL integer PRIMARY KEY NOT NULL,
	NOMBRE_PERFIL character varying(50) NOT NULL,
	DESCRIPCION character varying(500),
	ACTIVO boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_PERFIL OWNER TO giftcard;

-- Tabla de relacion Perfiles - Usuarios
DROP TABLE IF EXISTS RLC_PERFIL_USUARIO CASCADE;

CREATE TABLE RLC_PERFIL_USUARIO (
	ID_REGISTRO integer PRIMARY KEY NOT NULL,
	ID_PERFIL integer NOT NULL REFERENCES TBL_PERFIL (ID_PERFIL),
	ID_USUARIO integer NOT NULL REFERENCES TBL_USUARIO (ID_USUARIO),
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP
);

ALTER TABLE RLC_PERFIL_USUARIO OWNER TO giftcard;


-- Tabla de Empresa
DROP TABLE IF EXISTS TBL_EMPRESA CASCADE;

CREATE TABLE TBL_EMPRESA (
	ID_EMPRESA integer PRIMARY KEY NOT NULL,
	NOMBRE_EMPRESA  character varying(50) NOT NULL,
	DESCRIPCION  character varying(500),
	EMAIL  character varying(250),
	RUT  character varying(20),
	CELULAR  character varying(20),
	TELEFONO  character varying(20),
	ACTIVO boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_EMPRESA OWNER TO giftcard;

-- Tabla de relacion Empresa - Usuarios
DROP TABLE IF EXISTS RLC_EMPRESA_USUARIO CASCADE;

CREATE TABLE RLC_EMPRESA_USUARIO (
	ID_REGISTRO integer PRIMARY KEY NOT NULL,
	ID_EMPRESA integer NOT NULL REFERENCES TBL_EMPRESA (ID_EMPRESA),
	ID_USUARIO integer NOT NULL REFERENCES TBL_USUARIO (ID_USUARIO),
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP
);

ALTER TABLE RLC_EMPRESA_USUARIO OWNER TO giftcard;


-- Tabla de Giftcard
DROP TABLE IF EXISTS TBL_GIFTCARD CASCADE;

CREATE TABLE TBL_GIFTCARD (
	ID_GIFTCARD integer PRIMARY KEY NOT NULL,
	ID_EMPRESA integer NOT NULL REFERENCES TBL_EMPRESA (ID_EMPRESA),
	NOMBRE_GIFTCARD  character varying(50) NOT NULL,
	TITULO  character varying(100) NOT NULL,
	DESCRIPCION  character varying(2000) NOT NULL,
	VALOR  numeric NOT NULL,
	MONTO  numeric NOT NULL,
	URL_IMAGE_SMALL  character varying(2000),
	URL_IMAGE_MEDIUM  character varying(2000),
	URL_IMAGE_LARGE  character varying(2000),
	ACTIVO boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_GIFTCARD OWNER TO giftcard;

-- Tabla de Categorias
DROP TABLE IF EXISTS TBL_CATEGORIA CASCADE;

CREATE TABLE TBL_CATEGORIA (
	ID_CATEGORIA integer PRIMARY KEY NOT NULL,
	NOMBRE_CATEGORIA  character varying(50) NOT NULL,
	DESCRIPCION  character varying(500),
	ID_CATEGORIA_PADRE integer REFERENCES TBL_CATEGORIA (ID_CATEGORIA), 
	ACTIVO boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_CATEGORIA OWNER TO giftcard;

-- Tabla de relacion Giftcard - Categorias
DROP TABLE IF EXISTS RLC_CATEGORIA_GIFTCARD CASCADE;

CREATE TABLE RLC_CATEGORIA_GIFTCARD (
	ID_REGISTRO integer PRIMARY KEY NOT NULL,
	ID_CATEGORIA integer NOT NULL REFERENCES TBL_CATEGORIA (ID_CATEGORIA),
	ID_GIFTCARD integer NOT NULL REFERENCES TBL_GIFTCARD (ID_GIFTCARD),
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP
);

ALTER TABLE RLC_CATEGORIA_GIFTCARD OWNER TO giftcard;

-- Tabla de Medio de pago
DROP TABLE IF EXISTS TBL_MEDIO_PAGO CASCADE;

CREATE TABLE TBL_MEDIO_PAGO (
	ID_MEDIO_PAGO integer PRIMARY KEY NOT NULL,
	NOMBRE_MEDIO_PAGO  character varying(50) NOT NULL,
	DESCRIPCION  character varying(500), 
	ACTIVO boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_MEDIO_PAGO OWNER TO giftcard;


-- Tabla de Giftcard - compras
DROP TABLE IF EXISTS TBL_GIFTCARD_COMPRA CASCADE;

CREATE TABLE TBL_GIFTCARD_COMPRA (
	ID_COMPRA integer PRIMARY KEY NOT NULL,
	ID_GIFTCARD integer NOT NULL REFERENCES TBL_GIFTCARD (ID_GIFTCARD),
	ID_USUARIO integer NOT NULL REFERENCES TBL_USUARIO (ID_USUARIO),
	ID_ESTADO integer NOT NULL REFERENCES TBL_ESTADOS (ID_ESTADO),
	ID_MEDIO_PAGO integer NOT NULL REFERENCES TBL_MEDIO_PAGO (ID_MEDIO_PAGO),
	NOMBRE_GIFTCARD  character varying(50) NOT NULL,
	TITULO  character varying(100) NOT NULL,
	DESCRIPCION  character varying(2000) NOT NULL,
	VALOR  numeric NOT NULL,
	MONTO  numeric NOT NULL,
	CODIGO  character varying(200) NOT NULL,
	CODIGO_INTERNO character varying(200),
	NOMBRE_DESTINATARIO character varying(50),
	EMAIL_DESTINATARIO character varying(250),
	MENSAJE_DESTINATARIO character varying(1000),
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP,
	FECHA_MODIFICACION DATE,
	TIMESTAMP_MODIFICACION TIMESTAMP
);

ALTER TABLE TBL_GIFTCARD_COMPRA OWNER TO giftcard;


-- Tabla de bitacora de pagos
DROP TABLE IF EXISTS BIT_PAGO CASCADE;

CREATE TABLE BIT_PAGO (
	ID_PAGO integer PRIMARY KEY NOT NULL,
	ID_COMPRA integer NOT NULL REFERENCES TBL_GIFTCARD_COMPRA (ID_COMPRA),
	CODIGO_TRANSACCION  character varying(200) NOT NULL,
	DESCRIPCION  character varying(1000), 
	ERROR boolean,
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP
);

ALTER TABLE BIT_PAGO OWNER TO giftcard;


-- Tabla de bitacora de giftcard
DROP TABLE IF EXISTS BIT_GIFTCARD_COMPRA CASCADE;

CREATE TABLE BIT_GIFTCARD_COMPRA (
	ID_REGISTRO integer PRIMARY KEY NOT NULL,
	ID_COMPRA integer NOT NULL REFERENCES TBL_GIFTCARD_COMPRA (ID_COMPRA),
	ID_ESTADO integer NOT NULL REFERENCES TBL_ESTADOS (ID_ESTADO),
	ID_USUARIO_CAMBIO integer NOT NULL REFERENCES TBL_USUARIO (ID_USUARIO),
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP
);

ALTER TABLE BIT_GIFTCARD_COMPRA OWNER TO giftcard;


-- Tabla de registro de busquedas
DROP TABLE IF EXISTS HIST_BUSQUEDA CASCADE;

CREATE TABLE HIST_BUSQUEDA (
	ID_REGISTRO bigint PRIMARY KEY NOT NULL,
	ID_USUARIO integer,
	BUSQUEDA  character varying(1000), 
	FECHA_ALTA DATE,
	TIMESTAMP_ALTA TIMESTAMP
);

ALTER TABLE HIST_BUSQUEDA OWNER TO giftcard;


