import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y, resultado;

        System.out.println("Digite a Primeira Nota: ");
        x = sc.nextInt();

        System.out.println("Digite o Segunda Nota: ");
        y = sc.nextInt();

        resultado = (x + y);

         System.out.printf("A Média = %.1f%n", resultado);

         if ( resultado < 60.00){
            System.out.println("Aluno Reprovado!");
         }

         else {
            System.out.println("Aluno Aprovado!");

         }

         sc.close();
    }
}
