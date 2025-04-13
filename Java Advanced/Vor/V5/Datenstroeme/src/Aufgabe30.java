import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class Aufgabe30 extends FilterWriter {


    public Aufgabe30(Writer w) {
        super(w);

    }


    @Override
    public void write(int c) throws IOException {
        super.write(Character.toLowerCase((char) c));
    }

    @Override
    public void write(char[] feld, int off, int len) throws IOException {
        for (int i = 0; i < len; i++) {
            write(feld[i + off]);
        }

    }

    @Override
    public void write(String str, int off, int len) throws IOException {
        write(str.toCharArray());
    }
}