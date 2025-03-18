package exercicioSobrecarga;

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Area do quadrado: " + (lado * lado));
    }

    public static void area(double lado, double lado2) {
        System.out.println("Area do retângulo: " + (lado * lado2));
    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        System.out.println("Area do trapézio: " + ((baseMaior + baseMenor) * altura)/2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Area do losango: " + (diagonal1*diagonal2)/2);
    }

}
