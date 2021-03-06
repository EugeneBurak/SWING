import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by java_dev on 02.06.17.
 */
public class TextArea extends JFrame {
    private JButton b = new JButton("Add Data"), c = new JButton("Clear Data");
    private JTextArea t = new JTextArea(20, 40);
    private Map<String, String> m = new HashMap<String, String>();

    public TextArea()   {
        m.put("Ukr", "Kiev");
        m.put("Ras", "Moscow");
        m.put("Bel", "Minsc");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(Map.Entry me : m.entrySet())
                    t.append(me.getKey() + ": " + me.getValue() + "\n");
            }
        });
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("");
            }
        });
        setLayout(new FlowLayout());
        add(new JScrollPane(t));
        add(b);
        add(c);
    }

    public static void main(String[] args) {
        SwingConsole.run(new TextArea(), 475, 425);
    }
}
