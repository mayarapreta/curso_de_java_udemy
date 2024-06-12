import java.util.Scanner;
public class CalculadoraIdade {

    public static void main(String[] args) {
        Scanner leitorIdade = new Scanner(System.in);

        System.out.println("Digite o ano atual: ");
        int anoAtual = leitorIdade.nextInt();
        System.out.println("Digite o ano de nascimento ?: ");
        int anoNascimento = leitorIdade.nextInt();

        int resultado = anoAtual - anoNascimento;

        System.out.println("A sua idade  é: " + resultado );

        //resultado
        if (resultado < 18){
            System.out.println("você é Menor de idade.");
        } else if (resultado < 60) {
            System.out.println("Você é de Maior.");
        }else {
            System.out.println("Você é idoso.");
        }
if (resultado < 12){
    System.out.println("você é uma criança.");
}
        leitorIdade.close();
    }
}
