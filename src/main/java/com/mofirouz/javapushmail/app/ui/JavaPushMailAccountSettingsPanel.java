package com.mofirouz.javapushmail.app.ui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 * @since 23/10/2011
 * @author Mo Firouz
 */
public class JavaPushMailAccountSettingsPanel extends javax.swing.JPanel {

    public final static String PASSWORD_FIELD = "*****";

    /** Creates new form JavaPushMailAccountSettingsPanel */
    public JavaPushMailAccountSettingsPanel() {
        initComponents();
        this.setName("Account Settings");
        workingLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource("workingAnimation.gif")).getScaledInstance(128, 128, Image.SCALE_DEFAULT)));
        workingLabel.setVisible(false);
        configTableUI();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        workingLabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        hideButton = new javax.swing.JButton();
        newAccountButton = new javax.swing.JButton();

        setOpaque(false);

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "Port", "SSL?", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        accountTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        accountTable.setColumnSelectionAllowed(true);
        accountTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(accountTable);
        accountTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jScrollPane1.setBounds(20, 10, 570, 290);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        workingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workingLabel.setBounds(20, 10, 570, 290);
        jLayeredPane1.add(workingLabel, javax.swing.JLayeredPane.MODAL_LAYER);

        quitButton.setText("Quit");
        quitButton.setBounds(520, 310, 70, 23);
        jLayeredPane1.add(quitButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        hideButton.setText("Hide");
        hideButton.setBounds(440, 310, 70, 23);
        jLayeredPane1.add(hideButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        newAccountButton.setText("New Account");
        newAccountButton.setBounds(20, 310, 110, 23);
        jLayeredPane1.add(newAccountButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JButton hideButton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newAccountButton;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel workingLabel;
    // End of variables declaration//GEN-END:variables

    public JButton getHideButton() {
        return hideButton;
    }

    public JButton getNewAccountButton() {
        return newAccountButton;
    }

    public JLabel getWorkingLabel() {
        return workingLabel;
    }

    public JButton getQuitButton() {
        return quitButton;
    }

    public JTable getAccountTable() {
        return accountTable;
    }

    private void configTableUI() {

        accountTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        accountTable.setColumnSelectionAllowed(false);
        accountTable.setRowSelectionAllowed(true);

        TableColumnModel colModel = accountTable.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(175);
        colModel.getColumn(1).setPreferredWidth(175);
        colModel.getColumn(2).setPreferredWidth(50);
        colModel.getColumn(3).setPreferredWidth(50);
        colModel.getColumn(4).setPreferredWidth(100);
        colModel.getColumn(5).setPreferredWidth(100);
    }
}
