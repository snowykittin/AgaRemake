import java.awt.*;

public abstract class Sprite {
    Color color;
    int x,y,radius;
    double dx,dy;
    double speed;
    boolean remove = false;

    Board board;
    public Sprite(Color color, int x, int y, int radius, Board board){
        this.color=color;
        this.x=x;
        this.y=y;
        this.radius = radius;
        this.board = board;
        while((int)dx == 0 || (int)dy==0){
            double angle = 2*Math.PI*(Math.random()+1);
            speed = (5 * Math.random() + 2);
            dx=Math.cos(angle)*speed;
            dy=Math.sin(angle)*speed;

        }

    }

    public void move(){

        //predictive movement
        double nextLeft=x+dx;
        double nextRight=(x+radius)+dx;
        double nextTop=y+dy;
        double nextBottom=(y+radius)+dy;

        if(nextTop<0||nextBottom>(double)board.getHeight()){
            dy*=-1;

        }
        if(nextLeft<0||nextRight>(double)board.getWidth()){
            dx*=-1;

        }
        x+=dx;
        y+=dy;
    }
    public void consume(){
        setRadius(getRadius()+2);
        setSpeed(getSpeed() * 0.9);
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,radius, radius);
    }
    public boolean collidesWith(Sprite other){
        return getBounds().intersects(other.getBounds());
    }
    public abstract void paint(Graphics g);

    public boolean isRemove() {
        return remove;
    }
    public void setRemove(){ remove = true; }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}