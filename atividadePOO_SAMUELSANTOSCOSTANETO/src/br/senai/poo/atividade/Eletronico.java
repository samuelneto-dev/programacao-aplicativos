package br.senai.poo.atividade;

public class Eletronico extends Produto {
 
 private CategoriaProdutoEnum categoria;
 private Integer id;
 
 private static Integer proximoId = 1;

 public Eletronico(String nome, Integer codigo, Double preco, CategoriaProdutoEnum categoria) {
     super(nome, codigo, preco);
     this.categoria = categoria;
     this.id = proximoId++; 
 }

 public CategoriaProdutoEnum getCategoria() {
     return categoria;
 }

 public void setCategoria(CategoriaProdutoEnum categoria) {
     this.categoria = categoria;
 }

 public Integer getId() {
     return id;
 }

 @Override
 public String exibirInformacoes() {
     return "Eletrônico ID: " + id + 
            " | Nome: " + getNome() + 
            " | Código: " + getCodigo() + 
            " | Preço: R$ " + getPreco() + 
            " | Categoria: " + categoria;
 }

 public String exibirInformacoes(Boolean detalhado) {
     if (detalhado != null && detalhado) {
         return "Eletrônico [" + id + "]: [" + getNome() + 
                "] Código: [" + getCodigo() + 
                "] Preço: [" + getPreco() + 
                "] Categoria: [" + categoria + "]";
     } else {
         return getNome();
     }
 }
}