package arrays;

import java.util.Scanner;
import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[][] matriz = new int[4][4];
        int min = 101;
        int[] posicao = new int[2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(101);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
                if (min > matriz[i][j]) {
                    min = matriz[i][j];
                    posicao[0] = i + 1;
                    posicao[1] = j + 1;
                }
            }
            System.out.println();
        }
        System.out.println("Minimo: " + min);
        System.out.println("Posicao: " + posicao[0] + ", " + posicao[1]);
    }

}
