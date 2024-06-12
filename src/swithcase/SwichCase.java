package swithcase;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
      double valortotal = 0;
      do   {
            System.out.println("Digite uma opcao do menu");
            System.out.println("1. Sanduiche(R$ 10,00)");
            System.out.println("2. Pizza (R$ 30,00)");
            System.out.println("3. Sovete (R$ 5,00)");
            System.out.println("0. Finalizar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Sanduiche");
                    valortotal+=10;
                    break;
                case 2:
                    System.out.println("Pizza");
                    valortotal+=30;
                    break;
                case 3:
                    System.out.println("Sorvete");
                    valortotal+=5;
                    break;
                case 0:
                    System.out.println("Finalizando o pedido!");
                    break;
                default:
                    System.out.println("Escolha uma opcão valida.");
            }



        }while (opcao != 0) ;
        System.out.println("O valor total do seu pedido é: " + valortotal);
        scanner.close();
    }
}

