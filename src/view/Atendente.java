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
        System.out.println("|| 1- Cadastrar Fruta   \uD83C\uDF4C                                         ||");
        System.out.println("|| 2- Listar Fruta      \uD83D\uDDD1\uFE0F                                         ||");
        System.out.println("|| 3- Remover Fruta     \uD83D\uDCCB                                         ||");
        System.out.println("|| 4- Cadastrar Verdura \uD83E\uDD66                                         ||");
        System.out.println("|| 5- Listar Verdura    \uD83D\uDCD1                                         ||");
        System.out.println("|| 6- Remover Verdura   \uD83D\uDEAB                                         ||");
        System.out.println("|| 4- Cadastrar Produto \uD83D\uDCE6                                         ||");
        System.out.println("|| 5- Listar Produto    \uD83D\uDCEB                                         ||");
        System.out.println("|| 6- Remover Produto   ❌                                         ||");
        System.out.println("||                                                    0 \uD83D\uDD1A - Sair  ||");
        System.out.println("||-----------------------------------------------------------------||");

        System.out.print("|| - ");
        int escolha = input.nextInt();

        System.out.println();

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
        System.out.println("||-----------------------------------------------------------------||");
        System.out.print("|| Insira o tipo:\n|| - ");
        String tipo = input.next();

        return tipo;
    }



    public void escolhaExcluir() {

        System.out.println("||-----------------------------------------------------------------||");
        System.out.println("||                   Qual Fruta deseja Remover?                    ||");
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