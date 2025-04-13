import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter {

    @Override
    public boolean accept(File path) {
        if (path.isDirectory() || path.getName().toLowerCase().endsWith("pdf")) {
            return true;
        }
        return false;
    }

}