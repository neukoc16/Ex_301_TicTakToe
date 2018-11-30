package GUI;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToeGUI extends JFrame {

    public TicTacToeGUI() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));
        this.setSize(500, 500);

        for (int i = 1; i <= 9; i++) {
            JLabel label = new JLabel(i + "");
            this.add(label);
            label.add
        }
    }

    public static void main(String[] args) {

    }
}
