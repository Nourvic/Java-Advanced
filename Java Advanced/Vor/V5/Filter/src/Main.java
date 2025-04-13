import java.io.File;

public class Main {
    public static void main(String[] args) {

        // سلمت كلاس عم يعمل implements لل DirVisitor و يلي هو DirPrinter
        // warum? DirVisitor ist ein interface
        FileTree fr1 = new FileTree(new DirPrinter());
        File file = new File("C:\\Users\\noura\\OneDrive\\Desktop\\Studium\\Bücher der IT-Sicherheit");
        fr1.traverse(file);


    }
}