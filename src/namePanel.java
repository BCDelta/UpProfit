import java.awt.*;
import javax.swing.event.*;
import javax.naming.directory.SearchResult;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class namePanel extends JPanel {
    private JTextField stockField;
    private JLabel stockName;

    public namePanel() {

        setLayout(new GridLayout(2, 1));

        createTitledBorder();

        stockName = new JLabel("Stock name");   
        stockField = new JTextField(10);

        add(stockName);
        add(stockField);
    }

    public String getName() {

        String company = "";
        company = stockField.getText();

        return company;
    }
        
    private void createTitledBorder() {
        
        TitledBorder centerBorder = (BorderFactory.createTitledBorder("Step 1"));
        centerBorder.setTitleJustification(TitledBorder.CENTER);
        setBorder(centerBorder);
    }
}