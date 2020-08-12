import java.awt.*;

import javax.swing.JComponent;

public class Player extends JComponent{

    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(50, 50, 50, 50);
    }

}