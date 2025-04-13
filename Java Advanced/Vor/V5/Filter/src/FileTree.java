import java.io.File;

public class FileTree {

    private DirVisitor dv;


    public FileTree(DirVisitor dv) {
        this.dv = dv;

    }

    public void traverse(File dir) {
        if (dir.isDirectory()) {
            dv.enter(dir);
            File[] liste = dir.listFiles(new Filtering());// Filter => da FileFilter interface ist muss muessen wir die Klasse Filtering geben
            for (File f : liste) {
                if (f.isDirectory()) {
                    traverse(f);
                } else {
                    dv.visitFile(f);
                }
            }
            dv.exit(dir);
        }
    }


}
