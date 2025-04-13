import java.io.File;

public class FileTree {

    private DirVisitor visitor;


    public FileTree(DirVisitor visitor) {
        this.visitor = visitor;

    }

    public void traverse(File file) {
        if (file.isDirectory()) {
            visitor.enter(file);
            for (File fchild : file.listFiles()) {
                if (fchild.isDirectory()) {
                    traverse(fchild);
                } else {
                    visitor.visitFile(fchild);
                }
            }
            visitor.exit(file);
        }
    }


}
