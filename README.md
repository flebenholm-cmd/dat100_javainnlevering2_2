# DAT100 - Obligatoriske Innlevering: Java Programmeringsoppgave 2

Denne oppbevaringsplasssen inneholder startkode og enhetstester for Java Programmeringsoppgave 2 som er en obligatorisk innlevering. 

Den obligatoriske innleveringen kan gjøres i **grupper** med opptil **3 personer**. Tanken er at det er de *samme gruppene* som dere skal bruke i programmeringsprosjektet i uke 41/42.

Oppgaven omhandler metoder for en- og to-dimensjonale tabeller. 

Koden skal leveres via GitHub som beskrevet nedenfor og prosjektet er satt opp slik at koden dere leverer inn testes automatisk ved å bruke *Actions* i GitHub sky-tjenesten. På den måden blir innleveringen enklere å rette. Dette er samme fremgånsmåte som vi gikk igjennom på forelesning og IntelliJ og softwareutvikling.

Metodene i oppgavene nedenfor skal implementeres "fra bunden"  - og det er derfor **ikke lov** å bruke metoder som finnes i `Arrays`-klassen i Java.

### Oppgave 1: Clone start-kode

Begynn med å opprette en kopi av denne oppbevaringsplassen ved å bruke *Use this template* (se øverste høyre hjørne på github-websiden). Du vil da få en kopi av oppbevaringsplassen med startkoden på din egen github konto. Du kan nå clone denne kopien ned på egen PC (bruk eks. GitHub desktop). 

Det er kun *en person* i gruppen som skal utføre *Use as template* på startkoden. Den som har utført *Use as template* kan etterfølgende gi tilgang til sin lokale kopi av oppbevaringsplassen til de andre gruppe-medlemmer ved å bruke *Settings* og *Manage Access* på GitHub. De andre gruppemedlemmer kan etterfølgende klone oppbevaringsplassen ved å bruke Github Desktop. På denne måten vil alle gruppe-medlemmer jobbe på samme oppbevaringsplass på Github og dele koden som implementeres.

### Oppgave 2: Importere start-kode og enhetstester inn i IntelliJ

Start-koden ligger i prosjekt og er organisert slik bygge-systemet Maven automatisk kan brukes til å kompilere koden og kjøre test i GitHub-skyen. 

Dere skal derfor bruke *File -> Open* i IntelliJ og navigere ned i mappen der dere klonet ned startkoden i Steg 1.

Klassene `Tabeller.java` og `Matriser.java` inneholder starten på metodene dere skal implementere i oppgavene. Disse finnes under `src/main/java` i prosjektet.

Klassene `TabellerEnhetsTests.java` og `MatriserEnhetsTests.java` inneholder JUnit-enhettester som kan brukes til å teste implementasjon av metodene etterhvert som de implementeres. Disse finner du under `src/test/java` i prosjektet.

Testene kan kjøres ved å dobbel-klikke play-ikonene som finnes ved siden av linjenumrene.

### Oppgave 3: Pushe code til Github 

Etterhvert som metodene i oppgavene implementeres kan koden legges opp på GitHub ved å bruke *Commit* etterfulgt av *Push to origin* i GitHub Desktop. Om andre gruppemedlemmer skal ha tilgang til endringer som du har lagt opp, da må de utføre *Fetch origin* fra deres GitHub Desktop for å oppdatere deres lokale kopi av oppbevaringsplassen. 

Om gruppemedlemmer har gjort samtidige endringer på filer og disse endringer er i konflikt med hverandre da må dere gjøre en *merge*.

Når koden legges opp på GitHub ved å utføre en *push* vil GitHub sky-tjenesten automatisk kjøre testene og resultatet kan sees ved å gå inn under *Actions* på web-siden for oppbevaringsplassen på GitHub og velge seneste *workflow*.

### Oppgave 4: Tabeller 

Implementer metoderne i klassen `Tabeller.java`. 

Husk å kjøre enhetstestene etterhvert som du implementerer metodene for å sjekke at de fungerer. 

Når du implementerer en metode skal du fjerne linjen:

```java
throw new UnsupportedOperationException("Metoden ... ikke implementert");
```

#### a) Implementer en metode

```java
public static void skrivUt (int[] tabell)
```

som kan skrive ut en tabell med heltall. Du kan selv bestemme formatet.

#### b) Implementer en metode

```java
public static String tilStreng (int[] tabell)
```

