public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int licznik = 1000;

        while (licznik >= 0) {
            licznik--;
            if (licznik % 15 == 0)
                System.out.println("Liczba " + licznik + " jest podzielna przez 15");
        }
        System.out.println("Koniec pętli");

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        //a
        System.out.println("Tab int");
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;
        {int i = tab.length-1;
            int j = 0;
        while( i >= 0 ) {

            System.out.println(tab[j]);
            i--;
            j++;

        }}
        //b
        double[] tab2 = new double[5];
        tab2[0] = 1;
        tab2[1] = 2;
        tab2[2] = 3;
        tab2[3] = 4;
        tab2[4] = 5;
        System.out.println("Tab double");
        {int i = tab.length-1;
            int j = 0;
        while( i >= 0 ) {

            System.out.println(tab2[j]);
            i--;
            j++;

        }}
        //c
        String[] tab3 = new String[5];
        tab3[0] = "jeden";
        tab3[1] = "dwa";
        tab3[2] = "trzy";
        tab3[3] = "cztery";
        tab3[4] = "pięć";
        System.out.println("Tab string");
        {int i = tab.length-1;
            while( i >= 0 ) {

                System.out.println(tab3[i]);
                i--;

            }}


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

    }
}
