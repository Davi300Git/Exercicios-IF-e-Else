// Escreva um algoritmo que solicite um número ao usuário. 
// Caso seja digitado um valor entre 0 e 9, mostre: “valor correto”,
//  caso contrário mostre: “valor incorreto”.
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = verifica.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.put.println("Valor correto");
        }else {
            System.out.println("Valor incorreto");
        }

        vareifica.close();
    }
}