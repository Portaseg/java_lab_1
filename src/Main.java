import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean a = true;
        boolean b = false;

        System.out.println("(a||b): " + (a||b));
        System.out.println("(a&&b): " + (a&&b));
        System.out.println("(a!=b): " + (a!=b));

        int c=2;
        int d=4;
        int e=10;

        // rzutowanie zmiennej calkowitej na rzeczywista
        System.out.println("wynik: " + e / (double)d);

        System.out.println("(c<d): " + (c<d));
        System.out.println("((e&&e)||(e>e)): " + ((a&&b)||(e>e)));
    }
}
