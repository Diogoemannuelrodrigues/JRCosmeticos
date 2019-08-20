create table pedido
(
    id integer primary key auto_increment,
    quantidade int not null,
    constraint fk_id foreing key (id) references produto (id)
);