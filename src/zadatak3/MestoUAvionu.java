
package zadatak3;


public class MestoUAvionu {
    
 private boolean zauzetost = true;
    private String imePrezime = null;
    private int starost = 0;
    private int i = 0;

    public MestoUAvionu(String imePrezime, int starost) {
        if(i < 119) {
            this.zauzetost = true;
            this.imePrezime = imePrezime;
            this.starost = starost;
            i++;
        }
    }

    public MestoUAvionu() {
        if(i < 119) {
            this.zauzetost = false;
            i++;
        }
    }

    public int getI() {
        return i;
    }

    public boolean isZauzetost() {
        return zauzetost;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setZauzetost(boolean zauzetost) {
        this.zauzetost = zauzetost;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    @Override
    public String toString() {
        if (zauzetost == false)
            return imePrezime + " " + starost;
        return "Slobodno";
    }
}


    