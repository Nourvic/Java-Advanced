public class Main {
    public static void main(String[] args) {


        Risiko r1 = new AkzeptablesRisiko("Lizenzkosten der IDE steigt", 2000f, 2f);
        Risiko r2 = new ExtremesRisiko("Hauptauftraggeber meldet Insolvenz an", 2000f, 2f, "Versicherung abschliessen", 50000);
        Risiko r3 = new InakzeptablesRisiko("DB Experte verla ̈sst das Projekt", 4000f, 4f, "Ersatz bei Dienstleister reservieren");
        Risiko r4 = new ExtremesRisiko("Hauptauftraggeber meldet Insolvenz an", 2000f, 2f, "Versicherung abschliessen", 50000);

        r1.druckeDaten();
        r2.druckeDaten();
        r3.druckeDaten();

        if (r4.equals(r2)) {
            System.out.println("\n" + "sind gleich");
        } else {
            System.out.println("nicht gleich");
        }

    }
}