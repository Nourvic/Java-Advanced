import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Aufgabe25 {

    public static void main(String[] args) {

        File from = new File("/Users/nourvic7/Desktop/Java Streams/beispielFROM.txt");
        File to = new File("/Users/nourvic7/Desktop/Java Streams/BeispielTO Kopie.txt");


//        try {
//            copy(ffrom, fto);
//            System.out.println("The Operation was pretty good!");
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }


        copy2(from, to);
        // System.out.println("The Operation was pretty good!");

    }

    public static void copy(File from, File to) throws IOException {
        RandomAccessFile rafIN = null;
        RandomAccessFile rafOUT = null;

        try {
            rafIN = new RandomAccessFile(from, "r");
            rafOUT = new RandomAccessFile(to, "rw");
            int i = 0;
            while ((i = rafIN.read()) != -1) { // solange die Datei noch gelesen wird
                //   rafOUT.write(rafIN.read());
                rafOUT.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
            //      throw new IOException(e);
        } finally {
            if (rafIN != null) {
                rafIN.close();
            } else if (rafOUT != null) {
                rafOUT.close();
            } else {
                throw new IOException();
            }
        }

    }

    // Try- With- Resources
    public static void copy2(File from, File to) {


        try (RandomAccessFile in = new RandomAccessFile(from, "r"); RandomAccessFile out = new RandomAccessFile(to, "rw");) {
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copy3(File from, File to) {
        try (RandomAccessFile in = new RandomAccessFile(from, "r");
             RandomAccessFile out = new RandomAccessFile(to, "rw");) {
            int c = 0;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }


}
