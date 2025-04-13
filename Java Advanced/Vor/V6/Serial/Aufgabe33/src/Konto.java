import java.io.Serializable;

public class Konto implements Serializable {
    private double guthaben;
    private static final long serialVersionUID = -729034045372955790L;


    public Konto(double guthaben) {
        this.guthaben = guthaben;
    }

    public double getGuthaben() {
        return guthaben;
    }
}
