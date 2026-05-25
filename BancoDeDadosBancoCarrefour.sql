-- Criação do banco de dados
create database BancoCarrefourDB;
use BancoCarrefourDB;

-- Criação do usuário Administrador
create user 'AdministradorBancoCarrefour'@'localhost' identified by 'Adm@1406';
GRANT ALL PRIVILEGES ON bancocarrefourdb.* TO 'AdministradorBancoCarrefour'@'localhost';

-- Criação do usuário Cliente
create user 'ClienteCarrefour'@'localhost' identified by 'Cliente@1406';
grant select, update on bancocarrefourdb.* to 'ClienteCarrefour'@'localhost';

flush privileges;

-- Criação da tabela Cliente
create table Cliente(
id int(11) not null auto_increment primary key,
CPF varchar(14) not null,
CPFCliente_idCPFCliente int not null,
Telefone varchar(15) not null,
Email varchar(254) not null,
foreign key (CPFCliente_idCPFCliente) references CPFCliente(idCPFCliente)
);

-- Criação da tabela CPFCliente
create table CPFCliente(
idCPFCliente int not null auto_increment primary key,
Score int
);