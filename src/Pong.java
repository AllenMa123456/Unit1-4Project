/**
 * Pong - A simple Pong game.
 * Author: Tafsi Bhuiyan
 */
import java.awt.Color;
import javax.swing.JFrame;
public class Pong extends JFrame {
    private final static int WIDTH = 700, HEIGHT = 450;
    private PongPanel panel;
    public Pong() {
        setSize(WIDTH, HEIGHT);
        setTitle("Pong");
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PongPanel(this);
        panel.setFocusable(true);
        panel.requestFocusInWindow();
        add(panel);
        setVisible(true);
    }
    public PongPanel getPanel() {
        return panel;
    }
}