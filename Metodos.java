import java.util.Scanner;

public class Metodos {

    public static void Search(ObjProducto[][] Products, Scanner sc) {
        String search;
        int selection;
        int rows = Products.length;
        int columns = Products[0].length;
        boolean found = false;
        boolean continuewhile = true;

        while (continuewhile) {

            System.out.println("Insert the name of the product you want to search: ");
            search = sc.nextLine();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (search.equals(Products[i][j].getName())) {
                        System.out.println("Product was found in row " + i + " and column " + j);
                        found = true;
                        break;
                    }
                }
                if (found = true) {
                    break;
                }
            }

            if (found = false) {
                System.out.println("Product " + search + " was not found, do you want to retry?");
                System.out.println("1. Retry");
                System.out.println("0. Exit");

                selection = sc.nextInt();


                switch(selection) {
                case 0:
                    System.out.println("Exiting Search");
                    return;
                
                case 1:
                    System.out.println("Starting Search Functionality...");
                    Metodos.Search(Products, sc);
                    break;

                default:
                    System.out.println("Invalid Trying Again...");
                    break;
                
                }

            }
        }
    }
}