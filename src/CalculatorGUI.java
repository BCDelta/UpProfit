import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class CalculatorGUI extends JFrame {

    private StockBlock blockPanel;
    private TitlePanel title;
    private JPanel buttonPanel;
    private JButton calculate, reset;

    public CalculatorGUI() {
        setTitle("Up-Profit");

        setLayout(new BorderLayout());

        title = new TitlePanel();
        blockPanel = new StockBlock();
        buildButtonPanel();
        
        add(title, BorderLayout.NORTH, SwingConstants.CENTER);
        add(blockPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pack();
        setVisible(true);
    }

    private void buildButtonPanel() {

        buttonPanel = new JPanel();

        TitledBorder centerBorder = (BorderFactory.createTitledBorder("Step 5"));
        centerBorder.setTitleJustification(TitledBorder.CENTER);
        buttonPanel.setBorder(centerBorder);

        calculate = new JButton("Calculate");
        calculate.addActionListener(new CalcButtonListener());
        reset = new JButton("Reset");
        reset.addActionListener(new ExitButtonListener());

        buttonPanel.add(calculate);
        buttonPanel.add(reset);
    }

    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println(blockPanel.getCompanyInfo());
            System.out.println(blockPanel.getAmount());
            System.out.println(blockPanel.getPurchasePrice());
            System.out.println(blockPanel.getSalePrice());
            
        }
    }
    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Exiting Program...");
        }
    }
}

