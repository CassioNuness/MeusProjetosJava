package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.6; // declara��o e inicializa��o
		System.out.println(a);
	//no java a variavel que colocamos sempre sera a mesma e n�o pode ser diferente.
		// valores com casas decimais consegue receber o valor de inteiro.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; // vari�vel foi declarada
		d = 123.65; // var�vel foi inicializada
		System.out.println(d); // usada!
		
		var e = 123.45; // um var sempre na mesma linha ser� declarado e inicializado.
		System.out.println(e);
		
		var f = 12; // inteiro
		// f = 12.01 - uma vez que vc coloque valores inteiros, voc� n�o consegue colocar valores quebrados.
		System.out.println(f);
	}

}
