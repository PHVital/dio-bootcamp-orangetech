package exerciciosMetodos;

import java.util.Scanner;

public class Calculadora {

    public static void soma(double a, double b) {
        System.out.println("Soma: " + (a + b));
    }

    public static void subtracao(double a, double b) {
        System.out.println("Subtracao: " + (a - b));
    }

    public static void multiplicacao(double a, double b) {
        System.out.println("Multiplicacao: " + (a * b));
    }

    public static void divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro, divisão por 0");
        } else {
            System.out.println("Divisao: " + (a / b));
        }
    }

}
