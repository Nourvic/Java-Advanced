import java.io.Serializable;

public class Kunde implements Serializable {
    private String nachname;
    private Konto konto;
    private static final long serialVersionUID = -729034045372955790L;

    //  Es erfolgt keine Automatische Berechnung mehr
    public Kunde(String nachname, Konto konto) {
        this.nachname = nachname;
        this.konto = konto;
    }

    public String getNachname() {
        return nachname;
    }

    public Konto getKonto() {
        return konto;
    }

    public String toString() {
        return "Name :" + getNachname() + "\nKontostand :" + konto.getGuthaben() + "";

    }
}
