**Napravite klase MestoUAvionu, Avion i TestAvion sa sledećim uslovima:**

a)	Javna klasa MestoUAvionu koja ima: 
-	Privatni atribut slobodno koji predstavlja indikator zauzetosti sedišta (mesta). Ovaj indikator ima vrednost TRUE ako je mesto slobodno a FALSE ako nije. Početna vrednost za ovaj atribut je TRUE. 
-	Privatni atribut imePrezime koji predstavlja ime i prezime putnika koji sedi na tom mestu dato u formatu ”IME PREZIME”. Početna vrednost za ovaj atribut je null. 
-	Privatni atribut starost koji predstavlja broj godina putnika koji sedi na tom mestu. Početna vrednost za ovaj atribut je 0. 
-	Odgovarajuće javne get i set metode za ova tri atributa. 
-	Redefinisanu metodu toString klase Object koja vraća String sa svim podacima o mestu u avionu. Ako je mesto slobodno, vraća se String koji sadrži reč “Slobodno”, a ako nije vraća se String sa imenom i prezimenom i godinama starosti putnika koji se nalazi na tom mestu. 

b)	Javna klasa Avion koja ima: 
-	Privatni atribut mesta koji predstavlja niz objekata klase MestoUAvionu. 
-	Javni konstruktor koji inicijalizuje atribut mesta i kreira svako pojedinačno mesto u avionu. Avion ima tačno 120 mesta. 
-	Javnu metodu uvediPutnika koja kao ulazni argument dobija redni broj mesta, String sa imenom i prezimenom putnika i godine starosti putnika. Ako je mesto sa tim brojem već zauzeto ili je uneti broj mesta van opsega (0-119), potrebno je ispisati poruku o grešci, a u suprotnom “uvesti” putnika na dato mesto i postaviti da mesto nije slobodno. 
-	Javnu metodu izvediPutnika koja kao ulazni argument dobija redni broj mesta. Ako je mesto sa tim brojem već slobodno ili ako je broj mesta van opsega (0-119), potrebno je ispisati poruku o grešci, a u suprotnom “izvesti” putnika sa datog mesta i postaviti mesto da bude slobodno. 
-	Javnu metodu daLiJeUAvionu koja kao ulazni argument dobija String sa imenom i prezimenom putnika i njegove godine starosti. Metoda vraća TRUE ako se putnik nalazi u avionu, a u suprotnom FALSE. 
-	Javnu metodu koja izračunava i vraća procentualnu zauzetost sedišta u avionu. Ako je avion popunjen, metoda vraća 100.0%, a ako je prazan 0.0%. 
-	Javnu metodu koja proverava da li u avionu ima slobodnih sedišta. Ako ima, metoda vraća TRUE, a u suprotnom FALSE. 
-	Javnu metodu koja izračunava i vraća prosečnu starost putnika kao ceo broj. 
-	Javnu metodu koja vraća broj godina najstarijeg putnika. 
-	Javnu metodu koja vraća broj godina najmlađeg putnika. 
-	Javnu metodu koja na ekranu ispisuje redni broj i podatke o svakom mestu u avionu. 
-	Javnu metodu koja na ekranu ispisuje podatke o svim putnicima u avionu koji se prezivaju “Jovanovic”. 

c)	Klasa TestAvion koja kreira jedan objekat klase Avion. Potrebno je u avion uvesti putnike: “Jovan Jovanovic” (53 godine), “Milos Milosevic” (23 godine) i “Ana Jovanovic” (22 godine) na 21, 31 i 41 mesto. Ispisati sve podatke o putnicima, ispisati samo podatke o putnicima koji se prezivaju Jovanovic i ispisati prosečnu starost putnika. 
