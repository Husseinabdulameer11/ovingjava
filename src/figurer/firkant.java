package figurer;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class firkant extends Rektangel{
    public firkant(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }
    public void tegnfigur(Canvas cv, GraphicsContext gc){
        gc =cv.getGraphicsContext2D();
        gc.setFill(super.color);
        gc.fillRect(super.x,super.y,super.width,super.height);
    }
}
