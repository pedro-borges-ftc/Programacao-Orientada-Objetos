import java.util.Scanner;

public class Principal08 {
    public static void main(String args[]) {
		PessoaFisica pf1 = new PessoaFisica();
		PessoaJuridica pj1 = new PessoaJuridica();
		Scanner ler = new Scanner(System.in);			
		int opcao = 1;
		String n, e, c;
      
    	while(opcao != 0){
    
			System.out.println("*******Menu**********");
			System.out.println("0-Sair");
			System.out.println("1-Inserir PF");
			System.out.println("2-Imprimir PF");
			System.out.println("3-Inserir PJ");
			System.out.println("4-Imprimir PJ");
			
			opcao = ler.nextInt();
			ler.nextLine();

        	switch(opcao){
        		case 0: //sair
        			System.out.println("***FIM DO PROGRAMA***");
        			break;
        		case 1: //Inserir PF
					System.out.println("***PESSOA FÍSICA***");
					System.out.println("Digite o nome: ");
					n = ler.nextLine();
					pf1.setNome(n);//***************
					
					System.out.println("Digite o endereco: ");
					e = ler.nextLine();
					pf1.setEndereco(e);//***************
					
					System.out.println("Digite o cpf: ");
					c = ler.next();
					pf1.setCpf(c);
        			break;
        		case 2: //Imprimir PF
					System.out.println("***PESSOA FÍSICA***");
        			System.out.println(pf1.imprimirPessoaFisica());
        			break;
        		case 3: //Inserir PJ
					System.out.println("***PESSOA JURÍDICA***");
					System.out.println("Digite o nome: ");
					n = ler.nextLine();
					pj1.setNome(n);//***************
					
					System.out.println("Digite o endereco: ");
					e = ler.nextLine();
					pj1.setEndereco(e);//***************
					
					System.out.println("Digite o CNPJ: ");
					c = ler.next();
					pj1.setCnpj(c);
        			break;
        		case 4://Imprimir PJ
					System.out.println("***PESSOA JURÍDICA***");
        			System.out.println(pj1.imprimirPessoaJuridica());
        			break;

        		default:
        			System.out.println("Opção Inválida");
        	}//Fim do Switch
			
        }//Fim do Loop
        
		ler.close();
    }//Fim do Main
    
}//Fim da Classe