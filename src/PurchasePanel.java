import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PurchasePanel extends JPanel implements ProfitInterface {
    private JLabel purchaseLabel;
    private JTextField purchasePrice;

    public PurchasePanel() {

        setLayout(new GridLayout(2, 1));

        createTitledBorder();

        purchaseLabel = new JLabel("Purchase Price");   
        purchasePrice = new JTextField(10);

        add(purchaseLabel);
        add(purchasePrice);
    }

    public String getAmount(){

        String purchase = "";

        purchase = purchasePrice.getText();
        
        if(purchase.charAt(0) == '$') {
            purchase = purchase.replace("$", "");
        }

        return purchase;
    }

    private void createTitledBorder() {
        
        TitledBorder centerBorder = (BorderFactory.createTitledBorder("Step 3"));
        centerBorder.setTitleJustification(TitledBorder.CENTER);
        setBorder(centerBorder);
    }
}

