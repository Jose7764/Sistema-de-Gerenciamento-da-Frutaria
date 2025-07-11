package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import model.Produto;
import model.Verduras;
import view.Atendente;

public class Estoque {

    Atendente atendente = new Atendente();
    Fruta fruta = new Fruta();
    Verduras verduras = new Verduras();
    Produto produto = new Produto();

    private List<Produto> estoqueProdutos;

    public Estoque() {
        estoqueProdutos = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcao) throws InterruptedException {

        switch (opcao) {

            case 1:
                String nomeFruta = atendente.CadastrarNome();
                double precoFruta = atendente.CadastrarPreco();
                int quantidadeFruta = atendente.CadastrarQuantidade();
                double pesoFruta = atendente.CadastrarPeso();

                fruta = new Fruta(nomeFruta, precoFruta, quantidadeFruta, pesoFruta);
                estoqueProdutos.add(fruta);

                break;

            case 2:

                for (Produto frutasListadas : estoqueProdutos ) {

                    System.out.println(frutasListadas);
                    System.out.println("---------------");
                }
                Thread.sleep(2000);
                break;

            case 3:

                atendente.escolhaExcluir();

                for (int cont = 0; cont < 1; cont++) {
                    int contador = 1;
                    for (Produto a: estoqueProdutos) {

                        System.out.println( "|| "+ contador + " - "+ a.getNome());
                        contador++;
                    }
                }

                int itemRemover =	atendente.escolherFrutaExcluir();
                int itemAtualizado = itemRemover -1;
                estoqueProdutos.remove(itemAtualizado);

                System.out.println("|------------------------|");

                atendente.atualizarEstoque();

                for (int cont = 0; cont < 1; cont++) {
                    int contador = 1;
                    for (Produto a: estoqueProdutos) {

                        System.out.println( + contador + " - "+ a.getNome());
                        contador++;
                    }
                }
                break;

            case 4:

                String nomeVerdura = atendente.CadastrarNome();
                double precoVerdura = atendente.CadastrarPreco();
                int quantidadeVerdura = atendente.CadastrarQuantidade();
                String tipo = atendente.CadastrarTipo();

                verduras = new Verduras(nomeVerdura, precoVerdura, quantidadeVerdura, tipo);
                estoqueProdutos.add(verduras);

                break;

            case 5:

                break;

            case 6:

                break;

            case 7:

                break;
            case 8:

                break;
            case 9:

                break;

            case 0:



            default:

        }

    }


}