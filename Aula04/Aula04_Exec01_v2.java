import java.util.Scanner;
import java.util.Arrays;

public class Aula04_Exec01_v2 {
    public static void main(String[] args) {
        String[] nomes  = new String[4];//= { "Fulano", "Ciclano", "Beltrano", "Ze Venancio" };
        try (Scanner ler = new Scanner(System.in)) {
            int posicao;
            String buscarNome = "";

            //Loop para leitura dos nomes digitados pelo usuário
            for(int i = 0; i < nomes.length; i++){
                System.out.println("Digite o nome " + i);
                nomes[i] = ler.nextLine();            
            }

            System.out.println("Os elementos do array são: " + Arrays.toString(nomes));
            
            System.out.println("Ordenando...");
            Arrays.sort(nomes);

            System.out.println("Array ordenado: " + Arrays.toString(nomes));

            System.out.println("Digite o nome a ser pesquisado: ");
            buscarNome = ler.nextLine();

            posicao = Arrays.binarySearch(nomes, buscarNome);
            if(posicao > 0){
                System.out.println("Posição do elemento " + buscarNome + " = " + posicao);
            }else{
                System.out.println("elemento não encontrado no Array");
            }
        }
    }

}