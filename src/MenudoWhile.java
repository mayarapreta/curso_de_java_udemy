import java.util.Scanner;

public class MenudoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        do{
            System.out.println("Digite uma opção do menu: ");
            System.out.println("1. Sanduiche");
            System.out.println("2.Pizza");
            System.out.println("3.Sorvete");
            System.out.println("0.sair ");
           
            opcao = leitor.nextInt();
            
            if(opcao == 0){
                System.out.println("Saindo do sistema:");
            } else if (opcao == 1) {
                System.out.println("Você pegou um sanduiche");
            } else if (opcao==2) {
                System.out.println("Você pagou uma Pizza");
            }else{
                System.out.println("Você pagou um sorvete");
            }
        }while(opcao != 0);
        

    }
}
