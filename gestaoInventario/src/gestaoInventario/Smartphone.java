package gestaoInventario;

public class Smartphone extends Produto {
    private int bateriaMah;
    private int armazenamentoGb;

    public Smartphone(String codigo, String nome, String marca, double preco, 
                      EstadoProduto estado, int bateriaMah, int armazenamentoGb) {
        super(codigo, nome, marca, preco, CategoriaProdutos.SMARTPHONE, estado);
        this.bateriaMah = bateriaMah;
        this.armazenamentoGb = armazenamentoGb;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("=== FICHA TÉCNICA: SMARTPHONE ===");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + getMarca());
        System.out.printf("Preço: R$ %.2f\n", getPreco());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Estado: " + getEstado());
        System.out.println("Bateria: " + bateriaMah + " mAh");
        System.out.println("Armazenamento: " + armazenamentoGb + " GB");
        System.out.println("---------------------------------");
    }
}
