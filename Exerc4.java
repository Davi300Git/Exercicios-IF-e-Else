// Elabore um algoritmo para calcular as raízes de uma equação de segundo grau
// , mas verifique nesta versão que delta deverá ser um valor positivo, para poder 
// calcular e visualizar as raízes reais da equação. Caso contrário, visualize uma mensagem 
// explicando que não serão calculadas as raízes. 
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = verifica.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = verifica.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = verifica.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: %.2f e %.2f%n", raiz1, raiz2);
        } else {
            System.out.println("Delta é negativo. Não serão calculadas as raízes reais.");
        }

        verifica.close();
    }
}