# Handin1

## Opgave

Nogle byer skal sorteres efter den samlede afstand til alle kunder i de andre byer.
Programmet, der løser problemet er skrevet i Java og tager følgende input (fra opgavetekst):</br>

Input 1: Første linje af input er et heltal, n, som angiver antallet af byer med kunder.</br>
Input 2: De næste n linjer indeholder et bynavn efterfulgt af et heltal; antallet af kunder i den givne. Bynavne indeholder ikke mellemrum. </br>
Input 3: Sidst er der n linjer, med n heltal hver, der angiver den parvise afstand mellem byerne, i samme rækkefølge som de er nævnt ovenfor. </br>

## Beskrivelse af løsning

Programmet betår overordnet af to dele; </br>
* Indlæsning af input og beregning akkumuleret afstand til kunder</br>
* Sortering af by baseret på akkumuleret afstand til kunder</br>


#### Program del 1: Indlæsning af input og beregning akkumuleret afstand til kunder

Nedenfor ses pseudokoden, der beskriver en løsning til del 1:
<pre>
1: indlæses heltal "N"           

2: opret liste af byer, her kaldet "byer", med N-pladser      

3: for( i=0 til N){                       
5:  opret "by objekt", initaliser med indlæsning "bynavn" og indlæsning "kunde antal"
    indsæt byobjekt i "byer"
6: }

7: for( r = 1 til N ){                
8:   for( c = 0 til r){         
9:       (akkumuleret afstand for by[r]) forøges med (kunder by[c]) * (afstand fra by r til c)  
10:      (akkumuleret afstand for by[c]) forøges med (kunder by[r]) * (afstand fra by r til c) 
11:}}
</pre>

I linje 



Pseudokode for sortering:



Kompilering:
javac InputOutput.java

Eksekver:
java InputOutput < input.in
