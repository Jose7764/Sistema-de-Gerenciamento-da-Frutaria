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
                int escolha = atendente.escolhaTipoProduto();

                if (escolha > 2 || escolha < 1) {
                    atendente.Erro();
                    return;
                }
                switch (escolha) {
                    case 1:
                        String nomeFruta = atendente.CadastrarNome();
                        double precoFruta = atendente.CadastrarPreco();
                        int quantidadeFruta = atendente.CadastrarQuantidade();
                        double pesoFruta = atendente.CadastrarPeso();

                        fruta = new Fruta(nomeFruta, precoFruta, quantidadeFruta, pesoFruta);
                        estoqueProdutos.add(fruta);

                        atendente.frutaCadastrada();
                        break;

                    case 2:

                        String nomeVerdura = atendente.CadastrarNome();
                        double precoVerdura = atendente.CadastrarPreco();
                        int quantidadeVerdura = atendente.CadastrarQuantidade();
                        String tipo = atendente.CadastrarTipo();

                        verduras = new Verduras(nomeVerdura, precoVerdura, quantidadeVerdura, tipo);
                        estoqueProdutos.add(verduras);

                        atendente.verduraCadastrada();
                        break;
                }

                break;

            case 2:

                int escolhaListar = atendente.listarEscolha();

                if (estoqueProdutos.isEmpty()) {
                    atendente.ListaVacia();
                }

                if (opcao > 3 || opcao < 0) {
                    atendente.Erro();
                    return;
                }
                switch (escolhaListar) {
                    case 1:

                        for (Produto produto : estoqueProdutos) {
                            if (produto instanceof Fruta fruta) {
                                System.out.println(fruta);
                            }
                        }

                        break;

                    case 2:

                        for(Produto produto : estoqueProdutos) {
                            if (produto instanceof Verduras verduras) {
                                System.out.println(verduras);
                            }
                        }

                         break;

                    case 3:
                        for (Produto produtosListados : estoqueProdutos ) {

                            System.out.println(produtosListados);
                            System.out.println("---------------");
                        }
                        Thread.sleep(2000);
                         break;
                }


                break;


            case 3:

                if (estoqueProdutos.isEmpty()) {
                    atendente.ListaVacia();
                }else {

                    for (int cont = 0; cont < 1; cont++) {
                        int contador = 1;
                        for (Produto a : estoqueProdutos) {

                            System.out.println("|| " + contador + " - " + a.getNome());
                            contador++;
                        }
                    }

                    int produtoRemover = atendente.removerEscolha();

                    if (produtoRemover > estoqueProdutos.size() || opcao <= 0) {
                        atendente.Erro();
                        return;
                    }

                    int produtoAtualizado = produtoRemover - 1;
                    estoqueProdutos.remove(produtoAtualizado);

                    atendente.atualizarEstoque();

                }
                break;

            case 0:



            default:

        }

    }


}