import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
//leitura de teclado
        Scanner leitorTeclado = new Scanner(System.in);

        //peso divo(altura * altura)
        System.out.println("Digite seu peso (em KILOS):" );
        float peso = leitorTeclado.nextFloat();

        System.out.println("Agora, digite a sua altura (em centimetros)");
        float altura = leitorTeclado.nextFloat();

        float resultado = peso /(altura * altura);

        System.out.println("O IMC para o peso: " + peso + ", e altura  " + altura + "é  " + resultado);

        leitorTeclado.close(); //pra fecha o teclado
    }
}
