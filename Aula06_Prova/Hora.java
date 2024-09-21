

public class Hora {
    //atributos
    private int hora;
    private int minuto;
    private int segundo;
    //construtores
    Hora(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    //Métodos
    public void alteraHora(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    public String imprimeHora(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
}
