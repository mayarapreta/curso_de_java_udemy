package exercicio;

public class LOOPFORPRIMOS {
    public static void main(String[] args) {
        System.out.println("LEIA OS NUMEROS PRIMOS");
        for (int num = 2; num <= 50; num++) {
            boolean ehPrimo = true;
            for (int j = 2; j < num; j++) {

                if (num % j == 0) {
                    ehPrimo = false;
                    break;
                }
                if(ehPrimo)
                    System.out.println(num + "é primo");
            }
        }
    }
}
