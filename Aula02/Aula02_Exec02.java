import javax.swing.JOptionPane;

public class Aula02_Exec02 {
    public static void main(String[] args) {
        int num1, num2;
        String resultado = "";

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: ","Digite um número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: ","Digite um número"));

        resultado = "Resultados:";
        resultado += "\n" + num1 + " + " + num2 + " = " + (num1+num2);
        resultado += "\n" + num1 + " - " + num2 + " = " + (num1-num2);
        resultado += "\n" + num1 + " * " + num2 + " = " + (num1*num2);
        resultado += "\n" + num1 + " / " + num2 + " = " + (num1/num2);
        resultado += "\n" + num1 + " / " + num2 + " = " + ((double)num1/num2);

        JOptionPane.showMessageDialog(null, resultado);
    }
}
