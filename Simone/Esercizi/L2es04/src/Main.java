import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Scrivi di quale figura vuoi calcolare l'area (triangolo[t], quadrato[q], reattangolo[r] o cerchio[c]):");
        String choice = keyboard.nextLine();




        double result = 0;

        switch (choice) {
            case "q":
                System.out.println("Inserisci il lato:");
                int side = keyboard.nextInt();
                result = calcSquare(side);
                break;
            case "r":
                System.out.println("Inserisci base e altezza:");
                double base = keyboard.nextInt();
                double height = keyboard.nextInt();
                result = calcRectangle(base, height);
                break;

            case "t":

                break;

            case "c":

                break;

            default:
                System.out.println("Non hai selezionato nessuna delle opzioni disponibili.");
                System.exit(0);
        }

        System.out.println("L'area del " + choice + " è: " + result);



    }
    public static double calcRectangle(double a, double b){
        double area = a * b;
        return area;
    }

    public static int calcSquare(int a){
        int area = a * a;
        return area;
    }

    public static double calcCircle(double a){
        double area = 3.14 * a * a;
        return area;
    }
}
