import java.util.Scanner;

public class MedidorGlicose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a media da glicose: ");
        double media = sc.nextInt();

        if ( media <= 100){
            System.out.println("Classificação: Normal ");
            
        }

        else if ( media > 100 && media <= 140){
            System.out.println("Classificação: Elevado ");
        }
        else{
            System.out.println("Classificação: Diabetes ");
        }

    }
}
