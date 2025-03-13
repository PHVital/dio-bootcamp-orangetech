public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        int a = 5;
        int b = 6;

        String parImpar =  a % 2 == 0 ? "O número " + a + " é par" : "O número " + a + " é impar";
        System.out.println(parImpar);

        parImpar =  b % 2 == 0 ? "O número " + b + " é par" : "O número " + b + " é impar";
        System.out.println(parImpar);
    }
}
