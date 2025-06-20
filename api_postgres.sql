INSERT INTO countries (code, name)VALUES ('BRA','Brasil')

insert into cities (name, state, country_id)Values('Barbosa Ferraz', 'PR', 1);
select *from cities

INSERT INTO zip_code (code) values ('86960000')
select *from zip_code

INSERT INTO address (street, city_id, zipcode_id)VALUES('Av, Castro Alves', 1, 1);
SELECT *FROM address

INSERT INTO persons (age, name, address_id) VALUES (50, 'João da Silva', 1);
SELECT *FROM persons

INSERT INTO branchs (address, fantasy_name, license, name, phone_number, person_id)VALUES(
'Av, Castro Alves', 'Loja de Teste', 'xxxxxx', 'Empresa Me teste', '44988521033', 2);
SELECT *FROM branchs;

-- Reset da tabela no Postgres.
ALTER SEQUENCE tbl_id_seq RESTART WITH 1;