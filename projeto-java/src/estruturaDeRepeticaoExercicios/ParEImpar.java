package estruturaDeRepeticaoExercicios;

import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0, quantNumeros = 5, quantPar = 0;

        do {
            System.out.println("Numero: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) quantPar++;
            contador++;
        } while (contador < quantNumeros);
        System.out.println("Par: " + quantPar);
        System.out.println("Impar: " + (contador - quantPar));

    }

}
