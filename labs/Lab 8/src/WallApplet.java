import java.awt.*;
import javax.swing.JApplet;

/**
 *
 * @author qlonik
 */
public class WallApplet extends JApplet {
    
    final int UNIT = 15;
    
    public void paint(Graphics page) {
        page.setColor(Color.DARK_GRAY);
        page.fillRect(0, 0, getWidth(), getHeight());
        page.setColor(Color.RED);
        
        int startX, startY = 0;
        while (startY < getHeight()) {
            if ((startY / (UNIT + UNIT / 3)) % 2 == 0) {
                startX = 0;
            } else {
                startX = - 3 * UNIT / 2;
            }
            while (startX < getWidth()) {
                page.fillRect(startX, startY, 3 * UNIT, UNIT);
                startX += 3 * UNIT + UNIT / 3;
            }
            startY += UNIT + UNIT / 3;
        }
    }
}
