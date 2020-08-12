import java.awt.Color;

import javax.swing.JFrame;

public class Gui {
    
    public Gui(){
    
        JFrame frame = new JFrame("The game GUI !");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.gray);
        frame.setSize(500,500);
        frame.setLocation(700, 300);
        frame.getContentPane().add(new Player());
        frame.setVisible(true);
    }
}