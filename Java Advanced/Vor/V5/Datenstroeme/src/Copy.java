import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.time.Instant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Copy {

    public static void main(String[] args) {

        //File from = new File("/Users/nourvic7/Desktop/Java Streams/beispielFROM.txt");
        File from2 = new File("/Users/nourvic7/Desktop/Java Streams/Stream/from2.txt");

        //  File to = new File("/Users/nourvic7/Desktop/Java Streams/BeispielTO Kopie.txt");
        File to2 = new File("/Users/nourvic7/Desktop/Java Streams/Stream/to2.txt");


        //   copy3withBuffer(from, to);


        copy3(from2, to2);


        //  Instant start = Instant.now();

        //    copy(from, to);

//        Instant end = Instant.now();

        //      long timeElapsed = Duration.between(start, end).toMillis();

        //    System.out.printf("Copy dauert %d ms\n", timeElapsed);

        //  System.out.printf("Copy dauert in d% ms\n", Duration.between(start, end).toMillis());
    }

    // Aufgabe 27
    public static void copy(File from, File to) {

        try (InputStream inputs = new FileInputStream(from);
             BufferedInputStream bis = new BufferedInputStream(inputs);
             OutputStream outputs = new FileOutputStream(to);
             BufferedOutputStream bos = new BufferedOutputStream(outputs);) {
            int c;
            while ((c = bis.read()) != -1) {
                bos.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void copy3(File from, File to) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to))
        ) {
            int c = 0;
            while ((c = bis.read()) != -1) {
                bos.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException x) {
            x.printStackTrace();
        }
    }


    public static void copy2(File from, File to) {
        try (FileInputStream fis = new FileInputStream(from);
             FileOutputStream fos = new FileOutputStream(to)) {
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Kol Khara");

        } catch (IOException e) {
            System.out.println("Kol Khara");
        }
    }

    public static void copy3withBuffer(File from, File to) {
        try (
                FileInputStream fis = new FileInputStream(from);
                BufferedInputStream bis = new BufferedInputStream(fis);
                // FileOutputStream fos = new FileOutputStream(to);
                // BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            int i;
            while ((i = bis.read()) != -1) {
                //   bos.write(i);
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Kol Khara");

        } catch (IOException e) {
            System.out.println("Kol Khara");
        }
    }


}
