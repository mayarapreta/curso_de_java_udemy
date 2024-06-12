package exercicio;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE UM ANO");
        int ano = scanner.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println(ano + "É UM ANO BISSEXTO");
        }else {
            System.out.println(ano + "NÃO É UM ANO BISSEXTO");
        }
    }
}
