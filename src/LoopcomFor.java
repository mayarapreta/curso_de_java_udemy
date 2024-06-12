import java.util.Scanner;

public class LoopcomFor {
    public static void main(String[] args) {

        System.out.println("DIGITE UM NUMERO");

        Scanner tecladoo = new Scanner(System.in);

        int valor = tecladoo.nextInt();

        for (int contadoo = 1; contadoo <= valor; contadoo++) {

            System.out.println(contadoo);
        }
        tecladoo.close();

    }

}
