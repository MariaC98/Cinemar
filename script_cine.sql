create database cinemar;
use cinemar;

create table formato_p(id_formato int primary key,
 nombre_formato varchar(2),
 precio_formato double );

create table pelicula (id_pelicula int primary key ,
titulo_pelicula varchar (30) ,
duracion_pelicula time , 
categoria_pelicula varchar (10), 
sinopsis_pelicula varchar(150), 
id_formato int , 
foreign key (id_formato)references formato_p (id_formato));

alter table pelicula add column id_sala int;

alter table usuario add column tiene_tarj_usuario boolean;

alter table pelicula ADD FOREIGN KEY (id_sala)
        REFERENCES sala(id_sala);

create table tipo_usuario(
id_tipo_usuario int primary key,
nombre_tipo varchar(10),
rol varchar (40));

create table usuario(id_usuario int primary key,
nombre_usuario varchar(15),
apellido_usuario varchar(15),
email_usuario varchar(20),
contrasenia_usuario varchar(8),
id_tipo_usuario int,
 foreign key (id_tipo_usuario)
references tipo_usuario (id_tipo_usuario));

create table descuentos( id_desc int primary key,
dia_desc varchar (10),
porcentaje_desc int );

create table reserva (id_reserva int primary key,
fecha_reserva date, 
total double, 
id_desc int,
id_pelicula int,
id_usuario int, 
foreign key (id_desc) references descuentos(id_desc),
foreign key (id_usuario) references usuario(id_usuario),
foreign key (id_pelicula) references pelicula (id_pelicula)
);

create table sala(id_sala int primary key,
nombre_sala varchar (10),
capacidad_sala int,
id_pelicula int,
descripcion varchar(50),
horario time,
dia varchar(10),
foreign key (id_pelicula)references pelicula (id_pelicula));

create table butaca(id_butaca int primary key,
fila_butaca char , columna int,
id_sala int , foreign key (id_sala) references sala(id_sala));

/*agregando elementos a mi base de datos*/

use cinemar;

insert into tipo_usuario values(1,"cliente","usuario externo");
insert into tipo_usuario values(2,"admin","usuario interno");

insert into usuario values(1,"Juan","Perez","juan_p@gmail.com","juan321",1,true); 
insert into usuario values(2,"Maria","Gonzalez","maria@gmail.com","maria321",1,true);
insert into usuario values(3,"Joaquin","Ramirez","juako10@gmail.com","joako321",1,true);
insert into usuario values(4,"Alejandra","Nuñez","ale98@gmail.com","ale98",1,true);   
insert into usuario values(5,"Maria","Colque","MariaMilP@gmail.com","password",2,false);  /*unica admin!!*/
insert into usuario values(6,"Jose","Martinez","jose_m@gmail.com","1234",1,true);

insert into formato_p values(1,'2D',500);
insert into formato_p values(2,'3D',700);

insert into pelicula values (1,"Jurasic world","02:30:00","accion","es una pelicula de dinosaurios",2);
insert into pelicula values (2, "Lightyear", "01:40:00","Aventuras","Es la pelicula de Buzz Lightyear",1);




