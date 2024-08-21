import java.util.Scanner;

public class Aula03_ACC01 {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            double valorCarro = 0.0;
            double carroComDesconto = 0.0;
            int anoCarro = 0;
            int qtdCarros = 0;
            int qtdCarros2000 = 0;
            double valorDesconto = 0.0;
            double percDesconto = 0.0;
            String saida = "";

            while(!saida.equals("N")){
                qtdCarros++;

                System.out.println("Informe o valor do carro: ");
                valorCarro = ler.nextDouble();

                System.out.println("Informe o ano do carro: ");
                anoCarro = ler.nextInt();

                if(anoCarro > 2000){
                    percDesconto = 0.07;    // 7 / 100
                }else{
                    percDesconto = 0.12;
                    qtdCarros2000++;
                }

                valorDesconto = valorCarro * percDesconto;
                carroComDesconto = valorCarro - valorDesconto;

                System.out.println("Valor do Desconto: " + valorDesconto);
                System.out.println("Valor pago pelo Carro: " + carroComDesconto);

                System.out.println("Você quer vender outro carro? (S/N)");
                saida = ler.next();
            }

            System.out.println("A quantidade de Carros até o ano 2000 é: " + qtdCarros2000);
            System.out.println("A quantidade de Carros total é: " + qtdCarros);
        }    
    }
}