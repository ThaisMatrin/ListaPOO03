import java.util.Scanner;

public class PlanoTelefone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos consumidos: ");
        int min = sc.nextInt();

        if ( min > 100){

            int ultrapassou = (min - 100) * 2;

             System.out.printf("O valor a ser pago %.2f%n",50.00 + ultrapassou);
        }

        else{
            System.out.printf("O valor a ser pago %.2f%n",50.00);
        }
    }
}
