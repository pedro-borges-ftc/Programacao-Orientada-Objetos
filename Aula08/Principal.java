import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
    PessoaFisica pf1 = new PessoaFisica();
    PessoaJuridica pj1 = new PessoaJuridica();
        
     int opcao = 1;
      
      while(opcao != 0){
    
        	opcao = imprimirMenu();
        	
        	switch(opcao){
        		case 0: //sair
        			System.out.println("***FIM DO PROGRAMA***");
        			break;
        		case 1: //Inserir PF
        	        pf1.preencherDados();
        			break;
        		case 2: //Imprimir PF
        			System.out.println(pf1.imprimirPessoaFisica());
        			break;
        		case 3: //Inserir PJ
        			pj1.preencherDados();
        			break;
        		case 4://Imprimir PJ
        			System.out.println(pj1.imprimirPessoaJuridica());
        			break;

        		default:
        			System.out.println("Opção Inválida");
        	}//Fim do Switch
        
        }//Fim do Loop
        
    }//Fim do Main
    
    public static int imprimirMenu(){
        try (Scanner ler = new Scanner(System.in)) {
			System.out.println("*******Menu do Pedido**********");
			System.out.println("0-Sair");
			System.out.println("1-Inserir PF");
			System.out.println("2-Imprimir PF");
			System.out.println("3-Inserir PJ");
			System.out.println("4-Imprimir PJ");

			return ler.nextInt();
		}
    }
}//Fim da Classe

