import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        int[] tablica = new int[5];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 10;
            tablica[2] = 51;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Element " + i + ", " + "wartosc: " + tablica[i]);
        }
    }
}
