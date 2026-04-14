# 📌 Sessões de Estudo

## 📖 Descrição

Este projeto é um sistema desenvolvido para registrar e visualizar sessões de estudo. Seu principal objetivo é facilitar o acompanhamento do progresso nos estudos. O projeto foi criado puramente com fins de aprendizado e desenvolvimento de habilidades, sendo estruturado segundo os princípios da Arquitetura Limpa (Clean Architecture) para garantir um código organizado, modular e facilmente testável.

---

## ⚙️ Tecnologias

* Java
* Spring Boot
* H2 Database (por enquanto)

---

## 🚀 Funcionalidades

O sistema realiza as seguintes operações:
* Criação de sessões de estudo.
* Listagens e visualização do histórico de sessões

---

## 💻 Como rodar o projeto

Passos para executar a aplicação em sua máquina local:

* Clonar o repositório:
  ```bash
  git clone <url-do-repositorio>
  ```
* Acessar a pasta do projeto:
  ```bash
  cd studySession
  ```
* Instalar dependências e compilar o projeto (utilizando Maven):
  ```bash
  mvn clean install
  ```
* Rodar o projeto:
  ```bash
  mvn spring-boot:run
  ```
*(O banco de dados H2 opera em memória por padrão, não sendo necessária instalação adicional de SGBD)*

---

## 📁 Estrutura

O projeto foi dividido em camadas de acordo com os conceitos de Clean Architecture, organizando as pastas da seguinte maneira (exemplo):

* **Domain/Core:** Regras de negócio, Entidades e interfaces de repositórios.
* **Application/UseCases:** Regras de aplicação e casos de uso específicos.
* **Infrastructure:** Implementações de bancos de dados (H2), configurações do Spring.
* **Presentation/Web:** Controllers para expor os endpoints REST (APIs).

---

## 👨‍💻 Autor

Victor Emanuel
