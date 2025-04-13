import java.io.File;

public class Util {


    public File[] allJavaFilesmitClass(File directory) {
        if (directory == null || !directory.exists() || !directory.isDirectory()) {
            return null;
        }
        return directory.listFiles(new JavaFilter());
    }

    public File[] allJavaFilesmitLamda(File directory) {
        if (directory == null || !directory.exists() || !directory.isDirectory()) {
            return null;
        }
        return directory.listFiles((e) -> e.isFile() && e.getName().toLowerCase().endsWith(".java"));
    }

}
