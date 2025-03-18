package exerciciosMetodos;

public class Main {

    public static void main(String[] args) {

        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        System.out.println();

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(18);

        System.out.println();

        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);
    }

}
