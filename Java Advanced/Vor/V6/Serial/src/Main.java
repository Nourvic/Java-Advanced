import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("/Users/nourvic7/Desktop/Java Streams/Serial/Serialtest.txt"); // Verwenden Sie den relativen Pfad für einfachere Handhabung
        Angestellter angestellter = new Angestellter("Nour", 25, 4300, 400);

        //      serialisierung(angestellter,f);

        //  serialisierung2(angestellter, f);

        System.out.println(deserialisierung2(f));

    }

    // Alternativ
    public static void serialisierung(Angestellter a, File f) {
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(a);
        } catch (FileNotFoundException fe) {
            System.out.print("Feglermeldung");
        } catch (IOException e) {
            System.out.println("Feglermeldung");
        }

    }

    public static void serialisierung2(Angestellter a, File f) {
        try (FileOutputStream ous = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(ous);
        ) {

            oos.writeObject(a);
        } catch (FileNotFoundException c) {
            c.printStackTrace();
        } catch (IOException s) {
            s.printStackTrace();
        }
    }


    public static Angestellter deserialisierung2(File f) {
        Angestellter angestellter = null;
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (Angestellter) ois.readObject();

        } catch (FileNotFoundException c) {
            c.printStackTrace();
        } catch (IOException s) {
            s.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return null;
    }

    public static Angestellter deserialisierung(File f) {
        Angestellter a = null;
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis);) {

            a = (Angestellter) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ec) {
            ec.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return a;
    }
}