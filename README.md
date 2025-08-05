# 🚗 Garage77 - Sistema de Controle de Estacionamento

Projeto desenvolvido em Java com Swing e banco de dados Firebird, como parte do curso de **LP2 (Linguagem de Programação II)** do IFBA.  
O sistema tem como objetivo controlar clientes, veículos, vagas e locações em um estacionamento.

---

## 📌 Funcionalidades Implementadas

- [x] **Cadastro de Clientes**
- [x] **Cadastro de Veículos**
- [x] **Cadastro de Vagas**
- [x] **Cadastro de Locações**
- [x] **Finalização de Locações com cálculo de valor**
- [x] **Pesquisa de veículos e locações**
- [x] **Interface gráfica (GUI) com Java Swing**
- [x] **Conexão com banco Firebird via JDBC**

---

## 🛠 Tecnologias Utilizadas

- **Java 8+**
- **NetBeans IDE**
- **Java Swing (GUI)**
- **JDBC**
- **FirebirdSQL**
- **Jaybird (Driver JDBC Firebird)**

---

## 📂 Estrutura do Projeto

```plaintext
/src
 └── view
     ├── TelaCadastroCliente.java
     ├── TelaCadastroVeiculo.java
     ├── TelaCadastroVaga.java
     ├── TelaCadastroLocacao.java
     ├── TelaPesquisaVeiculo.java
     └── TelaPrincipal.java
 └── dao
     └── ConexaoBD.java
🧪 Status do Projeto
✅ Projeto funcional entregue conforme solicitado.
⚠️ Correções e melhorias ainda serão necessárias futuramente nas telas:

TelaCadastroVaga

TelaCadastroLocacao

TelaCadastroCliente

📝 Como rodar o projeto
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/nome-do-repo.git
Abra no NetBeans.

Configure a conexão com o banco Firebird:

Altere os parâmetros de conexão no arquivo ConexaoBD.java

Verifique se o Jaybird está adicionado ao classpath

Importe o banco de dados (.fdb) ou crie as tabelas conforme especificação

💬 Dificuldades encontradas
"Durante o desenvolvimento, tive dificuldade inicial para realizar a conexão com o banco de dados Firebird. Precisei entender como o JDBC interage com o driver Jaybird e configurar corretamente a URL de conexão. Após alguns testes e ajustes, consegui estabelecer a conexão e manipular os dados normalmente."

🤝 Contribuições
Caso queira sugerir melhorias ou corrigir algum erro, fique à vontade para abrir uma issue ou enviar um pull request.

📌 Licença
Este projeto é acadêmico e não possui licença comercial.

yaml
Copiar
Editar

---

### ✅ Dica final:
Substitua o link `https://github.com/seu-usuario/nome-do-repo.git` pelo link real do seu repositório.

Se quiser, posso criar também um `script.sql` com as instruções do banco de dados Firebird (CREATE T
