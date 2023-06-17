package arrays;

import java.util.Scanner;

public class MatrizOtimizado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];

        for (int a = 0; a < notasDaTurma.length; a++) {
            System.out.printf("Notas do aluno %d:\n", a + 1);
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d: ", n + 1);
                notasDaTurma[a][n] = entrada.nextDouble();
            }
        }

        double soma = 0;
        for (double[] notasAluno : notasDaTurma) {
            for (double nota : notasAluno) {
                soma += nota;
            }
        }

        double media = soma / (qtdeAlunos * qtdeNotas);
        System.out.println("A média da turma é: " + media);

        entrada.close();
    }
}