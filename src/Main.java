import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scan.nextInt();
        switch (a % a) {
            case 0:
                System.out.println("Parzysta");
                break;
            case 1:
                System.out.println("Nieparzysta");
                break;
            default:
                System.out.println("To nie jest liczba");
                break;
        }
        int b = scan.nextInt();
        switch (b % 7) {
            case 0:
                System.out.println("Podzielna przez 7");
                break;
            case 1:
                System.out.println("Nie jest podzielna przez 7");
                break;
            default:
                System.out.println("To nie jest liczba");
                break;
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */
        String wyraz = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int o = 0, p = 0, x = 0, z = 0, q = 0, xy = 0;
        for (int i = 0; i < wyraz.length(); i++) {

            switch (wyraz.charAt(i)) {
                case 'o':
                    o++;
                    break;
                case 'p':
                    p++;
                    break;
                case 'x':
                    x++;
                    break;
                case 'z':
                    z++;
                    break;
                case 'q':
                    q++;
                    break;
                default:
                    xy++;
                    break;
            }

        }
        System.out.println("W wyrazie ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo" +
                "jest: " + o + ", "+ p + ", "+ x + ", "+ z + ", "+ q + ", oraz: " + xy + " pozostałych.");


        /**/

    }
}

