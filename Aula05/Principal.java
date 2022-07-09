package Aula05;

public class Principal {
    public static void main(String[] args) {
        DadosPessoais pessoa1 = new DadosPessoais();
        DadosPessoais pessoa2 = new DadosPessoais();

       pessoa1.preencheDadosPessoais();
       pessoa2.preencheDadosPessoais();

       pessoa1.imprimir();
       pessoa2.imprimir();
    }
}
