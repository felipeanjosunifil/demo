create table usuarios(
    id varchar(255) not null primary key,
    nome varchar(50) not null,
    email varchar(60) not null,
    senha varchar(30) not null,
    dataNascimento varchar (10) not null
)