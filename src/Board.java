import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {
    Game game;
    ArrayList<Sprite> actors;
    public Board(Game game){
        this.game = game;
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(1500, 750));
        actors = new ArrayList<>();
        actors.add(new Player(Color.GREEN,1500/2,750/2,50,this));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Sprite thisGuy: actors){
            thisGuy.paint(g);
        }
    }
}
