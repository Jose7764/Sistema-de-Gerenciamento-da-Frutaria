package model;

public class Fruta extends Produto {
    double peso;
    public Fruta() {
        super("", 0.0, 0);
        this.peso = 0;
    }

    public Fruta(String nome, double preco, int quantidade, double peso) {
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return
                "Nome       \uD83C\uDF4E: " + getNome() +
                "\nPreço      💵: " + getPreco() +
                "\nQuantidade 📦: " + getQuantidade()+
                "\nPeso       💵: " + this.peso;
    }
}
