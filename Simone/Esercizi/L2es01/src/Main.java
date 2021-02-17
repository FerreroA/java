import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci il limite inferiore:");
        int min = keyboard.nextInt();
        System.out.println("Inserisci il limite superiore:");
        int max = keyboard.nextInt();
        System.out.println("Inserisci il valore da testare:");
        int valore = keyboard.nextInt();
        boolean result = checkInterval(min, max, valore);
        System.out.println("Il valore è all'interno dell'intervallo? " + result + "!");
    }

    public static boolean checkInterval(int min, int max, int valore) {
        if (valore >= min && valore <= max)
            return true;
        return false;
    }
}
