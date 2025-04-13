public class Angestellter {
    private String vorname;
    private double gehalt;

    public Angestellter(String vorname, double gehalt) {
        this.vorname = vorname;
        this.gehalt = gehalt;

    }

    public double getGehalt() {
        return gehalt;
    }

    public String getVorname() {
        return vorname;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Angestellter{" +
                "vorname='" + vorname + '\'' +
                ", gehalt=" + gehalt +
                '}';
    }
}
