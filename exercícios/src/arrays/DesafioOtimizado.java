package arrays;

import java.util.Scanner;

public class DesafioOtimizado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qtDeNotas = entrada.nextInt();

        double[] notas = new double[qtDeNotas];

        double total = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            total += notas[i];
        }

        double media = total / notas.length;
        System.out.println("A média é: " + media + "!");
        entrada.close();

    }

}
