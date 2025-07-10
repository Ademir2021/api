## Geração da Build com Spring-boot
## Se você usa Maven (pom.xml):

- Abra o terminal na raiz do seu projeto.
- Execute: `mvn clean package`
 isso vai limpar os builds antigos (clean)
 e empacotar o projeto (package),
 gerando um .jar (ou .war se configurado) na pasta target.

Resultado esperado:
Um arquivo como este será gerado:
`java -jar target/seu-projeto-0.0.1-SNAPSHOT.jar`

Para rodar o build:
`java -jar build/libs/seu-projeto-0.0.1-SNAPSHOT.jar`

