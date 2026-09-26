import java.util.Scanner;

public class AlunoAPP {

    static Scanner teclado = new Scanner(System.in);
    static Aluno[] lista = new Aluno[50];
    static int total = 0;

    public static void main(String[] args) {

        int opcao;

        do {
            mostrarMenu();
            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                inserirAlunos();

            } else if (opcao == 2) {
                ordenarNome();

            } else if (opcao == 3) {
                ordenarRa();

            } else if (opcao == 4) {
                mostrarAprovados();

            } else if (opcao == 0) {
                System.out.println("\nPrograma finalizado.");

            } else {
                System.out.println("\nOpcao invalida.");
            }

        } while (opcao != 0);
    }

    public static void mostrarMenu() {

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("       SISTEMA DE ALUNOS");
        System.out.println("------------------------------");
        System.out.println("1 - Cadastrar alunos");
        System.out.println("2 - Relatorio por nome");
        System.out.println("3 - Relatorio por RA");
        System.out.println("4 - Relatorio de aprovados");
        System.out.println("0 - Sair");
        System.out.println("------------------------------");
        System.out.print("Opcao: ");
    }

    public static void inserirAlunos() {

        System.out.println();
        System.out.println("=== CADASTRO ===");

        System.out.print("Quantidade de alunos: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");
            return;
        }

        if (quantidade > lista.length - total) {
            System.out.println("Nao ha espaco para todos os alunos.");
            return;
        }

        for (int i = 0; i < quantidade; i++) {

            System.out.println();
            System.out.println("Cadastro " + (i + 1));

            System.out.print("Nome: ");
            String nome = teclado.nextLine();

            System.out.print("RA: ");
            int ra = teclado.nextInt();

            System.out.print("Idade: ");
            int idade = teclado.nextInt();

            System.out.print("Sexo: ");
            String sexo = teclado.next();

            System.out.print("Media: ");
            double media = teclado.nextDouble();
            teclado.nextLine();

            lista[total] = new Aluno(nome, ra, idade, sexo, media);
            total++;
        }

        System.out.println("\nAlunos cadastrados.");
    }

    public static void ordenarNome() {

        if (total == 0) {
            System.out.println("\nNenhum aluno cadastrado.");
            return;
        }

        Aluno[] ordenados = copiarLista();

        for (int i = 0; i < ordenados.length - 1; i++) {

            for (int j = 0; j < ordenados.length - 1 - i; j++) {

                String nome1 = ordenados[j].getNome();
                String nome2 = ordenados[j + 1].getNome();

                if (nome1.compareToIgnoreCase(nome2) > 0) {

                    Aluno temp = ordenados[j];
                    ordenados[j] = ordenados[j + 1];
                    ordenados[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("=== RELATORIO POR NOME ===");

        exibirLista(ordenados);
    }

    public static void ordenarRa() {

        if (total == 0) {
            System.out.println("\nNenhum aluno cadastrado.");
            return;
        }

        Aluno[] ordenados = copiarLista();

        // Selection Sort
        for (int i = 0; i < ordenados.length - 1; i++) {

            int maiorRa = i;

            for (int j = i + 1; j < ordenados.length; j++) {

                if (ordenados[j].getRa() > ordenados[maiorRa].getRa()) {
                    maiorRa = j;
                }
            }

            Aluno temp = ordenados[i];
            ordenados[i] = ordenados[maiorRa];
            ordenados[maiorRa] = temp;
        }

        System.out.println();
        System.out.println("=== RELATORIO POR RA ===");

        exibirLista(ordenados);
    }

    public static void mostrarAprovados() {

        if (total == 0) {
            System.out.println("\nNenhum aluno cadastrado.");
            return;
        }

        Aluno[] aprovados = new Aluno[total];
        int quantidade = 0;

        for (int i = 0; i < total; i++) {

            if (lista[i].getResultado().equals("Aprovado")) {
                aprovados[quantidade] = lista[i];
                quantidade++;
            }
        }

        if (quantidade == 0) {
            System.out.println("\nNao existem alunos aprovados.");
            return;
        }

        // Bubble Sort dos aprovados por nome
        for (int i = 0; i < quantidade - 1; i++) {

            for (int j = 0; j < quantidade - 1 - i; j++) {

                if (aprovados[j].getNome().compareToIgnoreCase(
                        aprovados[j + 1].getNome()) > 0) {

                    Aluno temp = aprovados[j];
                    aprovados[j] = aprovados[j + 1];
                    aprovados[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("=== ALUNOS APROVADOS ===");

        for (int i = 0; i < quantidade; i++) {
            aprovados[i].mostrar();
            System.out.println("------------------------------");
        }
    }

    public static Aluno[] copiarLista() {

        Aluno[] copia = new Aluno[total];

        for (int i = 0; i < total; i++) {
            copia[i] = lista[i];
        }

        return copia;
    }

    public static void exibirLista(Aluno[] alunos) {

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].mostrar();
            System.out.println("------------------------------");
        }
    }
}