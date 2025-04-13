import java.io.File;

public class sizecalaulator implements DirVisitor {
    private double size;

    public void enter(File file) {

    }

    public void visitFile(File file) {
        size += file.length()/1000000;
    }

    @Override
    public void exit(File file) {

    }

    public long getSize() {
        return (long) size ;
    }


}