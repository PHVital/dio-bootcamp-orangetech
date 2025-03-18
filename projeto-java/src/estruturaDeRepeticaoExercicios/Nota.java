package estruturaDeRepeticaoExercicios;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número entre 0 e 10: ");
            int n = scanner.nextInt();
            if (n <= 10 && n >= 0) break;
            System.out.println("Nota Inválida!");
        }


    }

}
