package ui;

import Model.Patient;
import java.awt.CardLayout;

import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    Patient p;
    FormPanel formPanel;
    CardLayout layout;
    ViewPanel viewPanel;
    boolean submitted = false;

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        SplitPane = new javax.swing.JSplitPane();
        TopPanel = new javax.swing.JPanel();
        FormButton = new javax.swing.JButton();
        ViewButton = new javax.swing.JButton();
        BotPanel = new javax.swing.JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        FormButton.setText("Form");
        FormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormButtonActionPerformed(evt);
            }
        });
        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(FormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 341,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95,
                                        Short.MAX_VALUE)
                                .addComponent(ViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 331,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)));
        TopPanelLayout.setVerticalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TopPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44,
                                                Short.MAX_VALUE)
                                        .addComponent(FormButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        SplitPane.setTopComponent(TopPanel);
        BotPanel.setPreferredSize(new java.awt.Dimension(908, 614));
        BotPanel.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(BotPanel);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 637,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE)));
        pack();
    }
    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        submitted = formPanel.getSubmitted();
        if (!submitted) {
            JOptionPane.showMessageDialog(this, "No data submitted yet", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            p = formPanel.getPatient();
            viewPanel = new ViewPanel(p);
            BotPanel.add(viewPanel);
            layout = (CardLayout) BotPanel.getLayout();
            layout.next(BotPanel);
        }
    }
    private void FormButtonActionPerformed(java.awt.event.ActionEvent evt) {
        formPanel = new FormPanel(BotPanel);
        BotPanel.add(formPanel);
        layout = (CardLayout) BotPanel.getLayout();
        layout.next(BotPanel);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel BotPanel;
    private javax.swing.JButton FormButton;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton ViewButton;
}
