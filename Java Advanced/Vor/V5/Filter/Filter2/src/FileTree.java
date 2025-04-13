import java.io.File;

public class FileTree {

    private DirVisitor dv;

    public FileTree(DirVisitor dv) {
        this.dv = dv;
    }

    public void traverse(File dir) {
        if (dir.isDirectory()) {
            dv.enter(dir);
            //File[] files = dir.listFiles();
            for (File f : dir.listFiles()) {
                traverse(f);
            }
            dv.exit(dir);
        } else {
            dv.visitFile(dir);
        }
    }

}
