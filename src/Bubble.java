
class Bubble {

    //MISSING MANY INSTANCE VARIABLES

    //MISSING CONSTRUCTORS
    private float radius;
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int fillColor;
    private int borderColor;
    private Sketch s;

    // accessors for the radius, diameter, x, and y values 
    public float getRadius() {
    
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
 