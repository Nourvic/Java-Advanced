import java.io.File;
import java.io.FileFilter;

public class JavaFilter implements FileFilter {

    @Override
    public boolean accept(File pf) {
        if (pf.isFile() && pf.getName().toLowerCase().endsWith(".java")) {
            return true;
        }
        return false;
    }

}
