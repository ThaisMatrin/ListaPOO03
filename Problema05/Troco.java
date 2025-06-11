import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Preco unitario do produto: ");
        double preco = sc.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        double quant = sc.nextInt();

        System.out.println("Digite o valor pago pelo cliente: ");
        double pagou = sc.nextInt();

        if (pagou > (preco * quant)){
            System.out.printf("O Troco sera de %.2f%n", (pagou - (preco * quant) ));
        }

        else {
            System.out.printf("DINHEIRO INSUFICIENTE! Faltam %.2f%n", ((preco * quant) - pagou));
        }

    }
}
