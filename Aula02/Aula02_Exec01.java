import java.util.Scanner;

public class Aula02_Exec01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            int num1, num2;
            String resultado = "";

            System.out.println("Informe o primeiro valor: ");
            num1 = ler.nextInt();
            System.out.println("Informe o segundo valor: ");
            num2 = ler.nextInt();

            resultado = "Resultados:";
            resultado += "\n" + num1 + " + " + num2 + " = " + (num1+num2);
            resultado += "\n" + num1 + " - " + num2 + " = " + (num1-num2);
            resultado += "\n" + num1 + " * " + num2 + " = " + (num1*num2);
            resultado += "\n" + num1 + " / " + num2 + " = " + (num1/num2);
            resultado += "\n" + num1 + " / " + num2 + " = " + ((double)num1/num2);

            System.out.println(resultado);

            ler.close();
    }
}
