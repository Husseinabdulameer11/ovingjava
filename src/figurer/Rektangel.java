package figurer;

import javafx.scene.paint.Color;

public class Rektangel {

    int x;
    int y;
    int width;
    int height;
    Color color;
    public Rektangel(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height= height;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String toString(){
        return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight();
    }
}
