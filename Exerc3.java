// Uma empresa está selecionando entre seus estagiários os que irão
//  fazer um treinamento especial. O selecionado deve satisfazer ao mesmo tempo a dois critérios.
// O primeiro critério é que ele deve ter uma bolsa maior ou igual a R$ 750,00 e menor ou igual a R$ 950,00.
//O segundo critério leva em conta o tempo de estágio, este deve ser maior ou igual a 2 anos.
//Escreva um algoritmo que solicite ao usuário o valor da bolsa e o tempo de estágio, 
// e caso os critérios acima sejam satisfeitos, mostre a mensagem “Participará do treinamento”, 
// caso contrário mostre “Não participará”.
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite o valor da bolsa: ");
        double bolsa = verifica.nextDouble();

        System.out.print("Digite o tempo de estágio (em anos): ");
        int tempoEstagio = verifica.nextInt();

        if (bolsa >= 750 && bolsa <= 950 && tempoEstagio >= 2) {
            System.out.println("Participará do treinamento");
        } else {
            System.out.println("Não participará");
        }

        verifica.close();
    }
}   