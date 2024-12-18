# CRUD Mapstruct
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma aplicação de CRUD (Create, Read, Update, Delete) de usuários, implementada utilizando MapStruct para conversão de uma Entity para um DTO (Data Transfer Object). A aplicação utiliza o Swagger para documentar e realizar as requisições, além de contar com um banco de dados MySQL rodando em um container Docker.

# Funcionalidades
- Cadastro de Usuários: Criação de um novo usuário com informações como nome, email e senha.
- Leitura de Usuários: Recuperação dos dados de um ou mais usuários cadastrados.
- Edição de Usuários: Alteração das informações de um usuário existente.
- Remoção de Usuários: Exclusão de usuários do sistema.
- MapStruct: Utilizado para mapear os dados entre a Entity e o DTO, facilitando a comunicação entre as camadas da aplicação.
- Swagger: Utilizado para documentar e testar as APIs de forma interativa.
- Banco de Dados: MySQL armazenando as informações de usuários em um container Docker.

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Docker
- Swagger
- Banco de dados: MySQL

# Como executar o projeto

## Back end
### Pré-requisitos: 
Java 17
Maven
Docker
MySQL (em container Docker)

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/crud-mapstruct.git

# entrar na pasta do projeto back end
cd crud-mapstruct

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
