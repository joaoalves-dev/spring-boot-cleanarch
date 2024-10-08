<h1 align="center">
  Spring Boot Clean Architecture
</h1>

Implementação de arquitetura limpa utilizando Spring Boot.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar

- Clonar repositório git:
```
git clone https://github.com/giuliana-bezerra/spring-boot-cleanarch.git
```
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar ./target/spring-boot-cleanarch-0.0.1-SNAPSHOT.jar
```
- Testar ( com [httppie](https://httpie.io) ):
```
http POST :8080/users username=username password=password email=email
```