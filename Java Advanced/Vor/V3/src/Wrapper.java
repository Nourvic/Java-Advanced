import java.util.Formatter;

public class Wrapper {

    public static void main(String[] args) {
        int a = 10;
         Integer b = new Integer(15);
     //   Integer b = new Integer(15);
        System.out.println(b);
        //     String name = new String("Nour"); geht nicht es muss eine eindeutige Zahl sein
        String name = "7";

        int x = Integer.parseInt(name);

        System.out.println("Zeichenkette  in Integer Value umgewandelt => " + x);

        // Alternative zu syso
        Formatter f = new Formatter(System.out);
        // ein einfaches Beispiel
        // f.format("%s ist Fh Student und ist %d jahre alt ", "Nour", 25);

        // Flags
        for (int i = 0; i < 8; i++) {
            System.out.format("2 hoch %d ist %.0f %n", i, Math.pow(2, i));

        }
        f.close();
    }


}
