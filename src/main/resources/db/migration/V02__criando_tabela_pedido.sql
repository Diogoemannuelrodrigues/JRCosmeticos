create table pedido(
    id integer primary key auto_increment,
    quantidade int not null,
    id_produto integer,
    constraint fk_id_produto foreign key (id_produto) references produto (id)
);