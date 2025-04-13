import java.io.File;

public class DirPrinter implements DirVisitor {
    private String leerzeichen;

    public DirPrinter() {
        this.leerzeichen = "";
    }

    @Override
    public void enter(File file) {
        System.out.println(leerzeichen + " [" + file.getName() + "]");
        leerzeichen += "   ";
    }

    @Override
    public void visitFile(File file) {
        System.out.println(leerzeichen + file.getName());
    }

    @Override
    public void exit(File file) {
        leerzeichen = leerzeichen.substring(3);
    }

}