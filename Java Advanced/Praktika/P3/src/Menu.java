import javax.swing.JOptionPane;
import java.util.Scanner;

public class Menu {


    private static float LIMIT = 10000;
    private static float KOSTENLIMIT = 1000000;

    public static void main(String[] args) {
        Risikoverwaltung risverw = new Risikoverwaltung();
        Scanner sc = new Scanner(System.in);

        int eingabe;

        do {
            System.out.println("\nRisikoverwaltung \n");
            System.out.println("1. Risiko aufnehmen ");
            System.out.println("2. Zeige alle risiken ");
            System.out.println("3. Zeige Risiko mit maximaler Rückstellung ");
            System.out.println("4. Berechne Summe aller Rückstellungen  ");
            System.out.println("5. Beenden ");
            System.out.println("\nBiite Menüpunkt Wählen");

            eingabe = sc.nextInt();
            sc.nextLine();

            switch (eingabe) {

                case 1: //String bezeichnung, float eintrttswahrscheinlichkeit, float kosten_im_schadensfall
                {
                    String bezeich = JOptionPane.showInputDialog(null, "Bezeichnung ");
                    String eintrs = JOptionPane.showInputDialog(null, "Eintrttswahrscheinlichkeit ein");
                    float eintrwf = Float.parseFloat(eintrs);
                    String kschaden = JOptionPane.showInputDialog(null, "Kosten im Schadenfall");
                    float kschadenf = Float.parseFloat(kschaden);
                    float risikowert = eintrwf * kschadenf;
                    Risiko risiko = null;
                    if (risikowert < LIMIT) {
                        risiko = new AkzeptablesRisiko(bezeich, eintrwf, kschadenf);
                    } else if (kschadenf > KOSTENLIMIT) {
                        risiko = new ExtremesRisiko(bezeich, eintrwf, kschadenf, "rx", 25000f);
                    } else {
                        risiko = new InakzeptablesRisiko(bezeich, eintrwf, kschadenf, "Sv");
                    }
                    risverw.aufnehmen(risiko);
                    break;
                }
                case 2:
                    risverw.zeigeRisiken();
                    break;
                case 3:
                    risverw.sucheRisikoMitMaxRueckstekkung();

                    break;
                case 4:
                    float berechnesumme = risverw.berechneSummeRueckstekkungen();
                    JOptionPane.showMessageDialog(null, "Summe aller Rueckstellungen : " + berechnesumme);
                    break;
                case 5:
                    System.out.println("Das Programm ist beendet ");
                    break;
                default:
                    System.out.println("Ungütlige Angabe");
                    break;
            }

        } while (eingabe != 5);

    }

}
