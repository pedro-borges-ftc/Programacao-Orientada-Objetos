package Aula06;

public class Questao02 {
    public static void main(String[] args) {
        //hora
        Hora h1 = new Hora();
        System.out.println("Hora Atual = " + h1.imprimeHora());
        
        h1.alteraHora(22, 56, 15);
        System.out.println("Hora Atual = " + h1.imprimeHora());
        
        h1.alteraHora(21, 33, 44);
        System.out.println("Hora Atual = " + h1.imprimeHora());
        
        h1.alteraHora(99, 88, 55);
        System.out.println("Hora Atual = " + h1.imprimeHora());
    }   
}