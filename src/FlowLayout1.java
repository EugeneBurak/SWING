import javax.swing.*;
import java.awt.*;

/**
 * Created by java_dev on 02.06.17.
 */
public class FlowLayout1 extends JFrame {

    public FlowLayout1()    {
        setLayout(new FlowLayout());
        for (int i = 0; i < 20; i++)    {
            add(new JButton("Button " + i));
        }
    }

    public static void main(String[] args) {
        SwingConsole.run(new FlowLayout1(), 300, 500);
    }
}
