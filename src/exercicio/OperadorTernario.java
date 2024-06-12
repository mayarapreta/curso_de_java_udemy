package exercicio;

public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 20;
        int idadeMinima = 18;
        int anoNascimento = 2000;

        if(  idade > idadeMinima && anoNascimento >= 2000 && idadeMinima <20){

            System.out.println("Executar o IF com a logica do E");
        }
        if(idade > idadeMinima || anoNascimento >=2000){
            System.out.println("Execute essa lógica do  OU");
        }
        String deMaior = idade >= 18 ? "sim, é do maior ": " Não, é do menor";
        System.out.println(deMaior);
    }
}
