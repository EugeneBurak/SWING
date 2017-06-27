import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 * Created by java_dev on 01.06.17.
 */
public class Button2 extends JFrame {
    private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2");
    private JTextField txt = new JTextField(10);
    class ButtonListener implements ActionListener  {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton)e.getSource()).getText();
            txt.setText(name);
        }

        public void addActionListener(ButtonListener b1) {
        }
    }
    private ButtonListener bl = new ButtonListener();
    
    public Button2()    {
        b1.addActionListener(bl);
        b2.addActionListener(bl);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);

    }

    public static void main(String[] args) {
        SwingConsole.run(new Button2(), 200, 150);
    }

}
