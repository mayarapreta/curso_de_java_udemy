package exercicio;

public class NumeroPerfeito {
    public static void main(String[] args) {
        int num = 28;
        int somaDivisores = 0;
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                somaDivisores += i;
            }
         if( somaDivisores == num){
             System.out.println(num + " é um numero perfeito");
         }else {
             System.out.println( num + "não é  um numero perfeito");
         }
        }

    }
}
