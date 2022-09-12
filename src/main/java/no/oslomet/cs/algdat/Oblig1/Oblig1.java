package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if(a.length != 0){
            int temp;
            for(int i = 0; i<a.length-1; i++){
                if(a[i] > a[i+1]){
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                }
            }

            return a[a.length-1];
        }
        else{
          throw new NoSuchElementException("Det er ingen maksverdi i tabellen, fordi tabellen ikke har noen verdier");
        }

    }

    public static int ombyttinger(int[] a) {
        if(a.length != 0){
            int antall = 0;
            int temp;
            for(int i = 0; i<a.length-1; i++){
                if(a[i] > a[i+1]){
                    antall++;
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                }
            }
            return antall;
        }
        else{
            throw new NoSuchElementException("Det er ingen maksverdi i tabellen, fordi tabellen ikke har noen verdier");
        }
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
                    break;
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
        quicksort(a, 0, i-1);

        // Sorterer partall
        quicksort(a, i, a.length-1);
    }
    // quicksort
    public static void quicksort(int[] a, int fra, int til)
    {
        if (fra > til) {
            return;
        }

        // partisjoner
        int six = partisjoner(a, fra, til);

        quicksort(a, fra, six-1);
        quicksort(a, six+1, til);
    }
    public static int partisjoner(int[] a, int fra, int til)
    {
        // Bruker siste element som pivot
        int pivot = a[til];
        int i = fra-1;

        //Fjerner partisjoner
        for (int l = fra; l < til;  l++) {
            if (a[l] <= pivot) {
                i++;
                int temp = a[i]; a[i] = a[l]; a[l] = temp;
            }
        }
        // Setter pivoten der den skal være i tabellen
        i++;
        int temp = a[i]; a[i] = pivot; a[til] = temp;
        return i;
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

        if(a.length > 1 && k != 0){
            char[] b = a.clone();

                if(k>0){
                    int index = 0;
                    for(int i = index; i<a.length; i++){

                        if(i+k >= a.length){
                            a[index] = b[i];
                            index++;
                        }
                        else{
                            a[i+k] = b[i];
                        }
                    }
                }

                else{
                    int index = a.length-1;
                    for (int i = index; i>=0; i--){
                        if(i+k < 0){
                            a[index] = b[i];
                            index--;
                        }
                        else{
                            a[i+k] = b[i];

                        }
                    }
                }
        }
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        StringBuilder nyString = new StringBuilder();
        if(s.length() > 0 && t.length() > 0){
            if(s.length() > t.length()){
                for(int i = 0; i< s.length(); i++){
                    nyString.append(getCharFromString(s, i));

                    if(t.length() > i){
                        nyString.append(getCharFromString(t, i));
                    }

                }
            }
            else{
                for(int i = 0; i<t.length(); i++){
                    if(s.length() > i){
                        nyString.append(getCharFromString(s, i));
                    }
                    nyString.append(getCharFromString(t, i));
                }
            }

            return nyString.toString();
        }
        nyString.append(s);
        nyString.append(t);
        return nyString.toString();
        }
    public static char getCharFromString(String s, int i){
        return s.charAt(i);
    }

    /// 7b)
    public static String flett(String... s) {
        StringBuilder nyString = new StringBuilder();

        if(s.length > 0){
            int length = findLengthOfLongestString(s);
            for(int i = 0; i<length+1; i++){
                for(int j = 0; j<s.length; j++){
                    if(s[j].length() > i){
                        nyString.append(getCharFromStringArray(j, i, s));

                    }
                }

            }

            return nyString.toString();
        }

        return nyString.toString();
    }

    public static char getCharFromStringArray(int j, int i, String... s){
        return s[j].charAt(i);
    }

    public static int findLengthOfLongestString(String... s){
        String temp;
        String[] b = s.clone();
        for(int i = 0; i<b.length-1; i++){
            if(b[i].length() > b[i+1].length()){
                temp = b[i+1];
                b[i+1] = b[i];
                b[i] = temp;
            }
        }

        return b[b.length-1].length();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {

        int[] b = a.clone();
        int[] index = new int[a.length];
        quicksort(b, 0, b.length-1);
        if(a.length>0){
            for(int i = 0; i< a.length; i++){

                for(int j = 0; j< a.length; j++){
                    if(b[i] == a[j]){
                        index[i] = j;
                    }
                }

            }
            return index;
        }
        return index;
    }

}  // Oblig1
