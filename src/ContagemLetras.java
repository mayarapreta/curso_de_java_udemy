import java.util.Scanner;

public class ContagemLetras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String frase = teclado.nextLine();
        int quantidadeLetras = 0;

        for( int indice = 0 ; indice < frase.length() ; indice ++ ){
           char letra = frase.charAt(indice);
           boolean isLtra = Character.isLetter(letra);

           if (isLtra){
               quantidadeLetras++;
           }
        }

        System.out.println("A quantidade de letra: " + quantidadeLetras);


        teclado.close();
    }
}
