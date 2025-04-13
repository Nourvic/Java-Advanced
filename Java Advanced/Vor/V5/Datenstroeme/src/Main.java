import java.io.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        File fa = new File("/Users/nourvic7/Desktop/Java Streams/FilterWriter/toUpperCase.txt");

        try (FileWriter fw = new FileWriter(fa);
             Aufgabe30 au = new Aufgabe30(fw);
             PrintWriter pw = new PrintWriter(au)) {
            pw.println("ALLES OK!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File error");
        }


//        String test = "Eines Tages saß Alex, ein leidenschaftlicher Programmierer, an einem Projekt, das er \"BuglessApp\" nannte. Er war überzeugt, dass sein Code perfekt sei.\n" +
//                "\n" +
//                "Nach Stunden intensiver Arbeit schrieb er die letzten Zeilen und führte das Programm aus. Die Konsole spuckte jedoch nur eines aus:";
//        try (FileWriter wr = new FileWriter(new File("/Users/nourvic7/Desktop/Java Streams/Stream/writein.txt"));
//             Aufgabe30 au = new Aufgabe30(wr);
//             PrintWriter pout = new PrintWriter(au)) {
//            pout.println("AllES KLEIN !");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    public static void schirebeninatei(OutputStream ous) {
        try (Writer rw = new OutputStreamWriter(ous)) {

            rw.write("Eines Tages saß Alex, ein leidenschaftlicher Programmierer, an einem Projekt, das er \"BuglessApp\" nannte. Er war überzeugt, dass sein Code perfekt sei.\n" +
                    "\n" +
                    "Nach Stunden intensiver Arbeit schrieb er die letzten Zeilen und führte das Programm aus. Die Konsole spuckte jedoch nur eines aus:");

            rw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException x) {
            x.printStackTrace();
        }
    }
}