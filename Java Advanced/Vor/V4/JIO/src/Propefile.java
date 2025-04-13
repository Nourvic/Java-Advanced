import java.io.File;

public class Propefile {

    public static void main(String[] args) {


        File f1 = new File("/Users/nourvic7/Desktop/ME");


        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        // System.out.println(f2.getAbsolutePath());
        System.out.println(f1.isFile());// ist eine Datei? ملف
        // System.out.println(f2.isFile());
        System.out.println(f1.isDirectory()); // ist ein Verzeichnis? مجلد
        // System.out.println(f2.isDirectory());
    }
}
