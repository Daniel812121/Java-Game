package first_game;

import java.awt.event.KeyListener;
import java.util.Timer;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class Gameplay extends JPanel implements KeyListener, ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 488334328779360880L;
    private boolean play = false;
    private int score = 0;

    private int totalBricks = 21;

    private Timer time; 
    private int delay = 8;

    private int playerX = 310;

    private int ballposX = 120; 
    private int ballposY = 350; 
    private int ballXdir = -1;
    private int ballYdir = -2;

    public Gameplay() {
        addKeyListener(this);
        setFocusable(true); 
        setFocusTraversalKeysEnabled(false);
        imer timer = new Timer(delay, this);
        //Timer timer = new Timer();
        //timer.start();
    }

    

    @Override
    public void actionPerformed(ActionEvent arg0) {
        timer.start();
        if(play) {
            if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballYdir = -ballYdir;
            }
 
            ballposX += ballXdir; 
            ballposY += ballYdir;
            if(ballposX < 0) {
                ballXdir = -ballXdir;
            }
            if(ballposY < 0) {
                ballYdir = -ballYdir;
            }
            if(ballposX > 67) {
                ballXdir = -ballXdir;
            }
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent arg0) {}
    
    @Override
    public void keyReleased(KeyEvent arg0) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(playerX >=600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }
    }
    public void moveRight() {
        play = true; 
        playerX+=20;
    }
    public void moveLeft() {
        play = true; 
        playerX-=20;
}
//Extra } to fix the error
}