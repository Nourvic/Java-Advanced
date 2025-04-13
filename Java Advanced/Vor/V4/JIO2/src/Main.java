import java.io.File;

public class Main {
    public static void main(String[] args) {

        FileTree ft = new FileTree(new DirPrinter());
        ft.traverse(new File("/Users/nourvic7/Desktop/ME"));

    }
}