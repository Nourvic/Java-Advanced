import java.io.File;
import java.io.FileFilter;

public class Filterjava implements FileFilter {
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()|| f.getName().toUpperCase().endsWith(".pdf")) {
            return true;
        }
        return false;
    }
}