som kan returnere en tekststreng (String) med innholdet av en tabell. For en tabell med elementene 42,67,89 skal følgende streng returneres:

```java
"[42,67,89]"
```

#### c) Implementer en metode

```java
public static int summer (int[] tabell)
```

som gitt en `tabell` av heltall som parameter beregner summen av tallene som er lagret i tabellen.

#### d) Implementer en metode

```java
public static boolean finnesTall (int[] tabell, int tall)
```

som gitt en `tabell` og et tall returnerer `true` om tabellen `tabell` innholder tallet `tall` og `false` ellers.

#### e) Implementer en metode

```java
public static int posisjonTall (int[] tabell, int tall)
```

som returnerer det første index (posisjon) i `tabell` som inneholder tallet `tall` og `-1` ellers.

#### f) Implementer en metode

```java
public static int[] reverser(int[] tabell)
```

som gitt en `tabell` av heltall returnerer en *ny tabell* som har de samme elementene som `tabell` men i modsatt rekkefølge.

#### g) Implementer en metode

```java
public static boolean erSortert (int[] tabell)
```

som kan avgjøre om en tabell av heiltal er sortert stigande (dvs. at alle tal skal vere større enn det forrige)

#### h) Implementer en metode

```java
public static int[] settSammen(int[] tabell1, int[] tabell2)
```

som gitt to tabeller `tabell1` og `tabell2` som parametre, returnerer en ny tabell som er sammensetning av de to tabellene gitt med som parameter.

### Oppgave 5: Matriser

Implementer metoderne i klassen `Matriser.java`. Husk å kjøre enhetstestene etterhvert som du implementerer metodene for å sjekke at de fungerer. 

Om du er usikker på hva matriser er for noe kan du *start* med å lese beskrivelsen av matriser i oppgave 5.17 i Java boken.

#### a) Implementer en metode

```java
public static void skrivUtv1(int[][] matrise)
```

som kan skrive ut en matrise. Prøv å bruke to (nøstede) utvidede for-løkker (se avsnitt 5.6 i boken for beskrivelse av utvidet for-løkke).

#### b) Implementer en metode

```java
public static String tilStreng(int[][] matrise)
```

som returnerer en streng-representation av en matrise. Om matrisen er følgende:

```
{ {1,2,3}, {4,5,6}, {7,8,9} }
```

da skal strengen som returneres ha følgende innhold:

```
1 2 3 \n4 5 6 \n7 8 9 \n
```

#### c) Implementer en metode

```java
public static int[][] skaler(int tall, int[][] matrise)
```
som returnerer en ny matrise der alle tall i matrisen er multiplisert med parameteren `tall`. Metoden må først opprette en ny matrise (fler-dimensjonell tabell) som er like stor som parameteren og så multiplisere alle elementer med `tall`.

#### d) Implementer en metode

```java
public static boolean erLik(int[][] mat1, int[][] mat2)
```

som avgjør om to matriser gitt ved parametrene `a` og `b` er like.

### Oppgave 6 (Valgfri/vanskelig)

Om du velger ikke å gjøre de to valgfrie oppgavene nedenfor så fjern de tester fra `MatriserEnhetsTests.java` som tester de to metodene i a) og b) nedenfor.

#### a)  Implementer en metode

```java
public static int[][] speile(int [][] matrise)
```

som kan speile en kvadratisk matrise som beskrevet i oppgave 5.17 i Java-boken. Metoden må først opprette en matrise like stor som parameteren. Etter dette skal metoden kopiere alle elementene fra parameteren til den nye matrisen og så speile den nye.

##### b)  Implementer en metode

```java
public static int[][] multipliser(int[][] a, int[][] b)
```

som kan multiplisere to matriser. Test metoden. Vi har lov å multiplisere to matriser hvis antall kolonner i den første matrisen er lik antall rekker i den andre. For definisjon av matrise-multiplikasjon, se eks. https://en.wikipedia.org/wiki/Matrix_multiplication

### Oppgave 7: Sjekk at alle metoder fungerer og push til GitHub

Når alle metoder i oppgave 4 og 5 (og evt. 6) fungerer dvs. alle enhets-test passerer, da må dere huske å pushe koden opp på GitHub. 

Når koden er pushet opp på GitHub Gå inn under *Actions*. Sjekk at den automatisk testen som blir kjørt når du legger opp koden har et grønt tick på seg. 

Husk også å levere lenke til GitHub oppbevaringsplassen inn på Canvas.

