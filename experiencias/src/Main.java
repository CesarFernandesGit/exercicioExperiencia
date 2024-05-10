import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int casos = scanner.nextInt();
		
		int quantidadeCobaia = 0;
		char cobaia;
		int contagemCoelho = 0; 
		int contagemRato = 0; 
		int contagemSapo = 0;
		
		for (int i = 0; i < casos; i++) {
			
			System.out.print("Quantidade de cobaias: ");
			quantidadeCobaia = scanner.nextInt();
			
			System.out.print("Tipo de cobaia: ");
			cobaia = scanner.next().charAt(0);
			
			if (cobaia == 'C') {
				contagemCoelho += quantidadeCobaia;
			} else if (cobaia == 'R') {
				contagemRato += quantidadeCobaia;
			} else if (cobaia == 'S') {
				contagemSapo += quantidadeCobaia;
			}
				
		}
			
			int total = contagemCoelho + contagemRato + contagemSapo;
			
			System.out.println();
			System.out.println("RELATORIO FINAL:");
			System.out.printf("Total: %d cobaias%n", total);
			System.out.printf("Total de coelhos: %d%n", contagemCoelho);
			System.out.printf("Total de ratos: %d%n", contagemRato);
			System.out.printf("Total de sapos: %d%n", contagemSapo);
			
			double percentualCoelho = contagemCoelho / (double) total * 100;
			double percentualRato = contagemRato / (double) total * 100;
			double percentualSapo = contagemSapo / (double) total * 100;
					
			System.out.printf("Percentual de coelhos: %.2f%n", percentualCoelho);
			System.out.printf("Percentual de ratos: %.2f%n", percentualRato);
			System.out.printf("Percentual de sapos: %.2f%n", percentualSapo);
		
		scanner.close();
	}

}
