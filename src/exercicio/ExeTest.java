package exercicio;

import java.util.Scanner;

public class ExeTest {
    public static void main(String[] arg){

        Scanner teclado = new Scanner(System.in);
      /*
       1 - variaveis de tipo inteiro e calcule e soma
      System.out.println("Digite o primeiro numero  : ");

        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo numero : ");
        int num2= teclado.nextInt();

        int soma = num1 + num2;
        System.out.println("O Resultado da soma é: " + soma);
   scanner.close();

       // 2 - tipo double
        System.out.println("Digite um numero");

        double num  = teclado.nextDouble();

        double quadrado = num * num;

        System.out.println("O quadrado do numero é: " + quadrado);
        teclado.close();
/*
3- calcule a media de tres numero

        System.out.println("Digite a media da prova : ");

        int nota1 = teclado.nextInt();
        System.out.println("Digite  a segunda media da prova: ");
        int nota2= teclado.nextInt();

        System.out.println("Digite  a terceira media da prova: ");
        int nota3=teclado.nextInt();

      double media = (nota1 + nota2 + nota3)/3.0;
        System.out.println("O Resultado da sua nota da media é: " + media);


        //4 - determina que o numero é positivo,negativo ou zero.

        System.out.println("Digite qualquer numero:");
        int n = teclado.nextInt();

        //int soma = (n + n) /3;

        if (n > 0) {
            System.out.println("deu Positivo");
        }else if (n < 0) {

            System.out.println(" deu negativo");
        } else{

            System.out.println("deu zero");
        }


        //5 - celsius

        System.out.println("Qual é a temperatura do Celsius");
        double celsius = teclado.nextDouble();

        double fahrenheit = ((celsius * 9) / 5 )+ 32;
        System.out.println("A Temperatira do Celsius convertida de Fahrenheit foi  " + fahrenheit);

        // 6 - calcule um perimetro e a area de um retangulo

        System.out.println("Digite a largura  do retangulo");
        double largura = teclado.nextDouble();

        System.out.println("Digite a altura do  retangulo");
        double altura = teclado.nextDouble();

        double perimetro = 2 * (largura + altura);
         double area = largura * altura;

        System.out.println("O perimetro do retangulo é: " + perimetro);
        System.out.println("A area do retangulo é: " + area);
teclado.close();



        //7 - ler o ano de nascimento e a pessoa que poderar votar
        System.out.println("O ANO LEITORAL");

        System.out.println("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        System.out.println("Digite o ano de nascimento ?: ");
        int anoNascimento = teclado.nextInt();

        int resultado = anoAtual - anoNascimento;

        System.out.println("A sua idade  é: " + resultado );

        //resultado
        if (anoAtual-anoNascimento >= 18){
            System.out.println("MENOR DE IDADE, E NÃO PODER VOTAR.");
        } else if (anoAtual-anoNascimento < 60) {
            System.out.println("MAIOR DE IDADE, PODER VOTAR ESSE ANO");
        }else {
            System.out.println("VOCÊ É IDOSO, NÃO É OBRIGATORIO A VOTAR");
        }

        //8 -  valor das compras

        System.out.println("SUPER MERCADO");

        System.out.println("Digite o valor das compras das maças: ");
        int quanti = teclado.nextInt();


            double precoUnidade;
           if (quanti < 12){
               precoUnidade = 0.30;
           }else{
               precoUnidade = 0.25;
           }
              double valorTotal = quanti * precoUnidade;

        System.out.println("o valor total das compras R$: " + valorTotal);
 teclado.close();


*
        // 9-  Escreva um programa que leia as medidas dos lados de um triângulo e escreva se
        //ele é Equilátero, Isósceles ou Escaleno. Sendo que:
        //a. Triângulo Equilátero: possui os 3 lados iguais.
        //b. Triângulo Isósceles: possui 2 ladosiguais.
        //c. Triângulo Escaleno: possui 3 ladosdiferentes

        System.out.println("DIGITE AS MEDIDAS DOS LADOS TRIANGULO ");

        System.out.println("Lado 1: ");
        double lado1 = teclado.nextDouble();

        System.out.println("Lado 2 :");
        double lado2 = teclado.nextDouble();

        System.out.println("Lado 3: ");
         double lado3 = teclado.nextDouble();
         //Verificando o tipo de triangulo
             if( lado1==lado2 && lado2 == lado3){
                 System.out.println("O triangulo é Equilatero");
             } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                 System.out.println("O triangulo é Isosceles");
             }else{
                 System.out.println("O triangulo é Escaleno");
             }
             teclado.close();


       */ //10 - solicitando a  entrada de altura e do sexo

        System.out.println("Digite a altura (em metro): ");
        double  altura = teclado.nextDouble();

        System.out.println("Digite o sexo (1 para feminino, 2 para masculino): ");
              int sexo = teclado.nextInt();


         //calcule o peso ideal com base no sexo

        double pesoIdeal;
       if (sexo == 1 ) {
         pesoIdeal = (62.1 * altura ) -44.7;
       }else if( sexo == 2){
           pesoIdeal = (27.7 * altura)-58;
        }else {
            System.out.println("sexo invalido.");
            return;
        }

       //exibindo o peso ideal

        System.out.println("O peso ideal é: " +pesoIdeal+ "Kg");

     teclado.close();


    }
}
