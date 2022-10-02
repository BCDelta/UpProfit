import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class TitlePanel extends JPanel {
    private JLabel greeting, slogan;
    public TitlePanel() {

        setLayout(new BorderLayout());

        greeting = new JLabel("UP PROFIT", SwingConstants.CENTER);
        slogan = new JLabel("A light-weight profit calculator", SwingConstants.CENTER);

        add(greeting, BorderLayout.NORTH);
        add(slogan, BorderLayout.SOUTH);
    }
}
