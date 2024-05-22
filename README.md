# java-for-romanians

Java Pentru Romani

### De ce orice aplicatie Java are nevoie de un emulator?

Pentru crearea unei aplicatii exista doua metode de executie:

1. Compilarea - un pas ce se face inainte de executia aplicatiei prin care codul scris este tradus in ceva ce sistemul
   de operare intelege si poate executa.
2. Interpretarea - traducerea progresiva a fiecarei instructiuni in parte in ceva ce sistemul de operare poate intelege
   pe parcursul executiei.

Aplicatiile scrise cu Java difera. In urma compilarii, rezulta o aplicatie care nu poate fi inteleasa de sistemul de
operare si astfel apare acest "emulator" sau JVM care interpreteaza pentru sistemul de operare ce a rezultat din
compilare.

### Care sunt modurile de gandire care pot fi folosite in scrierea aplicatiilor?

1. Procedural -> procesarea datelor este gandita ca un set de instructiuni pusa intr-o ordine bine definita.
2. Functional -> procesarea datelor este aplicarea secventiala a unor transformari (functii)
3. Orientat pe obiecte -> procesarea datelor se face in jurul obiectelor si a relatiilor intre acestea

### Care sunt tipurile de date in Java?

Tip de Date | Descriere                                                                                      | Exemplu                      |
--- |------------------------------------------------------------------------------------------------|------------------------------|
int | Numar intreg, aplicabil aproape in orice caz in care avem nevoie de o valoare de tip nr intreg | int age, int numberOfSeconds |
long | Numar intreg, folosit atunci cand valoarea nu se incadreaza in intervalul tipului int          | long numberOfMolecules       |
double | Tip de date pentru numere reale                                                                | double distance              |
boolean | Tip de date pentru reprezentarea valorii de adevar (adevarat sau fals)                         | boolean created              |
String | Tip de date pentru valori text                                                                 | String name                  | 

### Care sunt principalele categorii de tipuri de obiecte?

1. Model -> folosit pentru a structura datele care urmeaza sa fie procesate, fie pentru a putea fi stocate, fie pentru a fi transferate catre altcineva.
2. Service -> obiect care implementeaza logica de business care ajuta la transformarea datelor in modul asteptat de un utilizator
3. Manager -> obiect care implementeaza parte din logica ce este folosita de mai multe obiecte din aplicatie
4. Proxy -> obiect care faciliteaza comunicarea cu alta aplicatie
5. Repository -> obiect care implementeaza operatii pentru lucrul cu o tabela dintr-o baza de date
6. Controller -> obiect care faciliteaza accesul catre logica implementata de un serviciu.

### Ce este un model? 

```
public class Product {
   private String name;
   private BigDecimal price;
   private String type;
}
```

Clasa Product reprezinta definitia unui obiect model. Produsul are un nume, un pret si un tip.

### Ce este un serviciu?

Clasele de tip serviciu sunt cele in care definim cazurile de utilizare.

Daca ne imaginam ca aplicatia pe care o dezvoltam ajuta la managementul unui depozit, atunci putem considera cumpararea unui produs ca fiind un caz de utilizare (reprezinta ceva ce utilizatorul ar face din aplicatie).

```
   public class PurchaseService {
      public void purchaseProduct(Product p) {
         // definitia metodei
      }
   }
```

### Ce este un manager?

Obiectele de tip manager au rolul de a implementa operatii ce sunt folosite de mai multe cazuri de utilizare pentru a facilita scrierea unui cod simplu ce nu presupune repetitia unor parti de logica.

### Ce este un proxy?

Obiectele proxy sunt obiecte responsabile cu trimiterea de mesaje catre alte aplicatii sau sisteme.

### Ce este un repository?

Obiectele repository sunt responsabile cu implementarea comunicarii cu aplicatia server ce asigura managementul unei baze de date.

### Ce este un controller?

Obiectele de tip controller au rolul de a oferi calea de acces catre logica implementata de servicii.

### Tipuri de obiecte - Rezumat

1. Obiectele model definesc structura datelor cu care aplicatia lucreaza.
2. Obiectele proxy implementeaza comunicarea cu aplicatii si sisteme externe.
3. Obiectele repository implementeaza operatiile de persistare  a datelor intr-o baza de date.
4. Obiectele controller implementeaza accesul catre logica implementata de aplicatie.
5. Obiectele serviciu implementeaza logica ce proceseaza datele conform asteptarilor utilizatorilor.
6. Obiectele manager separa blocurile de cod folosite din mai multe locuri pentru a elimina duplicarea fragmentelor de cod sursa.

### Abordarea cerintelor utilizatorilor

1. Dezvoltarea in cascada (waterfall) - ce presupune intelegerea cerintelor ca pe o faza ce se intampla inainte de inceperea constructiei sistemului software.
2. Dezvoltarea agile (agile) - presupune inceperea fazei de constructie a sistemului software imediat ce au fost intelese o parte din cerinte, dar nu neaparat toate.

