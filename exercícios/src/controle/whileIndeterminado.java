package controle;

import java.util.Scanner;

public class whileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) { // enquanto n�o dizer a palavrea sair o programa vai continuar rodando inderterminadas vezes
			System.out.println("Voc� diz: ");
			valor = entrada.nextLine();
		}		
		
		entrada.close();
	}

}
