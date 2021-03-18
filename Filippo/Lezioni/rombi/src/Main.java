import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        // Base del rombo
        int base = scanner.nextInt();

        System.out.print("Height: ");
        // Altezza del rombo
        int height = scanner.nextInt();

        System.out.print("Columns: ");
        // Numero di colonne di rombi
        int cols = scanner.nextInt();

        System.out.print("Rows: ");
        // Numero di righe di rombi
        int rows = scanner.nextInt();

        System.out.print("Expansion: ");
        // Valore di espansione (o contrazione se negativo) della forma del rombo
        int expansion = scanner.nextInt();

        // Numero totale di caratteri necessari orizzontalmente
        int totC = base * cols;
        // Numero totale di caratteri necessari verticalmente
        int totR = height * rows;

        // Metà della base
        int midB = base / 2;
        // Metà dell'altezza
        int midH = height / 2;

        for (int row = 0; row < totR; row++) {

            int r = row % height;
            int h = r < midH ? r : height - (r + 1);

            for (int col = 0; col < totC; col++) {

                int c = col % base;
                int b = c < midB ? c : base - (c + 1);


                if (Math.floor(midB - b - ((float) h * midB / midH)) <= expansion)
                    System.out.print("█");
                else
                    System.out.print("-");


                if (col == totC - 1)
                    System.out.println();
            }

        }
    }
}