
package zadatak3;

public class TestAvion {
    
      public static void main(String[] args) {
       
        Avion avion = new Avion();
        avion.uvediPutnika(21, "Jovan Jovanovic", 53);
        avion.uvediPutnika(31, "Milos Milosevic", 23);
        avion.uvediPutnika(41, "Ana Jovanovic", 22);

        avion.ispisi();
        avion.ispisiJovanovic();
        System.out.println(avion.getPraznaSedista());

    } 
       
    
}
