package java_proBtoA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuessingGameGUI extends JFrame implements ActionListener {

    private Random random;
    private int numberToGuess;
    private int numberOfTries;
    private JTextField guessField;
    private JLabel messageLabel;

    public NumberGuessingGameGUI() {
        random = new Random();
        numberToGuess = random.nextInt(100) + 1;
        numberOfTries = 0;

        setTitle("Number Guessing Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel instructionLabel = new JLabel("Guess a number between 1 and 100:");
        add(instructionLabel);

        guessField = new JTextField(10);
        add(guessField);

        JButton guessButton = new JButton("Submit Guess");
        guessButton.addActionListener(this);
        add(guessButton);

        messageLabel = new JLabel(" ");
        add(messageLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String guessText = guessField.getText();
        try {
            int guess = Integer.parseInt(guessText);
            numberOfTries++;

            if (guess == numberToGuess) {
                messageLabel.setText("Correct! Tries: " + numberOfTries);
                int playAgain = JOptionPane.showConfirmDialog(this, "Correct! Play again?", "Winner", JOptionPane.YES_NO_OPTION);
                if (playAgain == JOptionPane.YES_OPTION) {
                    numberToGuess = random.nextInt(100) + 1;
                    numberOfTries = 0;
                    messageLabel.setText(" ");
                    guessField.setText("");
                } else {
                    System.exit(0);
                }
            } else if (guess < numberToGuess) {
                messageLabel.setText("Too Low!");
            } else {
                messageLabel.setText("Too High!");
            }
            guessField.setText("");
        } catch (NumberFormatException ex) {
            messageLabel.setText("Enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new NumberGuessingGameGUI();
    }
}

