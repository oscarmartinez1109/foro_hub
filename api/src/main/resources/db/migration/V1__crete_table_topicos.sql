create table topicos
(

    id bigint not null auto_increment,
    id_Usuario varchar(100) not null,
    mensaje varchar(100) not null unique,
    nombre_Curso varchar(6) not null unique,
    titulo varchar(100) not null,

    primary key (id)

)