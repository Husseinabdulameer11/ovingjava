package figurer;

import javafx.scene.paint.Color;

public class Ball {
    int x;
    int y;
    int radius;
    Color color;
    public Ball(int x, int y, int radius, Color color){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;

    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return  y;
    }
    public int getRadius(){
        return  radius;
    }
    public String toString(){
        return "x: "+ getX() +" y: "+ getY() +" Radius: "+getRadius();
    }

}
