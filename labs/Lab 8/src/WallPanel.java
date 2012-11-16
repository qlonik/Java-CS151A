
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author qlonik
 */
public class WallPanel extends JPanel {
    private JFrame parent;
    private final int UNIT = 15;
    
    public WallPanel(JFrame parent) {
        this.parent = parent;
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.DARK_GRAY);
    }
    
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
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
