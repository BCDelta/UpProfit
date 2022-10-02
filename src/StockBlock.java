import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;


public class StockBlock extends JPanel {
    
// -----------------------------------------------------------------------------------------------------//
    private namePanel companyPanel;
    private SharePanel sharesPanel;
    private SellPanel sellPanel;
    private PurchasePanel purchasePanel;
// -----------------------------------------------------------------------------------------------------//

    /**
     * Constructor for class
     */
    public StockBlock() {

        setLayout(new GridLayout(1,4));

        companyPanel = new namePanel();
        sharesPanel = new SharePanel();
        purchasePanel = new PurchasePanel();
        sellPanel = new SellPanel();

        add(companyPanel);
        add(sharesPanel);
        add(purchasePanel);
        add(sellPanel);
        
    }

    public double getPurchasePrice() {

        double purchasePrice = Double.parseDouble(purchasePanel.getAmount());

        return purchasePrice;
    }

    public double getSalePrice() {

        double salePrice = Double.parseDouble(sellPanel.getAmount());

        return salePrice;
    }

    public double getAmount() {

        double stock = Double.parseDouble(sharesPanel.getStockAmount());

        return stock;
    }

    public String getCompanyInfo() {

        String company = companyPanel.getName();
        
        return company;
    }
}
