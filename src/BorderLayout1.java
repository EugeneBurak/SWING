import javax.swing.*;
import java.awt.*;

/**
 * Created by java_dev on 02.06.17.
 */
public class BorderLayout1 extends JFrame {
    public BorderLayout1()  {
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.NORTH, new JButton("North_1"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));
    }
    public static void main (String[] args) {
        SwingConsole.run(new BorderLayout1(), 300, 250);
    }
}
