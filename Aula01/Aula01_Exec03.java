//import java.util.Scanner;

public class Aula01_Exec03 {
    public static void main(String[] args) {
        int ant = 0;
        int atu = 1;
        int aux = 0;
        
        System.out.print(ant + ", " + atu );

        while(atu + ant < 100){
            aux = ant;
            ant = atu;
            atu = ant + aux;
            System.out.print(", " + atu);
        }
    }
}