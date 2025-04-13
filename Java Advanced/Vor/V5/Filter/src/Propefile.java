import java.io.File;

public class Propefile {

    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\noura\\OneDrive\\Desktop\\Studium");
        File f2 = new File("C:\\Users\\noura\\OneDrive\\Desktop\\Studium");


        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f1.isFile());// ist eine Datei? ملف
        System.out.println(f2.isFile());
        System.out.println(f1.isDirectory()); // ist ein Verzeichnis? مجلد
        System.out.println(f1.isDirectory());
    }
}
