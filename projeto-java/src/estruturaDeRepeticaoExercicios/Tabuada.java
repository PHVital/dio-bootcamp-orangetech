package estruturaDeRepeticaoExercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int n = sc.nextInt();
        System.out.println("---------------- TABUADA ----------------\n");

        for (int i = 0; i < n; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

}
