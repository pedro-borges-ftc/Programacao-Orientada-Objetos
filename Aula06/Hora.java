package Aula06;

public class Hora {
    //atributos
    private int hora;
    private int minuto;
    private int segundo;
    //construtores
    public Hora(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Hora(int hora, int minuto, int segundo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }
    //Métodos
    public void alteraHora(int h, int m, int s){
        this.setHora(h);
        this.setMinuto(m);
        this.setSegundo(s);
    }
    public String imprimeHora(){
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
    //Gets
    public int getHora() {
        return this.hora;
    }
    public int getMinuto() {
        return this.minuto;
    }
    public int getSegundo() {
        return this.segundo;
    }
    //Sets
    public void setHora(int hora) {
        if(hora <= 23 && hora >= 0){
            this.hora = hora;
        }else{
            System.out.println("Hora inválida: " + hora);
        }        
    }
    public void setMinuto(int minuto) {
        if(minuto <= 59 && minuto >= 0){
            this.minuto = minuto;
        }else{
            System.out.println("Minuto inválido: " + minuto);
        }        
    }
    public void setSegundo(int segundo) {
        if(segundo <= 59 && segundo >= 0){
            this.segundo = segundo;
        }else{
            System.out.println("Segundo inválido: " + segundo);
        }         
    }    
}