 package controle;

import java.util.Scanner;

public class DowWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar "
					+ "\n as palavra magica...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("Por favor"));
		
		
		System.out.println("Obrigado");		
		entrada.close();
	}

}
