import java.awt.Color;

import processing.core.*;
import processing.event.*;

/**
 * Provides the scaffolding to launch a Processing application
 */
public class DoodleApp extends PApplet {
    World w;
    
    public void settings() {
        this.size(400, 400);
    }
    
    public void setup() {
        DoodleJumper dj = new DoodleJumper(new Posn(100, 100), false, false, 0.1, 0, 0, new Color (125, 125, 0));
        Platform p = new Platform(new Posn(100, 200), 100, 20, new Color(0, 255, 0));
        w = new World(dj, p);
    }
    
    public void keyPressed(KeyEvent kev) {
        w = w.keyPressed(kev);
    }
    
    public void keyReleased(KeyEvent kev) {
    	w = w.keyReleased(kev);
    }
    
    public void draw() {
        w = w.update();
        w.draw(this);
    }
    
    public void mousePressed(MouseEvent mev) {
//        w = w.mousePressed(mev);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] { "DoodleApp" }, new DoodleApp());
    }
}
