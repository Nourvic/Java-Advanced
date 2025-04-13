import java.io.File;

public class FileTree {

    private DirVisitor visitor;

    public FileTree(DirVisitor visitor) {
        this.visitor = visitor;
    }

    public void traverse(File f) {
        if (f.isDirectory()) {
            visitor.enter(f);
            for (File files : f.listFiles(new Filterjava())) {
                if (files.isDirectory()) {
                    traverse(files);
                } else {
                    visitor.visitFile(files);
                }
            }
            visitor.exit(f);
        }
    }

}