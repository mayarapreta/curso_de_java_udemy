import java.util.Scanner;

public class LoopcomDoWhile {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Digite um numero entre 1 e 10: ");
            numero = leitor.nextInt();

        }while(numero < 1 || numero > 10 );

        System.out.println("O NUMERO DIGITADO E VALIDO FOI : " + numero);

        leitor.close();
    }
}
