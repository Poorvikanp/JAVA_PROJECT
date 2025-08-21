package java_proBtoA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceRollingSimulatorGUI extends JFrame implements ActionListener {
    JLabel diceLabel;
    JButton rollButton;
    Random random;

    public DiceRollingSimulatorGUI() {
        setTitle("Dice Rolling Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        diceLabel = new JLabel("Click Roll to start!");
        diceLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(diceLabel);

        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(this);
        add(rollButton);

        random = new Random();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int dice = random.nextInt(6) + 1;
        diceLabel.setText("Rolled: " + dice);
    }

    public static void main(String[] args) {
        new DiceRollingSimulatorGUI();
    }
}
