 package snakegame;

import javax.swing.*;


/**
 *
 * @author hp
 */
public class SnakeGame extends JFrame {
    
    //constructor
    SnakeGame() {
        
        super("Snake Game");
        
        // Display start message
        JOptionPane.showMessageDialog(this, "Welcome to Snake Game!\nPress OK to start.");
        
        add (new Board());
        pack(); //show the changes that are made in the board
        
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
            
            
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
    
}


