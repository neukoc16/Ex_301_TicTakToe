package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToeGUI extends JFrame {
    
    public TicTacToeGUI() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));
        this.setSize(500, 500);
        
        for (int i = 1; i <= 9; i++) {
            JLabel label = new JLabel();
            label.setForeground(Color.RED);
            label.setSize(10, 10);
            this.add(label);
        }
    }
    
    public static void main(String[] args) {
        new TicTacToeGUI().setVisible(true);
    }
}
