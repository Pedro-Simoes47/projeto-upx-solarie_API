
# ☀️🔋 Solaire API

A **Solaire API** é uma aplicação backend desenvolvida em Java com Spring Boot para monitoramento da geração de energia solar por painéis. Ela permite registrar manualmente ou futuramente de forma automatizada as medições de energia gerada, consultar registros por data e painel, e gerar relatórios para análise de desempenho energético. ⚡📊📈

---

## 🚀 Tecnologias Utilizadas

- **Java 17** com **Spring Boot**
- **Maven** – Gerenciamento de dependências e build
- **MySQL** – Banco de dados relacional
- **Spring Data JPA** – Abstração de persistência
- **Spring Web** – Criação de APIs REST
- (opcional) **Spring Security** – Pode ser desabilitado durante desenvolvimento

---

## ✅ Funcionalidades

- 📅 Consulta de todos os registros de geração
- ➕ Registro de energia manual
- 🌞 Cadastro de painel solar
- 👤 Cadastro de usuários (em desenvolvimento)

---

## ⚙️ Instalação e Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/projeto-upx-solarie_API.git
   cd projeto-upx-solarie_API
   ```

2. Configure seu banco de dados no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/solaire_db
   spring.datasource.username=root
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

3. Compile e execute a aplicação:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## 📡 Endpoints da API

### 🔋 Registrar Energia Gerada
```http
POST /energia
```
**Corpo esperado (JSON):**
```json
{
  "dataGeracao": "2025-05-24",
  "painelId": 1,
  "quantidadeKwh": 13.5
}
```

---

### 🔄 Listar Todos os Registros
```http
GET /energia
```

---

### ☀️ Criar Painel Solar
```http
POST /painel
```
**Corpo esperado (JSON):**
```json
{
  "nomePainel": "Painel Traseiro",
  "usuarioID": 1
}
```

---

## 📌 Observações

- 🔐 A segurança via Spring Security foi desabilitada temporariamente para facilitar testes locais.
- 🔄 Planeja-se futuramente a automação da coleta de dados da energia gerada diretamente dos painéis solares.
- 🧪 Testes de integração e interface com painel estão em desenvolvimento.

---

## 👨‍💻 Desenvolvido por

Pedro Simoes – [LinkedIn](https://www.linkedin.com/in/pedro-hm-simoes/)  

---
