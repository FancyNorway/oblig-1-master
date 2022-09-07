# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Karl Anders Eide Haugholt, s362061, s362061@oslomet.no
* Magnus Reinholdt Belsvik, s362088, s362088@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Anders har hatt hovedansvar for oppgave 2.
* Magnus har hatt hovedansvar for oppgave ...


# Oppgavebeskrivelse

I oppgave 1 så gikk vi frem ved å ...


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

I oppgave 5 så brukte vi en een enkel if-statement til å sjekke om listen var tom eller 
hadde elementer i seg. Vi brukte to temp variabler. Den første tempen startet med verdien til
a[0] og den andre ble bare initiert før for løkken. I For løkken sjekker vi først om man er ved 
siste plass i tabellen, i såfall setter man a[0] lik temp verdien. Ellers lagrer man verdien til
a[i+1] før man setter a[i+1] lik temp-verdien. Deretter blir temp verdien satt = temp2 verdien
som var den gamle a[i+1] verdien. Deretter blir loopen kjørt på nytt.