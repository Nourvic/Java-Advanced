import java.io.File;

public class DirPrinter implements DirVisitor {


    private String leerzeichen;


    public DirPrinter() {
        leerzeichen = "";
    }

    @Override
    public void enter(File file) {
        System.out.println(leerzeichen + "[" + file.getName() + "]");
       // leerzeichen = leerzeichen == "" ? "   " : "";
           leerzeichen += "   ";
    }

    @Override
    public void visitFile(File file) {
        System.out.printf("%s%s\n", leerzeichen, file.getName());
    }

    public void exit(File file) {
         leerzeichen = leerzeichen.substring(3);
       // leerzeichen = leerzeichen == "   " ? "" : "   ";
    }
}