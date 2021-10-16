# Handin1

## Opgave

Et antal byer ønskes sorteret efter den samlede afstand til alle kunder i de andre byer.
Programmet, der løser problemet er skrevet i Java og tager følgende input (fra opgavetekst):</br>

Input 1: Første linje af input er et heltal, n, som angiver antallet af byer med kunder.</br>
Input 2: De næste n linjer indeholder et bynavn efterfulgt af et heltal; antallet af kunder i den givne. Bynavne indeholder ikke mellemrum. </br>
Input 3: Sidst er der n linjer, med n heltal hver, der angiver den parvise afstand mellem byerne, i samme rækkefølge som de er nævnt ovenfor. </br>

## Beskrivelse af løsning

Programmet betår overordnet af to dele: (1) Indlæsning og beregning akkumuleret afstand og (2) Sortering af byer</br>


#### Program del 1: Indlæsning af input og beregning akkumuleret afstand til kunder
Nedenfor ses pseudokoden, der beskriver en løsning til del 1:
<pre>
##input 1
1: læs og opret heltal "N"
2: opret liste "byer", med N-pladser      

##input 2
3: for( i=0 til N){                       
4:      læs "navn" og "kunder" for en by
5:      opret "By" med "navn", "kunder" og "akkumuleret afstand"
6:      indsæt "By" i "byer"
7: }

##input 3
8: gå til næste linje i input
9: for( r = 1 til N ){                
10:      for( c = 0 til r){         
11:          by1       = hent plads r i byer
12:          by2       = hent plads c i byer
13:          afstand   = læs afstand fra by1 til by2
14:          "by1 akkumuleret afstand"  forsøges med  "antal kunder i b2"  mulipliceret med "afstand"
15:          "by2 akkumuleret afstand"  forsøges med  "antal kunder i b1"  mulipliceret med "afstand"
15:     }
16:     gå til næste linje i inputet
17:}
</pre>
Ovenfor betyder: "læs" indlæsning af input, "opret" oprettelse af en variabel, "indsæt" indsæt i et array og "hent" hent fra et array.</br>
I input 1, N, der angiver antallet af byer, indlæses. Herefter oprettes en liste "byer", med plads til N by-objekter.</br>
I input 2, indlæses N linjer, der hvert indeholder et bynavn og antallet af kunder i den givne by. For hver indlæst linje oprettes et by-objekt, der indholder byens navn, antal kunder og den akkumulerede længde til kunder i andre byer. Den akkumulerede længde er på dette tidspunkt nul.</br>
I input 3, indlæses afstande imellem de N byer. Inputtet består af N linjer, med N tal i hver linje, der hver angiver afstanden imellem to byer i samme rækkefølge som i input 2.
Da afstanden fra by A til by B og afstanden fra B til A er den samme og afstanden fra A til A behøver vi ikke at indlæse alt data.
Hvis vi sorterer denne data fra behøver vi kun indlæse 1 tal fra 2 linje i input 3, 2 tal fra linje 3, 3 tal fra linje 4 og N-1 tal fra linje N.



Pseudokode for sortering:



Kompilering:
javac InputOutput.java

Eksekver:
java InputOutput < input.in
