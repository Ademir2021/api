#!/bin/bash
echo "Iniciando Build do projeto"
mvn clean package
echo 'Removendo build OLD'
rm ../../projects/app-sale-build/api/*.jar
echo 'OLD build removida'
cp -rf target/api-0.0.1-SNAPSHOT.jar ../../projects/app-sale-build/api/api-0.0.1-SNAPSHOT.jar
echo 'NEW build criada'
echo 'sucess'
echo 'Fim ...'