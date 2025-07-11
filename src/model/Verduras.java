package model;

public class Verduras extends Produto {

    String tipo;

    public Verduras() {
        super("", 0.0, 0);
        this.tipo = "";
    }

    public Verduras(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "||=================================================================||\n"
                + "Nome da Verdura 🥬   : " + getNome() +
                "\nPreço             💵 : " + getPreco() +
                "\nQuantidade        📦 : " + getQuantidade()+
                "\nTipo              💵 : "+ this.tipo;
    }
}
