public class ControleDeFluxo {

    public static void main(String[] args) {
        String mes = "Dezembro";

        if (mes == "Janeiro")
            System.out.println("Janeiro");
        else if (mes == "Fevereiro")
            System.out.println("Fevereiro");
        else if (mes == "Março")
            System.out.println("Março");
        else if (mes == "Abril")
            System.out.println("Abril");
        else if (mes == "Maio")
            System.out.println("Maio");
        else if (mes == "Junho")
            System.out.println("Junho");
        else if (mes == "Julho")
            System.out.println("Julho");
        else if (mes == "Agosto")
            System.out.println("Agosto");
        else if (mes == "Setembro")
            System.out.println("Setembro");
        else if (mes == "Outubro")
            System.out.println("Outubro");
        else if (mes == "Novembro")
            System.out.println("Novembro");
        else
            System.out.println("Dezembro");

        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro")
            System.out.println("Férias");
    }

}
