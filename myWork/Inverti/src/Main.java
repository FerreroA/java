import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci la lunghezza dell'array:");
        int n = keyboard.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° numero:");
            int place = keyboard.nextInt();
            array[i] = place;
        }

        int[] oppositeArray = new int[n];
        int index = 0;
        for (int i = array.length-1; i == 0; i--) {
            oppositeArray[index] = array[i];
            index++;
        }

        System.out.print("L'array al contrario è: [ ");
        for (int i = 0; i < n; i++)
            System.out.print(oppositeArray[i] + " ");
        System.out.print("]");

    }
}
