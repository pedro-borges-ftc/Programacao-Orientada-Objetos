package Aula06;

public class HoraMain {
    public static void main(String[] args) {
        //Instanciando o objeto da classe hora
        Hora consultaMedica = new Hora(20,8,0);
        System.out.println(consultaMedica.imprimeHora());  
        
        //altero os valores
        consultaMedica.alteraHora(100, 31, 14);
        /*consultaMedica.hora = 20;
        consultaMedica.minuto = 28;
        consultaMedica.segundo = 0;*/
        consultaMedica.setMinuto(45);
        
        //saída
        System.out.println(consultaMedica.imprimeHora());        
    }
}
