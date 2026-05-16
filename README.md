# 🏦 Sistema Bancário

Um sistema de gerenciamento bancário simples e intuitivo desenvolvido em Java, implementando o padrão de arquitetura **MVC (Model-View-Controller)**. O projeto permite que usuários realizem operações básicas de conta corrente, como depósitos, saques e consulta de saldo através de uma interface de linha de comando.

---

## ✨ Funcionalidades Principais

- 💰 **Depósito**: Adicionar valores à conta bancária
- 🏧 **Saque**: Retirar valores com validação de saldo
- 📊 **Consulta de Saldo**: Visualizar o saldo atual da conta
- 🎯 **Interface Interativa**: Menu de navegação intuitivo em linha de comando
- ✅ **Validações**: Verificação de saldo suficiente antes de saques

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|-----------|--------|-----------|
| **Java** | 21 | Linguagem principal de desenvolvimento |
| **Maven** | 3.x+ | Gerenciador de dependências e build |
| **JDK** | 21 | Java Development Kit |

---

## 📋 Pré-requisitos

Antes de executar o projeto, certifique-se de ter os seguintes itens instalados:

- **Java Development Kit (JDK)**: versão 21 ou superior
  - Verifique a instalação: `java -version`
- **Maven**: versão 3.6.0 ou superior
  - Verifique a instalação: `mvn --version`
- **Git**: para clonar o repositório
- **IDE** (opcional): IntelliJ IDEA, Eclipse ou VS Code com extensão Java

---

## 📥 Instalação e Configuração

### 1️⃣ Clonar o Repositório

```bash
git clone https://github.com/joaoribeiroodev/sistemaBancario.git
cd sistemaBancario
```

### 2️⃣ Instalar as Dependências

O projeto utiliza Maven para gerenciar dependências. Execute o comando abaixo para baixar todas as dependências necessárias:

```bash
mvn clean install
```

### 3️⃣ Compilar o Projeto

Compile o código-fonte para a pasta `target`:

```bash
mvn compile
```

### 4️⃣ Configuração de Variáveis de Ambiente

[Insira aqui informações sobre variáveis de ambiente, se houver]

---

## 🚀 Como Executar

### Modo Desenvolvimento

Para executar o projeto em modo de desenvolvimento, use:

```bash
mvn exec:java -Dexec.mainClass="org.sistemaBancario.Main"
```

Ou, se preferir usar a compilação Java direta:

```bash
mvn clean compile exec:java -Dexec.mainClass="org.sistemaBancario.Main"
```

### Modo Produção

Gere um arquivo JAR executável:

```bash
mvn clean package -DskipTests
```

Depois, execute o arquivo gerado:

```bash
java -jar target/sistemaBancario-1.0-SNAPSHOT.jar
```

### Interagindo com o Sistema

Após iniciar a aplicação, você verá um menu interativo:

```
Banco
1 - Depositar
2 - Sacar
3 - Ver saldo
0 - Sair
Escolha uma opcao:
```

- Digite **1** para fazer um depósito
- Digite **2** para fazer um saque
- Digite **3** para consultar seu saldo
- Digite **0** para sair da aplicação

---

## 🧪 Como Testar

[Insira aqui informações sobre testes automatizados, se houver]

Atualmente, o projeto não possui testes automatizados configurados. Para implementar testes unitários, recomenda-se adicionar as seguintes dependências ao `pom.xml`:

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

---

## 📁 Estrutura de Pastas

```
sistemaBancario/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── sistemaBancario/
│                   ├── Main.java                 # Classe principal (ponto de entrada)
│                   ├── controller/
│                   │   └── BancoController.java  # Controla a lógica de fluxo da aplicação
│                   ├── model/
│                   │   └── ContaModel.java       # Modelo de dados da conta bancária
│                   └── view/
│                       └── BancoView.java        # Interface com o usuário (apresentação)
│
├── .idea/                      # Configurações do IntelliJ IDEA
├── .gitignore                  # Arquivos ignorados pelo Git
├── pom.xml                     # Configuração do Maven
└── README.md                   # Este arquivo
```

### 📝 Descrição dos Componentes

- **Main.java**: Inicializa a aplicação, criando instâncias do modelo, da view e do controller
- **BancoController.java**: Gerencia a interação entre a view e o model, processando as opções do usuário
- **ContaModel.java**: Representa a conta bancária com métodos para depósito, saque e consulta de saldo
- **BancoView.java**: Responsável por exibir mensagens e menus ao usuário

---

## 🏗️ Arquitetura MVC

Este projeto segue o padrão **Model-View-Controller (MVC)**:

- **Model**: `ContaModel` - Armazena os dados da conta (nome, saldo) e a lógica de negócio
- **View**: `BancoView` - Exibe menus e mensagens ao usuário
- **Controller**: `BancoController` - Coordena a comunicação entre Model e View, processando as ações do usuário

---

## 🔒 Validações e Segurança

- ✅ Validação de saldo antes de realizar saques
- ✅ Rejeição de valores negativos ou inválidos
- ✅ Mensagens de erro amigáveis ao usuário

---

## 🤝 Contribuindo

[Insira aqui informações sobre como contribuir para o projeto]

---

## 📄 Licença

[Insira aqui informações sobre a licença do projeto]

---

## 👨‍💻 Autor

**João Ribeiro** - [@joaoribeiroodev](https://github.com/joaoribeiroodev)

---

## 📞 Suporte

Para dúvidas, sugestões ou problemas, abra uma [issue](https://github.com/joaoribeiroodev/sistemaBancario/issues) no repositório.

---

**Última atualização**: 16 de maio de 2026 ✨
