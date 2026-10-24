package exercicio;

public class Computador {
    private  String marca;
    private String cor;
    private String modelo; 
    private double valor;
    private Monitor monitor;
    
    
    public Computador(String marca, String cor, String modelo, double valor, Monitor monitor) {
       super();
       this.marca = marca;
       this.cor = cor;
       this.modelo = modelo;
       this.valor = valor;
       this.monitor = monitor;
    }
    public void valorTotal() {
       System.out.println(" O valor total do computador " + this.marca + " com o monitor de " + monitor.getTamanho()+ " polegadas " + 
          monitor.getTipoTela()+ " ficou de: R$ " +(this.valor+monitor.getPreco()));
    }
}
