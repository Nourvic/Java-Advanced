import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Aufgabe26 {
    public static void main(String[] args) {
        File from = new File("/Users/nourvic7/Desktop/Java Streams/beispielFROM.txt");

        //    cat(from);
        cat3(new File("/Users/nourvic7/Desktop/Java Streams/Raf/from.txt"));
        /*
        try {
            cat2(ffrom);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }

    public static void cat(File quelle) {
        try (RandomAccessFile input = new RandomAccessFile(quelle, "r");) {
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void cat2(File quelle2) throws IOException {
        RandomAccessFile input2 = null;
        try {
            input2 = new RandomAccessFile(quelle2, "r");
            int i = 0;
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input2 != null) {
                input2.close();
            }
        }
    }

    public static void cat3(File quele) {
        try (RandomAccessFile in = new RandomAccessFile(quele, "r");) {
            int a = 0;
            while ((a = in.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
