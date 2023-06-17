package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2)); // uma funcioinalidade pertencentes a String
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde")); //compara��o de igualdade usando uma String para comparar uma com a outra usa o ".squals"
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
		+ sobrenome + "\nidade: "+ idade + 
		" \nSalario: " + salario + "\n\n");
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\n	O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		// %s representa uma String; � e um jeito mais facil de fazer colocando a String sem fazer o c�digo ficar extenso.
		//%d	representa n�meros inteiros;
		//%f	representa n�meros floats;
		//%2f	representa n�meros doubles;
		//%b	representa valores booleanos;
		//%c	representa valores char;

	}

}
