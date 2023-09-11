package figurer;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class sirkel extends Ball{
    public sirkel(int x, int y, int radius, Color color) {
        super(x, y, radius, color);
    }

    public void tegnfigur(Canvas cv, GraphicsContext gc){
        gc=cv.getGraphicsContext2D();
        gc.setFill(super.color);
        gc.fillOval(super.x,super.y,super.radius,super.radius);

    }
}

