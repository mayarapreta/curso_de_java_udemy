package exercicio;

public class multiplosfor {
    public static void main(String[] args) {
        System.out.println(" PARA OS NUMEROS QUE SÃO MULTIPLOS DE AMBOS");

        for (int num = 1 ; num <= 100; num++){
            if (num % 3 == 0 && num % 6 == 0){
                System.out.println("FISSBUZZ");
            } else if (num % 3 == 0) {
                System.out.println("FIZZ");
            } else if ( num % 5 == 0) {
                System.out.println(" BUZZ");
            } else {
                System.out.println(num);
            }
        }
    }
}
