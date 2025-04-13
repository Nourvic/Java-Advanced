import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("/Users/nourvic7/Desktop/UNI/Projektwoche 24");
        Filesize fz = new Filesize();
        FileTree ft = new FileTree(fz);
        ft.traverse(f1);
        System.out.println(fz.getSize());
    }


}