import javax.swing.*;
import java.awt.*;

/**
 * Created by java_dev on 02.06.17.
 */
public class GridLayout1 extends JFrame {
    public GridLayout1()  {
        setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 20; i++)    {
            add(new JButton("Button " + i));
        }
    }

    public static void main(String[] args) {
        SwingConsole.run(new GridLayout1(), 400, 500);
    }
}
