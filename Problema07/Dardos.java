import java.util.Scanner;

public class Dardos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double  v[] = new double[3];
        
        

        for ( int i = 0; i < 3; i++){
        System.out.println("Digite o numero que deseja comparar");
            v[i] = sc.nextInt();
            
        }

        double maior = v[0];
        
         for ( int i = 0; i < 3; i++){
            if (v[i] > maior){
            maior = v[i];
         }

          

    }
    System.out.println("O menor numero e: " + maior);

        sc.close();
}
}

