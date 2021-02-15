import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci l'anno:");
        int n = keyboard.nextInt();
        boolean request = false;

        //L'adozione del calendario gregoriano parte dal 1582

        if (n < 1582) {
            System.out.println("Nel " + n + " la definizione di anno bisestile non era ancora stata adottata.");

        } else {
            request = calcLeapYear(n);

            if (request == true) {
                System.out.println("Il " + n + " è un anno bisestile.");
            } else {
                System.out.println("Il " + n + " non è un anno bisestile.");
            }
        }
    }

    /*Nel calendario gregoriano è bisestile un anno ogni quattro;
    si è inoltre stabilito di non rendere bisestili gli anni secolari, eccetto quelli divisibili per 400*/

    public static boolean calcLeapYear(int year) {
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
