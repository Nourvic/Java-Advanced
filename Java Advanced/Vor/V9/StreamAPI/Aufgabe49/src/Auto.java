public class Auto {

    private String Hersteller;
    private int Baujahr;


    public Auto(String hersteller, int baujahr) {
        Hersteller = hersteller;
        Baujahr = baujahr;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public int getBaujahr() {
        return Baujahr;
    }

    public void setBaujahr(int baujahr) {
        Baujahr = baujahr;
    }

    public String toString() {
        return "Hersteller " + Hersteller + " Baujahr " + Baujahr;
    }
}
