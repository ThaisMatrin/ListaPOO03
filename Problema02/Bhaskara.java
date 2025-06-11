import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Digite o coeficiente a: ");
        double a = sc.nextInt();

        System.out.println("Digite o coeficiente b: ");
        double b = sc.nextInt();

        System.out.println("Digite o coeficiente c: ");
        double c = sc.nextInt();

        double quadradoB = Math.pow(b,2);

        double delta = quadradoB - 4 * a * c;

        if (delta < 0){
            System.out.println("O resultado não possui raiz real");
            
        }
        else {
             double raiz = Math.sqrt(delta);

            double x1 = (- b + raiz) / 2 * a;
            double x2 = ( - b - raiz) / 2 * a;

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);

        }
       
    }
}
