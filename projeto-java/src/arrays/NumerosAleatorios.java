package arrays;

import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Numeros entre 0 a 100: ");

        int i = 0;
        while (i < vetor.length) {
            vetor[i] = sc.nextInt();
            if (vetor[i] < 0 || vetor[i] > 100) {
                System.out.println("Numero invalido");
            } else i++;
        }

        for (i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            System.out.println("Sucessor: " + (vetor[i] + 1));
        }

    }

}
