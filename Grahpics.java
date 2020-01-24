package first_game;

import java.io.Serializable;
import javax.swing.JPanel;

public class Grahpics extends JPanel implements Serializable{
    private static final long serialVersionUID = 1L;

    public void paint(Grahpics g) {
        // background
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

        // borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        // the paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);

        // the ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20, 20);

     g.dispose(); 
}

//Extra } to fix the error
}
