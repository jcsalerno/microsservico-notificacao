<div align="center">
 <h1> 📢 Microsserviço de Notificação </h1>
  <img src="notificacao-readme.png" style="width: 430px; height: 320px; object-fit: cover;" />
</div>

---
Este projeto é um **microsserviço de notificação** desenvolvido em Java com **Spring Boot**, projetado para enviar mensagens através do **Amazon SNS** (Simple Notification Service), utilizando também **RabbitMQ** como intermediador de mensagens.

---

### 📦 Microsserviço Dependente

Este microsserviço depende do envio de mensagens por outro projeto que simula a criação de propostas:

🔗 [`microsservico-proposta`](https://github.com/jcsalerno/microsservico-proposta)

---

# Compile o projeto
```
./mvnw clean install
```

# Execute a aplicação
```
./mvnw spring-boot:run
```

---

## 🧪 Acesso ao Painel do RabbitMQ

Para acessar a interface administrativa do RabbitMQ e visualizar as filas, vá até:

[http://localhost:15672](http://localhost:15672)

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Amazon SNS (AWS)
- RabbitMQ
- Spring AMQP
- Jackson (para serialização de mensagens JSON)

---

## 📦 Funcionalidades

- Consumir mensagens da fila `proposta.pendente` no RabbitMQ.
- Enviar notificações via Amazon SNS.
- Integração com entidades de domínio como `Proposta` e `Usuario`.
- Configuração desacoplada para AWS e RabbitMQ.

---

## 🧩 Estrutura

### `config/`
- `AmazonSnsConfiguration`: Configurações para autenticação e criação do cliente Amazon SNS.
- `RabbitMAQConfiguration`: Conversor de mensagens JSON para objetos Java via Jackson.

### `constant/`
- `MensagemConstante`: Centraliza mensagens padronizadas utilizadas nas notificações.

### `domain/`
- `Proposta`: Representa os dados da proposta enviada à fila.
- `Usuario`: Representa os dados do usuário atrelado à proposta.

### `listener/`
- `PropostaPendenteListener`: Ouve mensagens da fila e chama o serviço de notificação.

### `service/`
- `NotificacaoSnsService`: Serviço responsável por enviar a notificação (implementação a ser desenvolvida).

---

[![Java 21](https://img.shields.io/badge/java-21-blue.svg)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/spring--boot-3.2.0-brightgreen)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/license-MIT-lightgrey.svg)](LICENSE)
[![Build](https://img.shields.io/badge/build-Maven-blue)](https://maven.apache.org/)
[![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)]()

