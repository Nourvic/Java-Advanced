import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class myapp extends Application {

    public void start(Stage stage) {
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(15));

        Label l1 = new Label("Label 1");
        Label l2 = new Label("Label 2");
        TextField tf1 = new TextField("Textfield 1");
        TextField tf2 = new TextField("Textfield 2");
        TextField tf3 = new TextField("Textfield 3");
        Button b1 = new Button("Strat");
        GridPane.setValignment(tf3, VPos.TOP);
        GridPane.setHalignment(b1, HPos.CENTER);
   //     GridPane.setValignment(b1, VPos.BOTTOM);
        GridPane.setHgrow(tf3, Priority.ALWAYS);

        ListView<String> lv = new ListView<>();

        for (int i = 0; i <= 100; i++) {
            lv.getItems().add("This is Item :  " + i);
        }
        gp.add(l1, 1, 0);
        gp.add(l2, 1, 1);
        gp.add(tf1, 2, 0);
        gp.add(tf2, 2, 1);
        gp.add(tf3, 2, 2);
        gp.add(b1, 2, 3);
        gp.add(lv, 0, 0, 1, 3);


        Scene scene = new Scene(gp, 400, 400);
        stage.setTitle("GridPane Layout");
        stage.setScene(scene);
        stage.show();


        //HBox hb = new HBox();
        //VBox vb = new VBox();
        //FlowPane fp = new FlowPane();
        //   BorderPane bd = new BorderPane();

        //hb.setPadding(new Insets(20, 20, 20, 20));
        //vb.setPadding(new Insets(20, 50, 20, 50));
        //fp.setPadding(new Insets(20, 20, 20, 20));


        // hb.setSpacing(5.0);
        // vb.setSpacing(20.0);


        // Button btn1 = new Button("Top");
        //Button btn2 = new Button("Bottom");
        //Button btn3 = new Button("Center");
        //Button btn4 = new Button("Left");
        //Button btn5 = new Button("Right");
        //Button[] buttons = {btn1, btn2, btn3, btn4, btn5};
//        for (Button bs : buttons) {
//            bs.setMaxSize(4000, 4000);
//        }
//        bd.setTop(btn1);
//        bd.setBottom(btn2);
//        bd.setCenter(btn3);
//        bd.setLeft(btn4);
//        bd.setRight(btn5);

        ///hb.getChildren().addAll(btn1, btn2, btn3, btn4);
        //vb.getChildren().addAll(btn1, btn2, btn3, btn4);
        // fp.getChildren().addAll(btn1, btn2, btn3, btn4);

        //Scene scene = new Scene(hb);   HBOX
        //Scene scene2 = new Scene(vb);  VBOX
        //Scene scene3 = new Scene(fp);  FlowPane
        //  Scene scene4 = new Scene(bd);  // Borderpane
        //Scene scene = new Scene(bd);  // Borderpane


        //stage.setScene(scene);
        //stage.setScene(scene2);
        //stage.setScene(scene3);
        //stage.setScene(scene4);
//        stage.setTitle("Border Pane Layout");
//        stage.show();
    }


    public static void main(String[] args) {

        launch();
    }
}
