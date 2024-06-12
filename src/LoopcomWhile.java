import java.util.Scanner;

public class LoopcomWhile {

    public static void main(String[] args) {

        System.out.println("DIGITE O VALOR: ");
        Scanner teclado = new Scanner(System.in);


        int contador = teclado.nextInt();
        int valor = 2;

        while (valor <= contador) {

            if (valor % 2 == 0) {
                System.out.println(valor);
            }
            valor++;

        }
        teclado.close();
    }
}