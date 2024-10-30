import processing.core.PApplet;
import processing.event.KeyEvent;

public class Sketch extends PApplet {

    /** Represents all balls, bubbles, and snowflakes */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;
    private Snowflake snowflake1;
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;

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
        System.out.println(DXF);
        ball2 = new Ball(this, 50, 250, 100, 3, -2);
        ball3 = new Ball(this, 35, 200, 200, 5, 1);
        ball4 = new Ball(this, 25, 100, 100, 10, 1);
        bubble1 = new Bubble(this);
        bubble2 = new Bubble(this, 25, 150, 100, 1, -2);
        bubble3 = new Bubble(this, 30, 250, 20, 2, -5);
        bubble4 = new Bubble(this, 15, 200, 50, -1, -3);
        snowflake1 = new Snowflake(this);
        snowflake2 = new Snowflake(this, 25, 150, 100, 1, 2);
        snowflake3 = new Snowflake(this, 30, 250, 20, 2, 1);
        snowflake4 = new Snowflake(this, 15, 200, 50, -1, 3);
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(20, 100, 255);
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
        ball3.setColors(color(200, 100, 155), color(0, 0, 0));
        ball4.setColors(color(255, 255, 100), color(0, 0, 0));
        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();
        snowflake1.draw();
        snowflake1.move();
        snowflake2.draw();
        snowflake2.move();
        snowflake3.draw();
        snowflake3.move();
        snowflake4.draw();
        snowflake4.move();

    }

    public void keyPressed() {
        if (key == ' ') {
            ball1.stop();
            ball2.stop();
            ball3.stop();
            ball4.stop();
            bubble1.stop();
            bubble2.stop();
            bubble3.stop();
            bubble4.stop();
            snowflake1.stop();
            snowflake2.stop();
            snowflake3.stop();
            snowflake4.stop();

        }
//*I used the follwoing website as inspiration: https://stackoverflow.com/questions/22470515/how-stop-and-start-some-actions-in-java-how-to-pause-and-continue-movement, I also had help from Mr.Griswold */
        if (key == 'g') {
            ball1.go(2,-1);
            ball2.go(3, -2);
            ball3.go(5,1);
            ball4.go(10, 1);
            bubble1.go(0, -4);
            bubble2.go(1, -2);
            bubble3.go(2, -5);
            bubble4.go(-1, -3);
            snowflake1.go(0, 4);
            snowflake2.go(1, 2);
            snowflake3.go(2, 1);
            snowflake4.go(-1, 3);
    

        }

    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
