package Aula05;

public class HoraMain {
    public static void main(String[] args) {
        //Instanciando o objeto da classe hora
        Hora consultaMedica = new Hora();
        
        //altero os valores
        consultaMedica.alterarHora(20, 31, 0);
        /*consultaMedica.hora = 20;
        consultaMedica.minuto = 28;
        consultaMedica.segundo = 0;*/
        
        //saída
        System.out.println(consultaMedica.imprimirHora());        
    }
}
