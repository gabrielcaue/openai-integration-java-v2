# 🤖 OpenAI Integration with Java

**Integração da API REST da OpenAI com Java utilizando Spring Boot**

Este projeto demonstra como integrar a API da OpenAI (ChatGPT) em uma aplicação Java moderna usando Spring Boot. Ideal para quem deseja explorar inteligência artificial em sistemas backend com segurança e boas práticas.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Maven
- PostgreSQL
- OpenAI API
- IntelliJ IDEA
- Postman

---

## 📁 Estrutura de Diretórios

```plaintext
openai-integration-java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/gabriel/openprompthub/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── OpenAIService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
├── pom.xml
├── README.md
└── .gitignore




aplication.properties
# Conexão com PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/openprompthub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

# JPA e Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# Porta padrão do servidor
server.port=8080

openai.api.key=SUA CHAVE_API_OPENAI
openai.api.url=https://api.openai.com/v1/chat/completions
