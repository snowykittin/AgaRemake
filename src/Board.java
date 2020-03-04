import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    Game game;
    public Board(Game game){
        this.game = game;
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(1500, 750));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
