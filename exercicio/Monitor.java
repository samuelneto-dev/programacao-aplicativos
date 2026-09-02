package exercicio;

public class Monitor {
	 private  String tipoTela;
     private int tamanho;
     private double preco;
     
     public Monitor(String tipoTela, int tamanho, double preco) {
        super();
        this.tipoTela = tipoTela;
        this.tamanho = tamanho;
        this.preco = preco;
     }

     public String getTipoTela() {
        return tipoTela;
     }
     public void settipoTela (String tipoTela) {
        this.tipoTela = tipoTela;       
     }
     public int getTamanho() {
        return tamanho;        
     }
     public void settamanho (int tamanho) {
        this.tamanho = tamanho;       
     }
     public double getPreco() {
        return preco;      
     }
     public void setpreco (double preco) {
        this.preco = preco;   
  }
}
