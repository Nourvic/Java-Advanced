import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("/Users/nourvic7/Desktop/Java Streams/Sreial.txt");
        // Konto konto = new Konto(1000);
        Kunde kunde = new Kunde(" Nour Salim ", new Konto(17000));

        // Serialisieren
        //   serialisieren(file, kunde);

        //Desirialisieren
        //    System.out.println(deserialisieren(file));

    }


    public static void serialisieren(File f, Kunde k) {
        try (OutputStream fos = new FileOutputStream(f);
             ObjectOutputStream ois = new ObjectOutputStream(fos);) {
            ois.writeObject(k);
            ois.writeDouble(k.getKonto().getGuthaben());

        } catch (FileNotFoundException e) {
            System.out.println("Fehlermeldung");
        } catch (IOException e) {
            System.out.println("Fehlermeldung ");
        }
    }

    public static Kunde deserialisieren(File f) {
        Kunde k = null;
        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            k = (Kunde) ois.readObject();
        } catch (FileNotFoundException ef) {
            ef.printStackTrace();
        } catch (IOException ep) {
            ep.printStackTrace();
        } catch (ClassNotFoundException ec) {
            ec.printStackTrace();
        }
        return k;
    }


}