public class Main {
    public static void main(String[] args) {

        Risikoverwaltung risv = new Risikoverwaltung();
        Risiko r1 = new AkzeptablesRisiko("Lizenzkosten der IDE steigt", 2000f, 2f);
        Risiko r2 = new ExtremesRisiko("Hauptauftraggeber meldet Insolvenz an", 2000f, 2f, "Versicherung abschliessen", 50000);
        Risiko r3 = new InakzeptablesRisiko("DB Experte verla ̈sst das Projekt", 4000f, 4f, "Ersatz bei Dienstleister reservieren");
        Risiko r4 = new InakzeptablesRisiko("DB Experte verla ̈sst das Projekt", 4000f, 4f, "Ersatz bei Dienstleister reservieren");




        System.out.println(r3.equals(r4));
    //    System.out.println();
        //   System.out.println(risv.berechneSummeRueckstekkungen());
    }
}