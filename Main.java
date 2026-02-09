import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vamos a sumar dos numeros");
        int n1 = 1, n2 = 0, suma = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        n1 = scan.nextInt();
        System.out.print("Ingrese el numero 2: ");
        n2 = scan.nextInt();

        suma = n1 + n2;
        System.out.println("Suma: " + (n1 + n2));

        scan.close();


}


}