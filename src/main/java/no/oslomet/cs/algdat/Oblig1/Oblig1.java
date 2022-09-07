package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

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

        // Logikken blir at vi skal bare legge til tallet første gang det er i tabellen
        // Dvs har vi [1,2,1]; er det bare 1 på plass 0  vi legger til
        // Dette gjør vi ved å sjekke om tallet står til venste får seg seg i tabellen
        // Gjør det det oppdater vi ikke antallUlike og omvendt.

        for(int i = 1; i < a.length; i++) {
            for(int j = 1; j < a.length; j++) {
                return 1;
            }
        }

        return antallUlike;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        if(a.length > 1){
            char temp;
            for(int i = 0; i<a.length; i++){
                temp = a[i];
                if(i == a.length-1){
                    a[0] = temp;
                }
                else{
                    a[i+1] = temp;
                }
            }
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
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
