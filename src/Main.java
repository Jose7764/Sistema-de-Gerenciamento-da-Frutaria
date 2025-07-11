import view.Atendente;
import service.Estoque;
import model.Fruta;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Estoque estoque = new Estoque();
        Atendente atendente = new Atendente();
        Fruta fruta = new Fruta();

        while (true) {

            int opcao = atendente.menuPrincipal();

            estoque.gerenciarEstoque(opcao);

            if(opcao == 0){
                break;
            }


        }







    }

}