/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class DialogNextLine extends JDialog{
    private JTextField NameofItemBar;
    private JTextField CountOfItemBar;
    private JTextField PriceOfItemBar;
    private JLabel NameOfItemLabel;
    private JLabel CountOfItemLabel;
    private JLabel PriceOfItemLabel;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public DialogNextLine(MainFrame frame) {
       
        PriceOfItemBar = new JTextField(20);
        PriceOfItemLabel = new JLabel("Item Price");
        CountOfItemBar = new JTextField(20);
        CountOfItemLabel = new JLabel("Item Count");
        NameofItemBar = new JTextField(20);
        NameOfItemLabel = new JLabel("Item Name");
        okBtn.setActionCommand("newLineOK");
        cancelBtn.setActionCommand("newLineCancel");
         okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        okBtn.addActionListener(frame.getActionListener());
        cancelBtn.addActionListener(frame.getActionListener());
        setLayout(new GridLayout(4, 2));
        
        add(NameOfItemLabel);
        add(NameofItemBar);
        add(CountOfItemLabel);
        add(CountOfItemBar);
        add(PriceOfItemLabel);
        add(PriceOfItemBar);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getNameofItemBar() {
        return NameofItemBar;
    }

    public JTextField getCountOfItemBar() {
        return CountOfItemBar;
    }

    public JTextField getPriceOfItemBar() {
        return PriceOfItemBar;
    }
}
