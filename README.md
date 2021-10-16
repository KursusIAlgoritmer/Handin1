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
I input 1, indlæses N, der angiver antallet af byer. Herefter oprettes en liste "byer", med plads til N by-objekter.</br>

I input 2, For hver indlæsning oprettes et by-objekt i by-listen, der indholder byens navn, antal kunder og den akkumulerede længde til kunder i andre byer. Den akkumulerede længde er på dette tidspunkt nul.</br>

I input 3, Afstande målt fra en by til sig selv er nul og kan ignoreres. Afstande fra en by, kaldet A, til en anden by, kaldet B, er den samme som fra B til A, derfor kan den ene af disse to afstande også ignoreres. Resultatet er at første linje ignoreres, på den næste linje indlæses 1 tal, herefter 2 tal, herefter 3 tal,  osv. på den sidste linje indlæses N-1 tal. Ialt indlæses kun (n^2-n)/2 afstande.</br>
For hver afstands-indlæsning imellem "by1" og "by2" beregnes et tillæg til den samlede akkumulerede afstand, for hver af de to byer. 


Pseudokode for sortering:

