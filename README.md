🏥 Voll.med API

📌 Sobre o projeto

O Voll.med API é uma aplicação back-end desenvolvida em Java com Spring Boot, cujo objetivo é gerenciar as operações de uma clínica médica.

O sistema permite realizar o cadastro e gerenciamento de médicos e pacientes, além de possibilitar o agendamento e o cancelamento de consultas médicas.

A aplicação foi desenvolvida com foco em boas práticas de programação, organização em camadas, segurança, validação de dados e persistência em banco de dados relacional.

O projeto faz parte do meu processo de aprendizado e desenvolvimento na área de Back-end, colocando em prática conceitos importantes do ecossistema Java e Spring.

⚙️ Funcionalidades

Cadastro de médicos: registro de médicos com informações pessoais, especialidade e endereço.

Gerenciamento de médicos: consulta, atualização e exclusão lógica de médicos.

Cadastro de pacientes: registro e gerenciamento de informações dos pacientes.

Agendamento de consultas: permite agendar consultas entre médicos e pacientes.

Cancelamento de consultas: possibilita cancelar consultas previamente agendadas.

Seleção automática de médicos: realiza a escolha de médicos disponíveis conforme a especialidade e a data desejada.

Autenticação: controle de acesso à API por meio de login e tokens JWT.

Validação de dados: utilização de validações para garantir a integridade das informações recebidas.

🛠️ Tecnologias utilizadas

Tecnologia

Finalidade

Java 21

Linguagem de programação

Spring Boot

Desenvolvimento da aplicação

Spring Data JPA

Persistência e consultas ao banco

Spring Security

Segurança e controle de acesso

MySQL 8

Banco de dados relacional

Flyway

Controle de versões e migrações do banco

Maven

Gerenciamento de dependências

JWT

Autenticação baseada em tokens

Hibernate

Mapeamento objeto-relacional

Bean Validation

Validação de dados

🏗️ Arquitetura do projeto

A aplicação segue uma organização em camadas, separando as responsabilidades para facilitar a manutenção e a evolução do código.

Controller: recebe as requisições HTTP e disponibiliza os endpoints da API.

Domain: concentra as regras de negócio e entidades da aplicação.

Repository: responsável pela comunicação e persistência dos dados no banco.

Service: concentra operações e regras de negócio, quando aplicável.

DTO: utilizado para transportar dados entre as requisições e a aplicação.

Security: responsável pela autenticação e autorização dos usuários.

🔐 Segurança

A segurança da aplicação é implementada utilizando Spring Security e JWT.

Principais características:

Autenticação de usuários por login.

Geração e validação de tokens JWT.

Proteção dos endpoints que exigem autenticação.

Controle de acesso às funcionalidades da API.

Configuração de sessões sem estado (Stateless).

🗄️ Banco de dados

O projeto utiliza o MySQL para armazenar as informações de médicos, pacientes, usuários e consultas.

O Flyway é utilizado para controlar as migrações e manter a estrutura do banco de dados versionada.

🚀 Como executar o projeto

1. Pré-requisitos

Antes de iniciar, é necessário ter instalado:

Java JDK 21.

MySQL 8.0 ou superior.

Maven (ou utilizar o Maven Wrapper incluído no projeto).

Git.

2. Clonar o repositório

git clone URL_DO_REPOSITORIO

Entre na pasta do projeto:

cd VollMed-Alura

3. Configurar o banco de dados

Crie um banco de dados MySQL:

CREATE DATABASE vollmed_api;

Configure as variáveis de ambiente necessárias para a conexão com o banco:

DATASOURCE_URL=jdbc:mysql://localhost:3306/vollmed_api
DATASOURCE_USERNAME=root
DATASOURCE_PASSWORD=sua_senha

Configure também a chave secreta utilizada para a geração dos tokens JWT, conforme as propriedades da aplicação.

4. Executar a aplicação

No Windows, utilizando o Maven Wrapper:

.\mvnw.cmd spring-boot:run

Ou, caso tenha o Maven instalado:

mvn spring-boot:run

Após iniciar, a aplicação estará disponível em:

http://localhost:8080

📖 Documentação da API

A documentação dos endpoints pode ser acessada pelo Swagger UI:

http://localhost:8080/swagger-ui/index.html

Por meio dele, é possível visualizar os endpoints disponíveis, consultar os parâmetros necessários e realizar testes nas requisições HTTP.

🎯 Objetivos de aprendizado

Durante o desenvolvimento deste projeto, são trabalhados conceitos importantes para o desenvolvimento Back-end:

Programação orientada a objetos com Java.

Desenvolvimento de APIs REST.

Integração entre Java e MySQL.

Mapeamento objeto-relacional com JPA e Hibernate.

Autenticação e segurança com Spring Security e JWT.

Validação e tratamento de exceções.

Migrações e versionamento de banco de dados.

Organização e manutenção de projetos utilizando boas práticas.

👨‍💻 Autor

Projeto desenvolvido como parte dos estudos em Java e Spring Boot, com foco no aprimoramento das habilidades em desenvolvimento Back-end e construção de APIs REST.
