import java.io.File;

public class Main {
    public static void main(String[] args) {

        // سلمت كلاس عم يعمل implements لل DirVisitor و يلي هو DirPrinter
        // warum? DirVisitor ist ein interface
        FileTree filetree = new FileTree(new DirPrinter());
        filetree.traverse(new File("/Users/nourvic7/Desktop/ME"));


    }
}