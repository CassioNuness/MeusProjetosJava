package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("Tabela verdade E (AND)"); //tem de ter os dois pra ser verdadeiro.
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\nTabela verdade OU (OR)"); //tem de ter um ou outro pra ser verdadeiro.
		//System.out.println(true || true);
		//System.out.println(true ||false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade Ou Exclusivo (XOR)"); //se os dois forem diferentes assim sera verdadeiro.
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade NOT"); //aonde e verdadeiro vira falso e falso vira verdadeiro
		System.out.println(!true);
		System.out.println(!false);
		
		
		
	}

}
