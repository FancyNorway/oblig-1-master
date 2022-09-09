package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        throw new UnsupportedOperationException();
    }

    public static int ombyttinger(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        if (a.length == 0) {        // sjekker om tabell er tom
            return 0;
        }
        int tall = a[0];
        int antallUlike = 1;
        for(int i = 1; i < a.length; i++) {
            if (tall < a[i]) {
                tall = a[i];
                antallUlike++;
            }
            else if (tall > a[i]) {
                throw new IllegalStateException("Listen er ikke sortert stigende");
            }
        }
        return antallUlike;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if (a.length == 0) {        // sjekker om tabell er tom
            return 0;
        }

        int antallUlike = 1;
        boolean bruktFor;

        // Logikken blir at vi skal bare legge til tallet første gang det er i tabellen
        // Dvs har vi [1,2,1]; er det bare 1 på plass 0  vi legger til
        // Dette gjør vi ved å sjekke om tallet står til venste får seg seg i tabellen
        // Gjør det det oppdater vi ikke antallUlike og omvendt.

        for(int i = 1; i < a.length; i++) {
            bruktFor = false;
            for(int j = i-1; j >= 0; j--) {
                if (a[i] == a[j]) {
                    bruktFor = true;
                }
            }
            if (!bruktFor) {
                antallUlike++;
            }
        }
        return antallUlike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        // Sjekker hvis a er tom
        if (a.length == 0) {
            return;
        }

        // lager en metode som sorterer oddetall til venste og partall til høyere (partisjon)
        int i = 0;
        int j = a.length-1;


        while (i != j) {
            if (a[i] % 2 == 1 || a[i] % 2 == -1)  {               // Hvis odetall
                i++;
            }
            else if (a[i] % 2 == 0) {         //Hvis partall
                if (a[j] % 2 == 1 || a[j] % 2 == -1)  {
                    int temp = a[i]; a[i] = a[j]; a[j] = temp;      // Bytter plass på Elementene
                    i++;
                } else {
                    j--;
                }
            }
        }
        // Sjekker hvis det bare er oddetall i Arrayet og setter i++ slik at man kan sortere hele arrayet
        if (i == a.length-1) {
            i++;
        }

        // Sorterer oddetall
        for(int p = i-1; p > 0; p--) {
            int m = maks(a,0, p+1);
            int temp = a[p]; a[p] = a[m]; a[m] = temp;          // Bytter plass på Elementene
        }

        // Sorterer partall
        for(int o = a.length-1; o > i; o--) {
            int m = maks(a,i, o+1);
            int temp = a[o]; a[o] = a[m]; a[m] = temp;          // Bytter plass på Elementene
        }
    }
    // Metoden maks(int[] a, int fra, int til)   Programkode 1.2.1 b)
    public static int maks(int[] a, int fra, int til)
    {
        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }
        return m;  // posisjonen til største verdi i a[fra:til>
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        if(a.length >= 1){
            char temp = a[0];
            char temp2;
            for(int i = 0; i<a.length; i++){

                if(i == a.length-1){
                    a[0] = temp;
                }
                else{
                    temp2 = a[i+1];
                    a[i+1] = temp;
                    temp = temp2;
                }
            }
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {

        if(a.length >= 1 && k != 0){
            char temp = a[0];
            char temp2;
            if(k>0){
                for(int i = 0; i<a.length; i++){

                    if(i == a.length-k){
                        a[0] = temp;
                    }
                    else{
                        temp2 = a[i+k];
                        a[i+k] = temp;
                        temp = temp2;
                    }
                }
            }
            else{
                for (int i = a.length-1; i<=0; i--){
                    if(i == )
                }
            }

        }
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
