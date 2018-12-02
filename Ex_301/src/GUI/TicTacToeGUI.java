package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeGUI extends JFrame {

    private int clicked = 0;

    public TicTacToeGUI() throws HeadlessException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 3));
        this.setSize(500, 500);

        for (int in = 1; in <= 9; in++) {
            int all = in;
            JButton button = new JButton();
            button.setBackground(Color.BLACK);
            button.setSize(10, 10);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int x = all % 3;
                    int y = all / 3;
                    int[][] array = new int[3][3];
                    
                    
                    
                    clicked++;

                    if (clicked % 2 == 0) {
                        button.setBackground(Color.RED);
                    } else {
                        button.setBackground(Color.BLUE);
                    }

//                    if () {
//                        button.setEnabled(false);
//                        JOptionPane.showMessageDialog(null, "The Game is now over!");
//                        System.exit(0);
//                    }
                }
            });
            this.add(button);
        }
    }

    public static void main(String[] args) {
        new TicTacToeGUI().setVisible(true);
    }
}
