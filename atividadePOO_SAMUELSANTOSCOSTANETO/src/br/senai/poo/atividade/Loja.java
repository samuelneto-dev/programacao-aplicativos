package br.senai.poo.atividade;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    
	private List<Eletronico> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Eletronico produto) {
        if (produto != null) {
            this.produtos.add(produto);
        }
    }

    public List<Eletronico> listarProdutos() {
        return this.produtos;
    }

    public List<Eletronico> buscarPorCategoria(CategoriaProdutoEnum categoria) {
        List<Eletronico> filtrados = new ArrayList<>();
        for (Eletronico p : produtos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public Eletronico buscarPorNome(String nome) {
        for (Eletronico p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        System.out.println("Produto não encontrado");
        return null;
    }
}