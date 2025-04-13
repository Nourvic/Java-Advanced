import java.io.File;

public class Filesize implements DirVisitor {

    private long size;


    public Filesize() {
        size = 0;
    }

    public void enter(File f) {


    }

    public void visitFile(File f) {
        this.size += f.length();
    }

    public void exit(File f) {

    }

    public long getSize() {
        return size/1000000;
    }


}
