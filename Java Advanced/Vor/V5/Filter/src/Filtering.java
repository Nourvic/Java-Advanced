import java.io.File;
import java.io.FileFilter;

public class Filtering implements FileFilter {
    // Aufgabe 24
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".pdf")) {
            return true;
        }
        return false;
    }
}
