package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // A String como sendo um dado e a partir dela consegue ter uma serie de funcionalidades que vai ajudar a trasnsformar esse dado. 
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Cassio".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "GUI")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
		
	}

}
