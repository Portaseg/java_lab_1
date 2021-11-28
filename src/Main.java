public class Main {

    public static void main(String[] args) {
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji
        /* Przykłady wyświetlania tekstu w konsoli */
        System.out.println("Dzień dobry WSB!\n");
        System.out.printf("numer kierunkowy do Gdyni to %03d \n\n", 58);

//        zaokrąglanie liczby do drugiego miejsca po przecinku
        System.out.printf("%.2f \n\n", 89.109);
//        \b backspace
        System.out.print("Coś mi tu zjadło\b \n\n");

        System.out.print("Ala ");
        System.out.print("ma ");
        System.out.printf("%s.\n\n", "kota");

        int i = 50;

        System.out.printf("To jest jakiś zadeklarowany int \"%d\".", i);
    }
}
