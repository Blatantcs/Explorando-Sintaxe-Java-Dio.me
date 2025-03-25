import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        double saldoInicial = scanner.nextDouble();

    
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double t3 = scanner.nextDouble();

  
        double saldoFinal = saldoInicial + t1 + t2 + t3;

      
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}

