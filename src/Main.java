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

            if (opcao > 3 && opcao < 0) {
                atendente.Erro();
                return;
            }
            estoque.gerenciarEstoque(opcao);

            if(opcao == 0){
                break;
            }


        }







    }

}