package estruturaDeRepeticaoExercicios;

import java.util.Locale;
import java.util.Scanner;

public class NomeEIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome;
        int idade;

        while (true) {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
            if(nome.equals("0")) break;
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
        }

    }

}
