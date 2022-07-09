import java.util.Scanner;

public class Hora {
    //Atributos
    private int hora;
    private int minuto;
    private int segundo;

    //Construtores
    Hora(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    Hora(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    //Métodos
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    public String imprimir(){
        String resposta = this.hora + ":" + this.minuto + ":" + this.segundo;
        return resposta;
    }
    public void preencheHora(){
        Scanner teclado1 = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        this.hora = teclado1.nextInt();

        System.out.println("Digite o minuto: ");
        this.minuto = teclado1.nextInt();

        System.out.println("Digite o segundo: ");
        this.segundo = teclado1.nextInt();
    }
}