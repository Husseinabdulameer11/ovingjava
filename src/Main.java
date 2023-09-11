/*import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Main extends Application{
    public void start(Stage primarystage){
        Group gp = new Group();
        Scene scene = new Scene(gp,300,300);
        primarystage.setTitle("vindu");
        primarystage.setScene(scene);
        primarystage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
*/

import figurer.Ball;
import figurer.Rektangel;
import javafx.scene.paint.Color;


public class Main {
    public static void main(String[] args){

        int x = 30;
        int y = 30;
        int radius = 50;
        Color color = Color.RED;
        Ball b = new Ball(x,y,radius,color);
        System.out.println("------Ball-------");
        System.out.println(b.toString());
        b.setX(20);
        b.setY(50);
        b.setRadius(25);
        System.out.println("----Ball oppdatert-----");
        System.out.println(b.toString());
        System.out.println("-------------");
        System.out.println("------baller-------");
      int maxballer = 20;
  Ball[] baller = new Ball[maxballer];
  for(int i = 0; i<maxballer-1;i++){
    int ballx = (int) (Math.random()*300);
    int bally = (int) (Math.random()*300);
    int ballradius = (int) (Math.random()*300);
    baller[i] = new Ball(ballx,bally,ballradius,color);
    System.out.println(baller[i].toString());
  }
System.out.println("-------------");
  System.out.println("------- rektangel ------");
  int rx = 30;
  int ry = 30;
  int rw = 60;
  int rh = 90;
  Color rc = Color.BLUE;
Rektangel r = new Rektangel(rx,ry,rw,rh,rc);
System.out.println(r.toString());
r.setY(60);
r.setX(60);
r.setWidth(90);
r.setHeight(120);
System.out.println("----rektangel oppdatert------");
System.out.println(r.toString());
System.out.println("----------");
        System.out.println("-----rektangler-----");
int maxrektangler = 30;
Rektangel[] rektangler = new Rektangel[maxrektangler];
for(int j = 0; j<maxrektangler-1;j++){
    int rektangelx = (int) (Math.random()*300);
    int rektangely = (int) (Math.random()*300);
    int rektangelw = (int) (Math.random()*100);
    int rektangelh = (int) (Math.random()*100);
    rektangler[j] = new Rektangel(rektangelx,rektangely,rektangelw,rektangelh,rc);
    System.out.println(rektangler[j].toString());
}
System.out.println("----------");

    }
}