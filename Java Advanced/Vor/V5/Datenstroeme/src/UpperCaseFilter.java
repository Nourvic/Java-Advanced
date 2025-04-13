import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class UpperCaseFilter extends FilterWriter {

    public UpperCaseFilter(Writer w) {
        super(w);
    }

    public void write(int c) throws IOException {
        super.write(Character.toUpperCase((char) c));
    }

    public void write(char[] buff, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            write(buff[off + i]);
        }
    }

    public void write(String str, int off, int len) throws IOException {
        write(str.toCharArray());
    }


}
