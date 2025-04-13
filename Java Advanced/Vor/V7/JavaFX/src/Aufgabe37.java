import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Aufgabe37 extends Application {

    public void start(Stage stage) {
        GridPane gp = new GridPane();
        Label l1 = new Label(" label 1");
        Label l2 = new Label("Label 2");
        TextField tf1 = new TextField("Textfield 1");
        TextField tf2 = new TextField("Textfield 2");
        TextField tf3 = new TextField("Textfield 3");
        Button b1 = new Button("Strat");
        ListView<String> lv = new ListView<>();

        for (int i = 0; i < 100; i++) {
            lv.getItems().add("This is Itemo " + i);
        }
        gp.add(l1, 1, 0);
        gp.add(l2, 1, 1);
        gp.add(tf1, 2, 0);
        gp.add(tf2, 2, 1);
        gp.add(tf3, 2, 2);
        gp.add(b1, 2, 3);


        Scene scene = new Scene(gp, 400, 400);
        stage.setTitle("GridPane Layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
