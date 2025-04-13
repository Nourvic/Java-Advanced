import java.io.*;

public class WriterAndReader {
    public static void main(String[] args) {

        File file = new File("/Users/nourvic7/Desktop/Java Streams/beispielFROM.txt");


        schreiben(new Angestellter("Nour", 12312), new File("/Users/nourvic7/Desktop/Java Streams/Stream/writein.txt"));


//        Angestellter ag= new Angestellter("Nour",15000);
//        schreiben(ag,file);

    }


    //Aufgabe 28
    public static void sayHello(OutputStream outs, String t) throws IOException {
        //String t = "Hello Wor ld!";
        Writer sw = new OutputStreamWriter(outs);
        sw.write(t.toCharArray());
        sw.flush();
    }

    public static void saghallo(OutputStream outs) throws IOException {
        Writer wr = new OutputStreamWriter(outs);
        wr.write("verpiss dich");
        wr.flush();
    }


    //Aufgabe 29
    public static void schreiben(Angestellter a, File f) {
        try (
                FileOutputStream fis = new FileOutputStream(f);
                OutputStreamWriter fw = new OutputStreamWriter(fis)) {
            fw.write(a.toString().toCharArray());
        } catch (FileNotFoundException e) {
            System.out.println("Kol Zib");
        } catch (IOException e) {
            System.out.println("jajaja");
        }
    }


}
