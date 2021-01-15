package Game;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snakezzzz");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
