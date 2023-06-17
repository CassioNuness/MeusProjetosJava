package Classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
	    //dia = 12;
	    //mes = 02;
	    //ano = 1993;
	    this(12, 02, 1993);
	    
	}
	
	Data(int dia, int mes, int ano){
	    this.dia = dia;
	    this.mes = mes;
	    this.ano = ano;
	    
	   	}
	
	String obterDataFormatada() {
	    final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano) ;
	}
	
	void imprimirDataFormatada() {
	    System.out.println(this.obterDataFormatada());
	}
	

}
