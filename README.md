# Solaire API ☀️🔋⚡

Solaire API é uma aplicação backend desenvolvida para monitorar a geração de energia por painéis solares. Ela permite registrar, consultar e gerar relatórios sobre a quantidade de energia gerada ao longo do tempo. 📊🔎📈


## Tecnologias Utilizadas 🖥️⚙️🛠️

- **Java** (Spring Boot) - Framework principal para desenvolvimento da API.
- **Maven** - Gerenciador de dependências e build automation.
- **Banco de Dados** - Utiliza um banco relacional MySQL.

## Funcionalidades 📢📄🔑

- Consulta de dados por data especifica.
- Consulta de todos os dados.

## Instalação e Execução 🏗️🚀💻

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/projeto-upx-solarie_API.git
   cd projeto-upx-solarie_API
   ```

2. Configure o banco de dados no arquivo `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/solaire_db
   spring.datasource.username=root
   spring.datasource.password=senha
   ```

3. Instale as dependências e execute a aplicação:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## Endpoints Principais 🔗📡🌍


- **Registrar Energia Gerada**
  ```http
  POST /energia
  ```

- **Consultar Energia por Data**
  ```http
  GET /energia/data?date=2025-10-01
  ```

