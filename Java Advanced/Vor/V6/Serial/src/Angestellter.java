import java.io.Serializable;

public class Angestellter implements Serializable {

    private String name;
    private int alter;
    private double grundgehalt;
    private double bonus;

    public Angestellter(String name, int alter, double grundgehalt, double bonus) {
        this.name = name;
        this.alter = alter;
        this.grundgehalt = grundgehalt;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double berechneGehalt() {
        return grundgehalt + bonus;
    }

    @Override
    public String toString() {
        return "Angestellter{" +
                "name = " + name +
                ", alter = " + alter +
                ", grundgehalt = " + grundgehalt +
                ", bonus = " + bonus +
                "}";
    }
}