# Sistema de Gerenciamento de Missões Ninja
Repositório destinado ao projeto da disciplina de POO, 4º Semestre da FATEC Mogi das Cruzes

## Identidade visual do projeto:
### 1. Home:
![Home Screen](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Home.png?raw=true)

### 1.1 Submenu Ninja:
![Home Screen Submenu1](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Home-submenu.png?raw=true)

### 1.2 Submenu Missão:
![Home Screen Submenu2](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Home-submenu2.png?raw=true)

### 2. Cadastro Ninja:
![Cadastro Screen Ninja](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Cadastro-Ninja.png?raw=true)

### 2.1 Cadastro Missão:
![Cadastro Screen Missao](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Cadastro-Miss%C3%A3o.png?raw=true)

### 3. Exibir Registro Ninjas:
![Exibir Screen Ninjas](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Exibir-Ninjas.png?raw=true)

### 3.1 Exibir Registro Missões
![Exibir Screen Missões](https://github.com/RRugnA/Gerenciamento-Ninja/blob/master/public/readme_images/Exibir-Miss%C3%B5es.png?raw=true)

## Objetivo:
- Criação de um sistema de gerenciamento de missões

## Funcionalidades:
- CRUD padrão para as classes Ninja e Missão
- Conexão com banco de dados Mysql
- Sistema de Login (falta implementar)

## Linguagem:
- Java

## Banco de Dados:
- MySql

## Servidor:
- Tomcat v9

## Como rodar o projeto:
- Após compilar o projeto com a ide e subir no servidor, acesse localhost:8080/SGMN/?action=Home
- Necessário importar o dump do banco de dados para correto funcionamento do CRUD (nome do db utilizado no projeto: "sgmn")
- Após a importação do dump, configurar a classe ConnectionFactory dentro da package "connection" com as configurações do seu banco (login/senha, nome do db e porta).
