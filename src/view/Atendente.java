package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Fruta;

public class Atendente {

    Scanner input;

    public Atendente() { input = new Scanner(System.in); }

    public Scanner getInput() { return input; }

    public void setInput(Scanner input) { this.input = input;}

    public int menuPrincipal() {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                      Frutaria Do Cubano                         ||");
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("|| 1- Cadastrar Produto \uD83D\uDCE6                                         ||");
        System.out.println("|| 2- Listar Produto    \uD83D\uDCEB                                         ||");
        System.out.println("|| 3- Remover Produto   ❌                                         ||");
        System.out.println("||                                                    0 \uD83D\uDD1A - Sair  ||");
        System.out.println("||-----------------------------------------------------------------||");

        System.out.print("|| - ");
        int escolha = input.nextInt();

        System.out.println();

        return escolha;

    }

    public int escolhaTipoProduto() {
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                  Qual Produto deseja Cadastrar?                 ||");
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("|| 1- Fruta \uD83C\uDF4E                                                      ||");
        System.out.println("|| 2- Verdura 🥬                                                    ||");
        System.out.println("||-----------------------------------------------------------------||");

        System.out.print("|| - ");
        int escolha = input.nextInt();

        return escolha;
    }

    public void frutaCadastrada() {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                Fruta Cadastrada com Sucesso!                    ||");
        System.out.println("||-----------------------------------------------------------------||");

    }

    public void verduraCadastrada() {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                Fruta Cadastrada com Sucesso!                    ||");
        System.out.println("||-----------------------------------------------------------------||");

    }

    public int listarEscolha() {
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                       O que deseja Listar?                      ||");
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("|| 1- Fruta \uD83C\uDF4E                                                      ||");
        System.out.println("|| 2- Verdura 🥬                                                    ||");
        System.out.println("|| 3- Produto \uD83D\uDCE6                                                    ||");
        System.out.println("||-----------------------------------------------------------------||");

        System.out.print("|| - ");
        int escolha = input.nextInt();
        System.out.println("||-----------------------------------------------------------------||");
        return escolha;
    }

    public int removerEscolha() {
        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                      O que deseja Remover?                      ||");
        System.out.println("||-----------------------------------------------------------------||");

        System.out.print("|| - ");
        int escolha = input.nextInt();
        System.out.println("||-----------------------------------------------------------------||");
        return escolha;
    }

    public String CadastrarNome() {
        System.out.println("||-----------------------------------------------------------------||");
        System.out.print("|| Insira o nome:\n|| - ");
        String nome = input.next();

        return nome;
    }

    public double CadastrarPreco(){
        System.out.print("|| Insira o Preço: \n|| - ");
        double preco = input.nextDouble();

        return preco;
    }

    public int CadastrarQuantidade() {
        System.out.print("|| Insira a Quantidade: \n|| - ");
        int quantidade = input.nextInt();

        return quantidade;
    }

    public double CadastrarPeso(){
        System.out.print("|| Insira o Peso: \n|| - ");
        double peso = input.nextDouble();

        return peso;
    }

    public String CadastrarTipo() {
        System.out.print("|| Insira o tipo:\n|| - ");
        String tipo = input.next();

        return tipo;
    }


    public void Erro () {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                  Digite uma opção valida!                       ||");
        System.out.println("||-----------------------------------------------------------------||");
    }


    public void ListaVacia () {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                         Estoque vacio!                          ||");
        System.out.println("||-----------------------------------------------------------------||");
    }

    public int escolherFrutaExcluir() {

        System.out.print("|| Insira aqui: ");
        int escolha = input.nextInt();
        return escolha;
    }

    public void atualizarEstoque () {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||               Estoque Atualizado com Sucesso!!!                 ||");
        System.out.println("||-----------------------------------------------------------------||");
    }

}