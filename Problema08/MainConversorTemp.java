import java.util.Scanner;

public class MainConversorTemp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ConversorTemp converte = new ConversorTemp();

        System.out.print("Digite a temperatura a ser convertida: ");
        double n = sc.nextDouble();

        System.out.println("Opções: ");
        System.out.println("1 - Converter Celsius para Fahrenheit");
        System.out.println("2 - Converter Fahrenheit para Celsius");

        int opcao = sc.nextInt();

        double resultado;

        switch (opcao){
        case 1:
        resultado = converte.celsius_fahrenheitNão;
        System.out.println(+n+"ºC em Fahrenheit é: "+resultado+"ºF");
        break;
        case 2:
        resultado = converte.fahrenheit_celsiusNão;
        System.out.println(+n+"ºF em Celsius é: "+resultado+"ºC");
        break;
        }

        sc.close();
}
}

