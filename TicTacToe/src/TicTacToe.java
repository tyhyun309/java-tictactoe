import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;

public class TicTacToe {
  int boardWidth = 600;
  int boardHeight = 650;

  JFrame frame = new JFrame("Tic-Tac-Toe");
  JLabel textLabel = new JLabel();
  JPanel textPanel = new JPanel();

  TicTacToe(){
    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    textLabel.setBackground(Color.darkGray);
    textLabel.setForeground(Color.white);
    textLabel.setFont(new Font("Arial", Font.BOLD, 50));
    textLabel.setHorizontalAlignment(JLabel.CENTER);
    textLabel.setText("Tic-Tac-Toe");
    textLabel.setOpaque(true);

    textPanel.setLayout(new BorderLayout());
    textPanel.add(textLabel);
    frame.add(textPanel, BorderLayout.NORTH);
  }
}
