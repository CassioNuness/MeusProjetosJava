package arrays;

import java.util.Arrays;

public class Exerc�cioForeach {
    
public static void main(String[] args) {
        
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));
        
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;
        
        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[1]);
        
        double totalAlunoA =0;
        
        for(double nota: notasAlunoA) {
            totalAlunoA += nota;
            System.out.println(nota + " ");
        }
        System.out.println("\nM�dia Aluno A: " + totalAlunoA / notasAlunoA.length / notasAlunoA.length);
        
        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
        
        double totalAlunoB = 0;
        
        for (double nota: notasAlunoB) {
            totalAlunoB += nota;
            System.out.println(nota + " ");
        }
        
        System.out.println("\nM�dia Aluno B: " + totalAlunoB / notasAlunoB.length);
    }

}
