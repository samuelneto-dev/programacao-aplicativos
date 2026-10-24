package br.senai.poo.atividade;

public abstract class Produto {
	    
	   private String nome;
	    private Integer codigo;
	    private Double preco;

	    public Produto(String nome, Integer codigo, Double preco) {
	        this.nome = nome;
	        setCodigo(codigo);
	        setPreco(preco);
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Integer getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(Integer codigo) {
	        if (codigo == null || codigo < 0) {
	            throw new IllegalArgumentException("O código não pode ser nulo ou negativo.");
	        }
	        this.codigo = codigo;
	    }

	    public Double getPreco() {
	        return preco;
	    }

	    public void setPreco(Double preco) {
	        if (preco == null || preco <= 0) {
	            throw new IllegalArgumentException("O preço deve ser maior que zero e não nulo.");
	        }
	        this.preco = preco;
	    }

	    public abstract String exibirInformacoes();
}

