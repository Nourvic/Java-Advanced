import javax.swing.JOptionPane;
import java.util.Formatter;

public class JOPpane {

    public static void main(String[] args) {
        //Input-Fenster

        String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl");
      //  int x = Integer.parseInt(eingabe);
      //  int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl"));
        //Message-Fenster
        Formatter f = new Formatter();
      //  f.format("you wrote a number %d the Operation would look like \n %d * %d = %d ", x, x, x, x * x);

        JOptionPane.showMessageDialog(null, eingabe);
        f.close();
    }
}
