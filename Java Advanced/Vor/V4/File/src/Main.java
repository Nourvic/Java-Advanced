import java.io.File;

public class Main {
    public static void main(String[] args) {
        sizecalaulator sc = new sizecalaulator();
        FileTree filetree = new FileTree(sc);
        filetree.traverse(new File("/Users/nourvic7/Desktop/ME"));
        System.out.println(sc.getSize() + " MB");

    }
}