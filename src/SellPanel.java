import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class SellPanel extends JPanel implements ProfitInterface {
    private JLabel sellLabel;
    private JTextField sellPrice;

    public SellPanel() {

        setLayout(new GridLayout(2, 1));

        createTitledBorder();

        sellLabel = new JLabel("Sell Price");   
        sellPrice = new JTextField(10);

        add(sellLabel);
        add(sellPrice);
    }

    public String getAmount() {

        String sale = "";

        sale = sellPrice.getText();
        
        if(sale.charAt(0) == '$') {
            sale = sale.replace("$", "");
        }

        return sale;
    }

    private void createTitledBorder() {

        TitledBorder centerBorder = (BorderFactory.createTitledBorder("Step 4"));
        centerBorder.setTitleJustification(TitledBorder.CENTER);
        setBorder(centerBorder);
    }

}
