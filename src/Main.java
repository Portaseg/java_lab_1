import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        byte zmiennabyte = 127;
        short zmiennashort = 32767;
        int zmiennaint = 110122;
        long zmiennalong = 111000111000L;
        float zmiennafloat = 20.12f;
        double zmiennadouble = 123456.1234;
        boolean zmiennaboolean = true;
        char zmiennachar = 'a';

        int zmienna1=128;
        int a, b=4, c=2;
        int wynik = b/c;
        System.out.println("wynik = " + wynik);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int liczbaA = 4;
        int liczbaB = 2;
        double liczbaX = 2.1;
        double liczbaY = 1.2;

        int dodawanie = liczbaA + liczbaB;
        System.out.println("dodawanie = " + dodawanie);

        int odejmowanie = liczbaA - liczbaB;
        System.out.println("odejmowanie = " + odejmowanie);

        int mnozenie = liczbaA * liczbaB;
        System.out.println("mnożenie = " + mnozenie);

        int dzielenie = liczbaA / liczbaB;
        System.out.println("dzielenie = " + dzielenie);

        int modulo = liczbaA % liczbaB;
        System.out.println("modulo = " + modulo);


        double Add = liczbaY + liczbaX;
        System.out.println("Add = " + Add);

        double Sub = liczbaX - liczbaY;
        System.out.println("Sub = " + Sub);

        double multiply = liczbaY * liczbaX;
        System.out.println("multiply = " + multiply);

        double divide = liczbaX / liczbaY;
        System.out.println("divide = " + divide);

        double modulox = liczbaX % liczbaY;
        System.out.println("modulox = " + modulox);
    }
}
