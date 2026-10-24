package aluno;

import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

       
        System.out.println("=====================================");
        System.out.println("   EXERCÍCIO 1: Vetor de Inteiros");
        System.out.println("=====================================");

        int[] numeros = new int[10];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = tc.nextInt();
            soma += numeros[i];
        }
        tc.nextLine(); // Limpa o buffer do scanner

        System.out.println("\n--- Números Digitados ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
        System.out.println("Soma total dos números: " + soma);


        System.out.println("\n================================");
        System.out.println("   EXERCÍCIO 2: Vetor de Nomes");
        System.out.println("==================================");

        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = tc.nextLine();
        }

        System.out.print("\nDigite um nome para pesquisa: ");
        String nomeBusca = tc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Nome '" + nomes[i] + "' encontrado no índice " + i + ".");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O nome '" + nomeBusca + "' não foi encontrado no vetor.");
        }


        System.out.println("\n=================================");
        System.out.println("   DESAFIO FINAL: Vetor de Alunos");
        System.out.println("===================================");

        Aluno[] alunos = new Aluno[5];
        double somaNotas = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");
            System.out.print("Nome: ");
            String nome = tc.nextLine();

            System.out.print("Nota: ");
            double nota = tc.nextDouble();
            tc.nextLine(); // Limpa o buffer

            alunos[i] = new Aluno(nome, nota);
            somaNotas += nota;
        }

        double mediaGeral = somaNotas / alunos.length;

        System.out.println("\n--------------------------------------");
        System.out.printf("Média geral da turma: %.2f\n", mediaGeral);
        System.out.println("----------------------------------------");

        System.out.println("Alunos com nota ACIMA da média geral:");
        boolean algumAcima = false;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNota() > mediaGeral) {
                alunos[i].exibirDados();
                algumAcima = true;
            }
        }

        if (!algumAcima) {
            System.out.println("Nenhum aluno ficou acima da média.");
        }

        tc.close();
    }
}