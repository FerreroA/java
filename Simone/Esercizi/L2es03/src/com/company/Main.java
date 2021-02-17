package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Inserisci la base e l'altezza del rettangolo:");
        int base = keyboard.nextInt();
        int altezza = keyboard.nextInt();
        System.out.println("L'area del rettangolo è " + areaRettangolo(base, altezza));
    }

    public static int areaRettangolo(int base, int altezza) {
        int area = base * altezza;
        return area;
    }

    public static int areaQuadrato(int lato) {
        int area = lato * lato;
        return area;
    }

    public static int areaQuadrato(int lato) {
        int area = lato * lato;
        return area;
    }
}
