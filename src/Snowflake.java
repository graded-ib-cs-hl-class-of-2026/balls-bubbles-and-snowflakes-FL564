class Snowflake {
    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int fillColor;
    private int borderColor;  
   
   
    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        this.fillColor = s.color(255, 255, 255);
        this.borderColor = s.color(255, 255, 255);

    }

    public Snowflake(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 300;
        y = 0;
        xSpeed = 0;
        ySpeed = 4;
        this.borderColor = s.color(255, 255, 255);
    }

    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.line(x+radius,y,x-radius,y);
        s.line(x,y+radius,x,y-radius);
        s.line(x+radius*.707f,y+radius*.707f,x-radius*.707f,y-radius*.707f);
        s.line(x+radius*.707f,y-radius*.707f,x-radius*.707f,y+radius*.707f);
    
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

    public int getFillColor() {
        return fillColor;
    }
    public int getBorderColor() {
        return borderColor;
    }
    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
       

}

}

