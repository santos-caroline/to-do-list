# ToDo-List 

![Java](https://img.shields.io/badge/Java-25%20LTS-red?style=flat&logo=java)
![Java](https://img.shields.io/badge/Java-17%2B-blue?style=flat&logo=java)
![OOP](https://img.shields.io/badge/Paradigma-POO-informational?style=flat)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=flat)


O **Sistema ToDo List** é uma aplicação em linha de comando cujo objetivo é atuar como um gerenciador de tarefas. A aplicação permite criar tarefas utilizando 
atributos como **título**, **descrição**, **data de entrega** e **status** (concluída ou não).



## Sobre o Projeto
O projeto foi desenvolvido como atividade de conclusão do Módulo 1 do programa Elas+ Tech. A proposta foi apresentada em uma aula técnica, na qual a estrutura inicial do sistema 
foi discutida e implementada. A partir desse ponto, aprimorei a solução, definindo toda a lógica por trás das funcionalidades, bem como a estrutura final do projeto.

O principal intuito foi aplicar, de forma prática, os aprendizados adquiridos nesta primeira etapa do programa, consolidando conceitos fundamentais de lógica de programação e organização 
e código.

### Funcionalidades
- Criar tarefas  
- Listar tarefas pendentes  
- Marcar tarefas como concluídas  
- Excluir tarefas  
- Listar todas as tarefas  

### O projeto prioriza
- **Boas práticas de programação**
- **Modularização e organização do código**
- **Controle de fluxo**, com uso de condicionais e laços de repetição

### Tecnologias Utilizadas
- **Java 25 LTS**
- **Paradigma POO (Programação Orientada a Objetos)**
- Pacotes e classes da biblioteca padrão Java:
  - `java.util`
    - `ArrayList`
    - `Scanner`
    - `Locale`
  - `java.time`
    - `LocalDate`

### Pré-requisitos Recomendados
- **Java OpenJDK 25 LTS** ou superior  
- Um terminal / prompt de comando  
- (Opcional) Uma IDE, como o **IntelliJ IDEA**

### Ambiente e Observações Técnicas

O projeto foi desenvolvido e testado utilizando **Java 25 LTS**, versão atualmente instalada no meu ambiente de desenvolvimento.

Apesar disso, o código não depende de recursos exclusivos dessa versão, sendo possível executá-lo em **versões anteriores do Java**, desde que compatíveis com as bibliotecas 
e recursos utilizados.  
Recomenda-se o uso de **Java 17 LTS ou superior** para garantir maior estabilidade.

Para a interação com o usuário, optei por utilizar classes de **entrada e saída (I/O)**, em vez do uso direto de `System.out.print/println`.  
Essa escolha contribui para uma melhor **organização do código**, maior **controle da entrada e saída de dados** e facilita a manutenção e evolução futura da aplicação.

### Como Executar

#### 1. Clone o repositório:
```bash
git clone https://github.com/santos-caroline/to-do-list.git
```

#### 2. Acesse o diretório do projeto:
```bash
cd to-do-list
```

#### 3. Compile o projeto:
```bash
javac -d out src/main/java/to_do_list/*.java
```

#### 4. Execute a aplicação:
```bash
java -cp out to_do_list.ToDoList
```

#### Ou, se estiver usando IDE:
- Abra o projeto na IDE (ex: IntelliJ IDEA)
- Execute a classe principal (Main)

