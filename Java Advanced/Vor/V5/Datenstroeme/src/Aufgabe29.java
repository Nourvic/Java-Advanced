import java.io.*;

public class Aufgabe29 {


    public static void main(String[] args) {
        Angestellter a = new Angestellter("Abn baba", 7777);
        File fa = new File("/Users/nourvic7/Desktop/Java Streams/beispielFROM.txt");

        //  schreiben(a, fa);

        // dateischreiben(new File("/Users/nourvic7/Desktop/Java Streams/Stream/writein.txt"));

        schreiben2(new Angestellter("Nour", 2500), new File("/Users/nourvic7/Desktop/Java Streams/Stream/writein.txt"));
    }

    public static void schreiben2(Angestellter a, File f) {
        try (FileWriter fw = new FileWriter(f);
             PrintWriter prw = new PrintWriter(fw)) {
            prw.println("Name : " + a.getVorname());
            prw.println("Gehalt : " + a.getGehalt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException x) {
            x.printStackTrace();

        }
    }


    public static void dateischreiben(File f1) {
        try (OutputStream out = new FileOutputStream(f1)) {

            out.write(new byte[]{65, 66, 67});
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException c) {
            c.printStackTrace();

        }
    }

    public static void schreiben(Angestellter a, File f) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            pw.println("Name: " + a.getVorname());
            pw.println("Gehalt: " + a.getGehalt());
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
