// 10. Develop applications involving Applet: Applet Fundamentals, using paint 
// method and drawing polygons. It is expected that each laboratory assignments 
// to given to the students with an aim to In order to achieve the above 
// objectives. 

import java.awt.*;
import javax.swing.*;

public class poly extends JFrame {

    public poly() {
        setTitle("Polygon Drawing Example");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add custom drawing panel
        add(new PolygonPanel());

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        new poly();
    }
}

// Custom JPanel for drawing the polygon
class PolygonPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int[] x = {10, 30, 40, 50, 110, 140};
        int[] y = {140, 110, 50, 40, 30, 10};
        int numberofpoints = x.length;

        Polygon p = new Polygon(x, y, numberofpoints);
        g.setColor(Color.BLUE);
        g.drawPolygon(p);
    }
}
