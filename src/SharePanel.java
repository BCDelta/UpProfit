import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class SharePanel extends JPanel {

    private JLabel shares;
    private JTextField shareField;

    public SharePanel() {
        
        setLayout(new GridLayout(2, 1));

        createTitledBorder();

        shares = new JLabel("Number of Shares");   
        shareField= new JTextField(10);

        add(shares);
        add(shareField);
    }

    public String getStockAmount() {

        String stock = "";

        stock= shareField.getText();

        return stock;
    }

    private void createTitledBorder() {
        
        TitledBorder centerBorder = (BorderFactory.createTitledBorder("Step 2"));
        centerBorder.setTitleJustification(TitledBorder.CENTER);
        setBorder(centerBorder);
    }
    
}
