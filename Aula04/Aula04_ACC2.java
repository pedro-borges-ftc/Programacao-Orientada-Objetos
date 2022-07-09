import java.util.Scanner;
import java.util.Arrays;

public class Aula04_ACC2 {
    public static void main(String[] args) {
        String[] nomes = {"","",""};//= { "Fulano", "Ciclano", "Beltrano" };
        Scanner ler = new Scanner(System.in);
        int numStringsLidas = 0, tamMaiorString = 0;
        int posicao = 0;
        String aux = "", todasStrings = "";
        
        
        do{
            System.out.println("***************Digite a String " + (numStringsLidas + 1));
            aux = ler.nextLine();

            if(buscaElementoArray(nomes, aux) > 0){
                        break;
            }else{
                todasStrings += aux + " ";

                if(aux.length() > tamMaiorString){
                    tamMaiorString = aux.length();
                }

                posicao = numStringsLidas % (nomes.length);
                nomes[posicao] = aux;

                numStringsLidas++;
            
                System.out.println("posição: "+ posicao);
                System.out.println("Número de Strings lidas " + numStringsLidas);
                System.out.println("Tamanho da maior String " + tamMaiorString);
                System.out.println("Concatenação " + todasStrings);
                System.out.println("Array com os " + nomes.length 
                + " últimos : " + Arrays.toString(nomes));
            }

        }while(true);

   }

   public static int buscaElementoArray(String a[], String elemento){
        int posicao = -1;

        for(int i = 0; i < a.length; i++){
            if(a[i].equalsIgnoreCase(elemento)){
                posicao = i;
            }
        }

        return posicao;
   }

}