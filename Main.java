import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selection;

        System.out.println("What size do you want the matrix to be: ");
        selection = sc.nextInt();

        System.out.println("------------------------------------------------------ \n");
        System.out.println("Creating Matrix...\n");
        System.out.println("------------------------------------------------------ \n");
        ObjProducto[][] Products = new ObjProducto[selection][selection];

        for (int i = 0; i < selection; i++) {
            for (int j = 0; j < selection; j++) {
                
                System.out.println("Give product #" + i + " " + j + " a name: ");
                Products[i][j].setName(sc.nextLine());

                System.out.println("Give product #" + i + " " + j + " a price: ");
                Products[i][j].setPrice(sc.nextFloat());

                System.out.println("Give product #" + i + " " + j + " a inventory quantity: ");
                Products[i][j].setPrice(sc.nextInt());

            }
        }

        System.out.println("Which function of the program do you want to use now: \nSelect one of the following numbers");
        System.out.println("1. Search");
        System.out.println("0. Exit");

        selection = sc.nextInt();

        System.out.println("------------------------------------------------------ \n");

        switch(selection) {
            case 0:
                System.out.println("Deleting Matrix, Goodbye");
                break;


            case 1:
                System.out.println("Starting Search Functionality...");
                Metodos.Search(Products, sc);
                break;


            default:
                System.out.println("Invalid Trying Again...");
                break;
            
        }






        sc.close();
    }
}