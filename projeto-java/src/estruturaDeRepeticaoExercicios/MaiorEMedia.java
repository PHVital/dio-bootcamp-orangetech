package estruturaDeRepeticaoExercicios;

import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int media = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            int n = scanner.nextInt();
            if (maior < n) maior = n;
            count++;
            soma += n;
        } while (count < 5);
        media = soma / count;
        System.out.println(maior);
        System.out.println(media);

    }

}
