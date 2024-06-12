package exercicio;

public class whilenumrointeiro {
    public static void main(String[] args) {
        int  num  = 12345;
        int soma = 0;
        while ( num != 0) {

            soma += num %10;
            num /=10;
        }
        System.out.println("SOMA DOS DIGITOS: " + soma);
    }
}
