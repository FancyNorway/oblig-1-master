# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Karl Anders Eide Haugholt, s362061, s362061@oslomet.no
* Magnus Reinholdt Belsvik, s362088, s362088@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Anders har hatt hovedansvar for oppgave 2,3,4.
* Magnus har hatt hovedansvar for oppgave 1, 5, 6, 7, 8.

# Oppgavebeskrivelse

I oppgave 1 så gikk vi frem ved å først skrive en enkel sjekk for om lengden
er 0 da sendder vi en NoSuchElementException. På maks bruker vi bobling og
utfører en iterasjon og retunerer verdien helt til venstre (a.length-1).
På ombyttinger metoden gjør vi akkurat det samme bare at vi har lagt til en variabel
antall som teller antall ombyttingen som utføres i for loopen/boblings iterasjonen.

• Når blir det flest ombyttinger?
    Det blir flest ombyttinger når arrayet har det støreste tallet 
    til venstre. Eks. [5,4,3,2,1], [10,7,1,2,6,-1,2] - da må det byttes
    Da må vi bytte for hver sammenligning altså n-1 ganger. (n er arr.length)

• Når blir det færrest?
    Det blir flest ombyttinger når arrayet allerede er sortert i  stigende
    rekkefølge Eks. [1,2,3,4], [-1,8,16,32] - da blir det ingen ombyttinger

• Hvor mange blir det i gjennomsnitt?
    I gjennomsnitt blir det ca. n-(ln(n)+0.577). Dette kommer vi frem til ved 
    tenke at det blir n ombyttinger minus alle gangene i snitt alle tallene er større
    enn alle tallene forran seg selv. Fordi da kan vi altså trekke fra denne
    ombyttingen. Dette skjer altså 1 gang på det første tallet. En 1/2 gang for det 
    andre tallet. 1/3 for det tredje, 1/4 for det fjerde osv. 
    Dette danner den harmoniske serien H_n. 
    Vi vet at Summen av dden harmoniske serien er ca lik ln(n)+0.577.
    Altså får vi n-(ln(n)+0.577)


I oppgave 2 så brukte vi først en enkel if til å sjekke om listen var tom.
Så hadde vi to variabler for å holde på antall ulike og tallet vi var på.
Så loopet vi gjennom arrayet og siden vi vet at vi i utgangspunktet skal
få et sortert array vet vi at det er bare når neste verdi er større en
den forrige at vi har en ny verdi. I tillegg la vi in en if på om den var
mindre og da vet vi at listen ikke er sortert og sender en IllegalStateException.


I oppgave 3 så brukte vi først en enkel if til å sjekke om listen var tom.
Logikken blir at vi skal bare legge til tallet første gang det er i tabellen
Dvs har vi [1,2,1]; er det bare 1 på plass 0  vi legger til på antallUlike
Dette gjør vi ved å sjekke om tallet står til venste får seg seg i tabellen
Gjør det ikke det oppdater vi antallUlike ved å legge til en (antallUlike++),
men gjør det det som i eksempelet over altså 1 på plass 2 har et 1 tall til venste
skjer det ingen ting.

I oppgave 4 så brukte vi først en enkel if til å sjekke om listen var tom.
Deretter hadde vi en partisjon metode som sorterer oddetall til venste 
og partall til høyere. Fordi verdiene i og j kommer i utgangspunktet 
der det første partallet skal være (i index) må vi sjekke om det bare
er oddetall i arrayet. Siden den største veriden av i = a.length og
når vi sender  den inn i sorteringsalgoritmen tar vi i-1  så  vi plusse 
på en får å få sortert alle verdiene. Etter dette sorterer vi oddetallene 
og partallene hver for seg med en quicksort algoritme. Denne quicksorten er
simpel og beyntter seg av å bruke verdien legst til høyere som pivot.

I oppgave 5 så brukte vi en enkel if-statement til å sjekke om listen var tom eller 
hadde elementer i seg. Vi brukte to temp variabler. Den første tempen startet med verdien til
a[0] og den andre ble bare initiert før for løkken. I For løkken sjekker vi først om man er ved 
siste plass i tabellen, i såfall setter man a[0] lik temp verdien. Ellers lagrer man verdien til
a[i+1] før man setter a[i+1] lik temp-verdien. Deretter blir temp verdien satt = temp2 verdien
som var den gamle a[i+1] verdien. Deretter blir loopen kjørt på nytt.

I oppgave 6 sjekket vi først om lengden til a var over 1 og at k!=0, hvis dette er
tilfellet vil ikke rotasjonen ha noe effekt. Deretter lagde vi array b ved å klone 
a. Så sjekker vi om k er positiv eller negativ. Hvis k er positiv har vi en
index int = 0, og hvis k er negativ setter vi index = a.length-1. Fortegnet til k
bestemmer om vi roterer mot høyre eller til venstre. og bestemmer derfor om vi 
starter for-løkken fra 0 eller fra a.length-1. Inne i for-løkken sjekker vi først om
i+k blir index-out-of-bounds. Hvis dette er tilfellet så betyr det at de neste 
verdiene vil ende opp på andre siden av arrayet. For å holde styr på posisjonen til 
disse verdiene bruker vi index-variablen. Vi henter også de verdiene fra det klonede 
arrayet slik at man slipper k-antall temp-variabler.

I oppgave 7a lager vi først en nyString, der resultate av flettingen skal settes inn.
Deretter har vi en if statement som sjekker om et av stringene har lengde null.
Hvis dette er tilfellet vil det ikke være nødvendig med fletting og det er bare
å legge til stringene akkurat som de er i det nye stringet. Inne i if-statementet
er det enda en if-statement som sjekker hvilken string som er lengst. Dette blir brukt
inne i for-løkken for å sørge for at man får med alle bokstavene i stringene. Inne i 
for-løkken er det enda en if-statement som sørger for at man ikke prøver å hente 
noe som er "out of bounds" fra stringen som er kortest. For å hente en ny bokstav
fra stringen, bruker vi en metode som henter ut bokstaven, som ligger i den posisjonen
i er fra stringen.



I oppgave 8 så klonet vi først arrayet a, og lagde deretter et array index med samme 
lengde som a. Deretter brukte vi en quicksort metode for å sortere tabellen b i 
stigende rekkefølge. Deretter brukte vi en if statement for å se at a hadde en
lengde lenger enn 0. Etter dette brukte vi to for-løkker som gikk gjennom det sorterte
arrayet b og sjekket hvor i a de hadde samme tall. deretter satte vi inn index-en til
der tallene matchet hverandre inn i index-tabellen. Etter dette ble
index-tabellen returnert