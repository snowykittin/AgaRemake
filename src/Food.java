import java.awt.*;

public class Food extends Sprite{
    public Food(Color color, int x, int y, int radius, Board board) {
        super(color, x, y, radius, board);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getRadius(), getRadius());
    }
}
