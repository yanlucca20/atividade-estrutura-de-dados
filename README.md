# Trabalho de Estrutura de Dados

Aplicação desenvolvida em **Java** para cadastro, organização e consulta de dados de alunos, utilizando **Array de Objetos**.

## Sobre o projeto

O programa permite cadastrar alunos informando nome, RA, idade, sexo e média. A partir da média informada, o sistema define automaticamente se o aluno está **Aprovado** ou **Reprovado**.

A aplicação possui um menu interativo para realizar diferentes tipos de relatórios e utiliza algoritmos de ordenação estudados na disciplina de Estrutura de Dados.

## Funcionalidades

- Cadastro de alunos
- Definição automática do resultado do aluno
- Relatório de alunos por nome em ordem crescente (A-Z)
- Relatório de alunos por RA em ordem decrescente
- Relatório apenas de alunos aprovados, ordenados por nome

## Algoritmos utilizados

- **Bubble Sort** — utilizado para ordenar os alunos por nome
- **Selection Sort** — utilizado para ordenar os alunos pelo RA

## Tecnologias

- Java
- Classe `Scanner`
- Array de Objetos

## Estrutura do projeto

```text
TabalhoEdD/
├── .idea/
│   ├── .gitignore
│   ├── .name
│   ├── haxe.xml
│   ├── misc.xml
│   ├── modules.xml
│   └── workspace.xml
├── src/
│   ├── Aluno.java
│   └── App.java
├── .gitignore
└── TabalhoEdD.iml
```

## Como executar

1. Tenha o **Java JDK** instalado no computador.
2. Abra os arquivos `Aluno.java` e `Principal.java` em uma IDE, como IntelliJ IDEA, Eclipse ou VS Code.
3. Execute a classe `Principal`.
4. Utilize o menu apresentado no terminal para acessar as funcionalidades do programa.

## Autor

**Yan Lucca Menóssi Figueiredo**
