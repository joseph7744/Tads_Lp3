package br.edu.ifsp.orderflow.domain;

public class ItemPedido {

    private final Produto produto;
    private final int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    @Override
    public String toString() {
        return "Item (" + this.produto + ") Possui: " + this.quantidade + " no estoque ";
    }
}
