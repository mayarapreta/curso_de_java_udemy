package exercicio;

public class calculeloopwhile {
    public static void main(String[] args) {
       int i = 1;

        int sum = 0;

        while (sum <= 100){
            sum +=i;
            i++;
        }
        System.out.println("A SOMA: " + sum);

    }
}
