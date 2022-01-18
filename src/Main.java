import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int wiek = 26;
        if (wiek % 3 == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int indeks = 57863;
        String wynik = (indeks % 2 == 0) ? "parzysty" : "nieparzysty";
        System.out.println(wynik);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("Wpisz liczbe: ");
        Scanner scan = new Scanner(System.in);
        float liczba = scan.nextFloat();
        if (liczba == 0) {
            System.out.println("liczba zero");
        } else if (liczba < 0) {
            System.out.println("liczba ujemna");
        } else if (liczba % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else if (liczba % 2 == 1) {
            System.out.println("Liczba nieparzysta");
        }
            if (liczba == Math.floor(liczba)) {
            System.out.println("Liczba po przecinku");
        }
            else {
            System.out.println("Liczba całkowita");
        }
    }
}
