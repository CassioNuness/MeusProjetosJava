package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? 
				"Aprovado." : "resultadoparcial.";
		
		System.out.println("O aluno est� : " + resultadoFinal);
	}

}
