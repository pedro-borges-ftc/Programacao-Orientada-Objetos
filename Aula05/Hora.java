package Aula05;

public class Hora {
    //Atributos
    int hora;
    int minuto;
    int segundo;

    //Métodos
    public String imprimirHora(){
        return hora + ":" + minuto + ":" + segundo;
    }

    public void alterarHora(int h, int m, int s){
       hora = h;
       minuto = m;
       segundo = s;
    }
}
