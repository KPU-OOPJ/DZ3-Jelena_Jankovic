
package zadatak3;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    
   private List<MestoUAvionu> mesto = new ArrayList<>(120);

    public Avion(){
        while (true){
            mesto.add(new MestoUAvionu());
        }
    }

    public void setMesto(List<MestoUAvionu> mesto) {
        this.mesto = mesto;
    }

    public void uvediPutnika(int redniBroj, String imePrezime, int starost) {
        if (redniBroj < 119 && redniBroj > 0) {

            if (mesto.get(redniBroj).isZauzetost() == false) {
                mesto.get(redniBroj).setImePrezime(imePrezime);
                mesto.get(redniBroj).setStarost(starost);
                mesto.get(redniBroj).setZauzetost(true);
            } else {
                System.out.println("Mesto je zauzeto");
            }
        }
    }

    public void izvediPutnika(int redniBroj, String imePrezime, int starost) {
        if (redniBroj > 119 || redniBroj < 0)
            System.out.println("Redni broj je van opsega");
        if (mesto.get(redniBroj).isZauzetost()) {
            mesto.get(redniBroj).setImePrezime(null);
            mesto.get(redniBroj).setStarost(0);
            mesto.get(redniBroj).setZauzetost(false);
        } else {
            System.out.println("Mesto nije zauzeto");
        }
    }

    public boolean daLiJeUAvionu(String imePrezime, int starost) {
        for (MestoUAvionu putnik : mesto) {
            if (putnik.getImePrezime() == imePrezime && putnik.getStarost() == starost)
                return true;
        }
        return false;
    }

    public double getProcenti() {
        int i = 0;
        for (MestoUAvionu putnik : mesto) {
            if (putnik.isZauzetost())
                i++;
        }
        double procenti = (double) i * 1.2;
        return procenti;
    }

    public boolean getPraznaSedista() {
        for (MestoUAvionu putnik : mesto) {
            if (!putnik.isZauzetost())
                return true;
        }
        return false;
    }

    public int prosecnaStarost() {
        int zbir = 0;
        int brojac = 0;
        for (MestoUAvionu putnik : mesto) {
            if (putnik.isZauzetost()) {
                zbir += putnik.getStarost();
                brojac++;
            }
        }
        return (int) zbir / brojac;
    }

    public int getNajstariji() {
        int max = 0;
        for (MestoUAvionu putnik : mesto) {
            if (putnik.isZauzetost()) {
                if (putnik.getStarost() > max)
                    max = putnik.getStarost();
            }
        }
        return max;
    }

    public int getNajmladji() {
        int min = mesto.get(1).getStarost();
        for (MestoUAvionu putnik : mesto) {
            if (putnik.isZauzetost()) {
                if (putnik.getStarost() < min)
                    min = putnik.getStarost();
            }
        }
        return min;
    }

    public void ispisi() {
        for(MestoUAvionu putnik: mesto)
            System.out.println(putnik.toString());
    }

    public boolean stringString(String s1, String s2) {
        return s1.contains(s2);
    }

    public void ispisiJovanovic() {
        for(MestoUAvionu putnik: mesto)
            if(stringString(putnik.getImePrezime(),"Jovanovic"))
                System.out.println(putnik.toString());
    }
    
}
