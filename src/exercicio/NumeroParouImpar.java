package exercicio;

import java.util.Scanner;

public class NumeroParouImpar {
    public static void main(String[] args) {
        //int num = 7;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite qualquer numero");
        int num=  teclado.nextInt();

        if(num % 2 == 0){
            System.out.println(num + "É PAR");
        }else {
            System.out.println( num + " É IMPAR");
        }
    }
}
