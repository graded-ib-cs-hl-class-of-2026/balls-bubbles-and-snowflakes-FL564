
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

    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 300;
        y = 0;
        xSpeed = 0;
        ySpeed = -4;
        fillColor = s.color(255, 100, 0, 0);
        borderColor = s.color(0, 0, 0, 0);
    }

        public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
            this.s = sketch;
            this.radius = radius;
            this.x = x;
            this.y = y;
            this.xSpeed = xspeed;
            this.ySpeed = yspeed;
    }
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
        s.fill(fillColor,0);
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
 