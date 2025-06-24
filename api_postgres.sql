-- Primeiro insira um users;

INSERT INTO countries (code, name)VALUES ('BRA','Brasil')

insert into cities (name, state, country_id)Values('Barbosa Ferraz', 'PR', 1);
insert into cities (name, state, country_id)Values('Corumbatai do Sul', 'PR', 1);
insert into cities (name, state, country_id)Values('Fenix', 'PR', 1);
select *from cities;

INSERT INTO zip_code (code, city_id) values ('86960000', 1);
INSERT INTO zip_code (code, city_id) values ('86970000', 2);
INSERT INTO zip_code (code, city_id) values ('86950000', 3);
select *from zip_code;

INSERT INTO branchs (address, fantasy_name, license, name, phone_number, person_id)VALUES(
'Av, Castro Alves', 'Loja Modelo 1', 'xxxxxx', 'Empresa Modelo 1', '44988521033', 2);
SELECT *FROM branchs;

INSERT INTO address (
  street, number, neighbor, complement, person_id, zipcode_id)
  VALUES
  ('Av, Castro Alves', '1241', 'Centro', 'Casa', 1, 1);
INSERT INTO address (
  street, number, neighbor, complement, person_id, zipcode_id)
  VALUES
  ('Rua das Antas', '86', 'Centro', 'Casa', 2, 2);
INSERT INTO address (
  street, number, neighbor, complement, person_id, zipcode_id)
  VALUES
  ('Rua Avelino das Torres', '350', 'Interior', 'Casa', 3, 3);
SELECT *FROM address;



-- Reset da tabela no Postgres.
ALTER SEQUENCE tbl_id_seq RESTART WITH 1;