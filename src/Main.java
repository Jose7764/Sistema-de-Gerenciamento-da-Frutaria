import view.Atendente;
import service.Estoque;
import model.Fruta;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Estoque estoque = new Estoque();
        Atendente atendente = new Atendente();
        Fruta fruta = new Fruta();



        try {
                while (true) {

                    int opcao = atendente.menuPrincipal();


                    if (opcao > 3 || opcao < 0) {
                        atendente.Erro();
                        continue;
                    }
                    estoque.gerenciarEstoque(opcao);

                    if(opcao == 0){
                        break;
                    }
                }
            } catch (InputMismatchException erro) {
                atendente.Erro();
                main(args);
            }
        }
}