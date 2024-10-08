import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TicTacToe {
    int width=600;
    int height=650;
    JFrame frame=new JFrame("Tic-Tac-Toe");
    JLabel textLabel=new JLabel();
    JPanel textPanel=new JPanel();
    JPanel panel=new JPanel();
    JButton[][] board=new JButton[3][3];
    String playerX="X";
    String playerO="O";
    String current=playerX;
    TicTacToe(){
        frame.setVisible(true);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textLabel.setBackground(Color.darkGray);
        textLabel.setForeground(Color.white);
        textLabel.setFont(new Font("Arial",Font.BOLD,50));
        textLabel.setHorizontalAlignment(JLabel.CENTER);
        textLabel.setText("Tic-Tac-Toe");
        textLabel.setOpaque(true);

        textPanel.setLayout(new BorderLayout());
        textPanel.add(textLabel);
        frame.add(textPanel,BorderLayout.NORTH);

        panel.setLayout(new GridLayout(3,3));
        panel.setBackground(Color.darkGray);
        frame.add(panel);

        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                JButton tile=new JButton();
                board[r][c]=tile;
                panel.add(tile);

                tile.setBackground(Color.darkGray);
                tile.setForeground(Color.white);
                tile.setFont(new Font("Arial",Font.BOLD,120));
                tile.setFocusable(false);
                tile.setText(current);
            }
        }
    }
}
