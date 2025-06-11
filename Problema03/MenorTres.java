import java.util.Scanner;

public class MenorTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int v[] = new int[3];
        
        

        for ( int i = 0; i < 3; i++){
        System.out.println("Digite o numero que deseja comparar");
            v[i] = sc.nextInt();
        }

        int menor = v[0];
        
         for ( int i = 0; i < 3; i++){
            if (v[i] < menor){
            menor = v[i];
         }

          

    }
    System.out.println("O menor numero e: " + menor);

        sc.close();
}
}
