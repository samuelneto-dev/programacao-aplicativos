package gestaoInventario;

public class Laptop extends Produto {
    private double tamanhoTelaPolegadas;
    private String processador;

    public Laptop(String codigo, String nome, String marca, double preco, 
                  EstadoProduto estado, double tamanhoTelaPolegadas, String processador) {
        super(codigo, nome, marca, preco, CategoriaProdutos.LAPTOP, estado);
        this.tamanhoTelaPolegadas = tamanhoTelaPolegadas;
        this.processador = processador;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("=== FICHA TÉCNICA: LAPTOP ===");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Estado: " + getEstado());
        System.out.println("Tela: " + tamanhoTelaPolegadas + "''");
        System.out.println("Processador: " + processador);
        System.out.println("---------------------------------");
    }
}