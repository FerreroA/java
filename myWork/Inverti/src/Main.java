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



        System.out.print("L'array al contrario è: [ ");
        int[] invertedArray = oppositeArray(array, n);
        for (int i = 0; i < n; i++)
            System.out.print(invertedArray[i] + " ");
        System.out.print("]");

    }

    public static int[] oppositeArray(int[] a, int n){
        int[] newArr = new int[n];
        int index = 0;
        for (int i = a.length-1; i >= 0; i--) {
            newArr[index] = a[i];
            index++;
        }
        return newArr;
    }
}
