package gestaoInventario;

public abstract class Produto {
    private String codigo;
    private String nome;
    private String marca;
    private double preco;
    private CategoriaProdutos categoria;
    private EstadoProduto estado;

    public Produto(String codigo, String nome, String marca, double preco, CategoriaProdutos categoria, EstadoProduto estado) {
        setCodigo(codigo);
        setPreco(preco);
        
        if (categoria == null || estado == null) {
            throw new IllegalArgumentException("Categoria e Estado são obrigatórios.");
        }

        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código identificador não pode ser nulo nem vazio.");
        }
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço de venda deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getMarca() { return marca; }
    public CategoriaProdutos getCategoria() { return categoria; }
    public EstadoProduto getEstado() { return estado; }

    public abstract void exibirFichaTecnica();
}

