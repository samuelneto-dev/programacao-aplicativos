package br.senai.poo.atividade;

public class Exemplo {
    public static void main(String[] args) {
        
    	Loja loja = new Loja();

        Eletronico p1 = new Eletronico("iPhone 15", 1001, 5999.90, CategoriaProdutoEnum.SMARTPHONE);
        Eletronico p2 = new Eletronico("Galaxy S24", 1002, 4999.00, CategoriaProdutoEnum.SMARTPHONE);
        Eletronico p3 = new Eletronico("MacBook Pro", 2001, 12999.00, CategoriaProdutoEnum.NOTEBOOK);
        Eletronico p4 = new Eletronico("Dell XPS 13", 2002, 8500.50, CategoriaProdutoEnum.NOTEBOOK);
        Eletronico p5 = new Eletronico("Mouse Sem Fio", 3001, 150.00, CategoriaProdutoEnum.PERIFERICO);
        Eletronico p6 = new Eletronico("Teclado Mecânico", 3002, 350.00, CategoriaProdutoEnum.PERIFERICO);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);
        loja.adicionarProduto(p5);
        loja.adicionarProduto(p6);

        System.out.println("=== LISTAGEM DETALHADA DE TODOS OS PRODUTOS ===");
        for (Eletronico p : loja.listarProdutos()) {
            System.out.println(p.exibirInformacoes(true));
        }

        System.out.println("\n=== LISTAGEM RESUMIDA DE TODOS OS PRODUTOS ===");
        for (Eletronico p : loja.listarProdutos()) {
            System.out.println(p.exibirInformacoes(false));
        }

        System.out.println("\n=== PRODUTOS DA CATEGORIA SMARTPHONE ===");
        for (Eletronico p : loja.buscarPorCategoria(CategoriaProdutoEnum.SMARTPHONE)) {
            System.out.println(p.exibirInformacoes(true));
        }

        System.out.println("\n=== PRODUTOS DA CATEGORIA NOTEBOOK ===");
        for (Eletronico p : loja.buscarPorCategoria(CategoriaProdutoEnum.NOTEBOOK)) {
            System.out.println(p.exibirInformacoes(true));
        }
        System.out.println("\n=== PRODUTOS DA CATEGORIA PERIFERICO ===");
        for (Eletronico p : loja.buscarPorCategoria(CategoriaProdutoEnum.PERIFERICO)) {
            System.out.println(p.exibirInformacoes(true));
        }
    }
}
