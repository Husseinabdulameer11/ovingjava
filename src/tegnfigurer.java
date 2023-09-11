import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import figurer.sirkel;
import figurer.firkant;


public class tegnfigurer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group gp = new Group();
        Scene scene = new Scene(gp,600,600);
        Canvas cv = new Canvas(300,300);
        GraphicsContext gc = cv.getGraphicsContext2D();
        gp.getChildren().add(cv);
        sirkel sc = new sirkel(30,30,60, Color.RED);
        firkant fc = new firkant(200,200,90,120,Color.BLUE);
        fc.tegnfigur(cv,gc);
        sc.tegnfigur(cv,gc);
        primaryStage.setScene(scene);
        primaryStage.setTitle("figur visning");
        primaryStage.show();
    }
}
