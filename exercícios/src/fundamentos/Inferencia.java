package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.6; // declaração e inicialização
		System.out.println(a);
	//no java a variavel que colocamos sempre sera a mesma e não pode ser diferente.
		// valores com casas decimais consegue receber o valor de inteiro.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // variável foi declarada
		d = 123.65; // varável foi inicializada
		System.out.println(d); // usada!
		
		var e = 123.45; // um var sempre na mesma linha será declarado e inicializado.
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01 - uma vez que vc coloque valores inteiros, você não consegue colocar valores quebrados.
		System.out.println(f);
	}

}
