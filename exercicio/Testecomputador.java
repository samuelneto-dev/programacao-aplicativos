package exercicio;

public class Testecomputador {

	public static void main(String[] args) {
	       
	       Monitor Monitor01 = new Monitor("LED",24,  700);
	       Computador Computador01 = new Computador("LG", "Preto", "Samsung",5000, Monitor01);
	       Computador01.valorTotal();
	       
	    }
}
