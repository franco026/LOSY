DROP TABLE if exists usuario cascade;
CREATE TABLE usuario (
    codigo integer NOT NULL,
    nombre_usuario character varying(30) NOT NULL,
    apellido character varying(30) NOT NULL,
    cargo character varying(30) NOT NULL,
    correo character varying(30) NOT NULL,
    proyecto character varying(30) NOT NULL,
    pregunta varchar(30),
    respuesta varchar(30),
    telefono integer,
    cedula integer,
    estado Varchar(30) NOT NULL,
    constraint usuario_pk primary key(codigo)
);

INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto,respuesta , telefono, cedula,estado) VALUES (1629083, 'Andres', 'Puerta', 'Director de laboratorio', 'andres.puerta@', 'Master','hola', 3548725, 32465,'Activo');
INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula,estado) VALUES (1234, 'Luna', 'Toro', 'Miembro de laboratorio', 'lunat@', 'ninguno', 31175, 32465,'Activo');
INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula,estado) VALUES (666, 'King', 'Kong', 'Coordinador de Equipos', 'kk@', 'Master', 31175, 32465,'Activo');
INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula,estado) VALUES (456, 'Prueba', 'Dos', 'Director de proyectos', 'p2@', 'Master', 3117725, 32465,'Activo');
INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula,estado) VALUES (879, 'conan', 'nemia', 'Miembro de laboratorio', 'asdas@', 'Master', 318725, 32465,'Activo');

DROP SEQUENCE if exists equipos_seq;
CREATE SEQUENCE equipos_seq
	INCREMENT BY 1
	NO MAXVALUE
	NO MINVALUE
	CACHE 1;

DROP TABLE if exists equipos cascade;
CREATE TABLE equipos (
    numero_equipo integer DEFAULT nextval('equipos_seq'::regclass) NOT NULL,
    nombre_equipo character varying(30) NOT NULL,
    marca integer NOT NULL,
    descripcion character varying(100) NOT NULL,
    estado character varying(20) NOT NULL,
    estado_equipo varchar(30) NOT NULL,
    constraint equipos_pk primary key(numero_equipo)
    
);


INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor1', 20, 'TV 20 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor2', 21, 'TV 21 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor3', 22, 'TV 22 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor4', 23, 'TV 23 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor5', 24, 'TV 24 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor6', 25, 'TV 25 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor7', 26, 'TV 26 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor8', 27, 'TV 27 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor9', 28, 'TV 28 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor10', 29, 'TV 29 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Televisor11', 30, 'TV 30 pulgadas', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Play Station', 120, 'PS2', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Play Station', 121, 'PS3', 'Disponible','Activo');
INSERT INTO equipos (nombre_equipo, marca, descripcion, estado,estado_equipo) Values ('Play Station', 122, 'PS4', 'Disponible','Activo');

DROP SEQUENCE if exists proyectos_seq cascade;
CREATE SEQUENCE proyectos_seq
	INCREMENT BY 1
	NO MAXVALUE
	NO MINVALUE
	CACHE 1;

DROP TABLE if exists proyectos cascade;
CREATE TABLE proyectos (
    id_proyecto integer DEFAULT nextval('proyectos_seq'::regclass) NOT NULL,
    nombre_proyecto character varying(30) NOT NULL,
    descripcion character varying(100) NOT NULL,
    codigo_director integer NOT NULL,
    estado Varchar(30) NOT NULL,
    constraint proyectos_pk primary key(id_proyecto),
    constraint proyectos_usuario_fk foreign key(codigo_director) references usuario(codigo)
);

INSERT INTO proyectos (nombre_proyecto, descripcion, codigo_director,estado) VALUES ('Proyecto de merda', 'PM', 1629083,'Activo');
INSERT INTO proyectos (nombre_proyecto, descripcion, codigo_director,estado) VALUES ('Prueva 0.1', 'prueba nn', 1234,'Activo');
INSERT INTO proyectos (nombre_proyecto, descripcion, codigo_director,estado) VALUES ('Mi proyecto', 'Brutal legends', 666,'Activo');


DROP TABLE if exists multa cascade;
CREATE TABLE multa(
	Codigo_Usuario Integer NOT NULL,
	Valor Integer NOT NULL,
	Constraint multa_pk primary key(Codigo_Usuario),
	constraint multa_usuario_fk foreign key(Codigo_Usuario) references usuario(codigo)
);

DROP SEQUENCE if exists prestamo_seq cascade;
CREATE SEQUENCE prestamo_seq
	INCREMENT BY 1
	NO MAXVALUE
	NO MINVALUE
	CACHE 1;


DROP TABLE if exists prestamo cascade;
CREATE TABLE prestamo (
	id integer not null,
    codigo_usuario integer NOT NULL,
    numero_equipo integer NOT NULL,
    fecha_prestamo date ,
    fecha_devolucion date ,
    estado varchar(30),
    constraint prestamo_pk primary key(id,codigo_usuario, numero_equipo),
    constraint prestamo_equipos_fk foreign key(numero_equipo) references equipos(numero_equipo),
    constraint prestamo_usuario_fk foreign key(codigo_usuario) references usuario(codigo)
);

DROP TABLE if exists cuenta cascade;
CREATE TABLE cuenta(
Codigo_Usuario Integer NOT NULL,
Password varchar(30) NOT NULL,
constraint cuenta_usuario_fk foreign key(Codigo_Usuario) references Usuario(codigo)
);

INSERT INTO cuenta VALUES(1629083, 'A1629083P');
INSERT INTO cuenta VALUES(1234, 'L1234T');
INSERT INTO cuenta VALUES(666, 'K666K');
INSERT INTO cuenta VALUES(456, 'P456D');
INSERT INTO cuenta VALUES(879, 'C879N');


DROP TABLE if exists reserva cascade;
CREATE TABLE reserva(
	codigo_usuario integer NOT NULL,
    numero_equipo integer NOT NULL,
    fecha_reserva date NOT NULL,
    constraint reserva_pk primary key(codigo_usuario, numero_equipo, fecha_reserva),
    constraint reserva_equipos_fk foreign key(numero_equipo) references equipos(numero_equipo),
    constraint reserva_usuario_fk foreign key(codigo_usuario) references usuario(codigo)
);

CREATE TABLE reserva(
	codigo_usuario integer NOT NULL,
    numero_equipo integer NOT NULL,
    fecha_reserva date NOT NULL,
    constraint reserva_pk primary key(codigo_usuario, numero_equipo, fecha_reserva),
    constraint reserva_equipos_fk foreign key(numero_equipo) references equipos(numero_equipo),
    constraint reserva_usuario_fk foreign key(codigo_usuario) references usuario(codigo)
);

CREATE TABLE limite_renovar(
	codigo_usuario integer NOT NULL,
    numero_equipo integer NOT NULL,
    limite integer NOT NULL,
    fecha_renovacion date NOT NULL,
    constraint limite_renovar_pk primary key(codigo_usuario, numero_equipo),
    constraint limite_renovar_equipos_fk foreign key(numero_equipo) references equipos(numero_equipo),
    constraint limite_renovar_usuario_fk foreign key(codigo_usuario) references usuario(codigo)
);
	
