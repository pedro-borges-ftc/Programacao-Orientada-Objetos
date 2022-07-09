package Aula07;

public class Principal {
    public static void main(String[] args) {
        Hora agora = new Hora(20,40,00);
        DataEmJava hoje = new DataEmJava(26,04,2022);
        DataHora dt1 = new DataHora(hoje,agora);

        dt1.preencheDataHora();

        System.out.println(dt1.imprimir());
    }
}
