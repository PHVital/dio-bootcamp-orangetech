package arrays;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetor = new char[6];
        int contadorConsoantes = 0;

        System.out.println("Digite 6 caracteres:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.next().charAt(0);
        }

        System.out.println("Consoantes digitadas:");
        for (int i = 0; i < vetor.length; i++) {
            char c = vetor[i];
            if ((c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) || (c >= 'A' && c <= 'Z' && "AEIOU".indexOf(c) == -1)) {
                System.out.println(c);
                contadorConsoantes++;
            }


        }
        System.out.println("Número de consoantes: " + contadorConsoantes);

    }
}