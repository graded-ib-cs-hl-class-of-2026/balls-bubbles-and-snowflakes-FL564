import processing.core.PApplet;

public class Sketch extends PApplet {

    /** Represents one ball */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        ball1 = new Ball(this);
        ball2 = new Ball(this, 50, 250, 100, 3, -2);
        ball3 = new Ball(this, 35, 200, 200, 5, 1);
        ball4 = new Ball(this, 25, 100, 100, 10, 1);
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(200, 20, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();
        ball1.setColors(color(255, 100, 100), color(0, 0, 0));
        ball2.setColors(color(100, 255, 100), color(0, 0, 0));
        ball3.setColors(color(100, 100, 255), color(0, 0, 0));
        ball4.setColors(color(255, 255, 100), color(0, 0, 0));
           
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
