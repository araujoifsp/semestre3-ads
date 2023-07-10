use test;

create table produtos(
	referencia varchar(3) primary key,
    descricao varchar(50) unique,
    estoque int not null default 0
);

insert into produtos values ('001','Feijao',10);
insert into produtos values ('002','Arroz',5);
insert into produtos values ('003','Farinha',15);

create table itensvenda(
	venda int,
    produto varchar(3),
    quantidade int
);


delimiter $

create trigger tgr_itensvenda_insert after insert
on itensvenda
for each row
begin
	update produtos set estoque = estoque - new.quantidade
where referencia = new.produto;
end$


create trigger tgr_itensvenda_delete after delete
on itensvenda
for each row
begin
	update produtos set estoque = estoque + old.quantidade
where referencia = old.produto;
end$

delimiter ;

insert into itensvenda values(1,'001',3);
insert into itensvenda values(1,'002',1);
insert into itensvenda values(1,'003',5);

select * from itensvenda;

select * from produtos


