package estruturaDeRepeticaoExercicios;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int n = sc.nextInt();

        for (int i = (n-1); i > 0; i--) {
            n = n * i;
        }

        System.out.println(n);

    }

}
