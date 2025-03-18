package arrays;

import java.util.Scanner;

public class OrdemInversa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Numeros vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }

}
