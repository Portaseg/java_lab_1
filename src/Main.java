import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */

        Scanner scan = new Scanner(System.in);


        System.out.println("Podaj imię: ");
        String imie = scan.next();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = scan.next();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int wiek = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj numer indeksu: ");
        int index = scan.nextInt();


        System.out.println("Twoje imię i nazwisko to " + imie  + " " + nazwisko);
        System.out.println("Twój indeks to " + index);
        System.out.println("Twój wiek to " + wiek);

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        System.out.print("Pierwsza liczba: ");
        int a = scan.nextInt();

        System.out.print("Druga liczba: ");
        int b = scan.nextInt();

        double dodawanie = a+b;
        System.out.println("Suma: " + dodawanie);
        double odejmnowanie = a-b;
        System.out.println("Różnica: " + odejmnowanie);
        double mnozenie = a*b;
        System.out.println("Iloczyn: " + mnozenie);
        double dzielenie = a/b;
        System.out.println("Iloraz: " + dzielenie);
        double reszta = a%b;
        System.out.println("Reszta: " + reszta);
    }
}
