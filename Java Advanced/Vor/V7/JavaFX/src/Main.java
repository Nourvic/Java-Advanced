import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage stage) {
        BorderPane bp = new BorderPane();
        bp.setPadding(new Insets(10));
        Pane p = new Pane();
        Rectangle rect = new Rectangle(100, 50, 100, 100);
        rect.setFill(Color.GREEN);
        p.getChildren().add(rect);
        Button b1 = new Button("Change Color");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int r = (int) Math.random() * 255;
                int b = (int) Math.random() * 255;
                int c = (int) Math.random() * 255;
                rect.setFill(Color.color(r, b, c));
            }
        });
        bp.setCenter(p);
        bp.setBottom(b1) ;
        stage.setScene(new Scene(bp, 400, 400));
        stage.setTitle("Farbtest");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
