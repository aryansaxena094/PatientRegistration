package ui;
import Model.Patient;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class FormPanel extends javax.swing.JPanel {
    private Patient newPatient;
    private ImageIcon icon;
    JPanel BotPanel;
    boolean submitted = false;
    public FormPanel(JPanel BotPanel) {
        initComponents();
        this.BotPanel = BotPanel;
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        GenderGroup = new javax.swing.ButtonGroup();
        FNameLabel = new javax.swing.JLabel();
        FNameText = new javax.swing.JTextField();
        UploadLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        AgeLabel = new javax.swing.JLabel();
        LNameLabel = new javax.swing.JLabel();
        ImageButton = new javax.swing.JButton();
        LNameText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        EmailText = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        MessageLabel = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PatientType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        OtherButton = new javax.swing.JRadioButton();
        MaleButton = new javax.swing.JRadioButton();
        FemaleButton = new javax.swing.JRadioButton();
        MessageText = new javax.swing.JTextField();
        setBackground(new java.awt.Color(153, 204, 255));
        FNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        FNameLabel.setText("First Name");
        FNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTextActionPerformed(evt);
            }
        });
        FNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FNameTextKeyPressed(evt);
            }
        });
        UploadLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        UploadLabel.setText("Upload Image");
        SubmitButton.setFont(new java.awt.Font("MS UI Gothic", 0, 24));
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        AgeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        AgeLabel.setText("Age");
        LNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        LNameLabel.setText("Last Name");
        ImageButton.setBackground(new java.awt.Color(204, 204, 204));
        ImageButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        ImageButton.setText("Choose File...");
        ImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageButtonActionPerformed(evt);
            }
        });
        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });
        EmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        EmailLabel.setText("Email");
        MessageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        MessageLabel.setText("Message");
        ImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TitleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Patient Registration Form ");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel2.setText("Patient Type");
        PatientType.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "General", "ICU", "Emergency", "Pregnancy", "Surgery", "Staff" }));
        PatientType.setSelectedIndex(-1);
        PatientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientTypeActionPerformed(evt);
            }
        });
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel3.setText("Gender");
        GenderGroup.add(OtherButton);
        OtherButton.setText("Other");
        OtherButton.setActionCommand("Patient is Other");
        OtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherButtonActionPerformed(evt);
            }
        });
        GenderGroup.add(MaleButton);
        MaleButton.setText("Male");
        MaleButton.setActionCommand("Patient is Male");
        MaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleButtonActionPerformed(evt);
            }
        });
        GenderGroup.add(FemaleButton);
        FemaleButton.setText("Female");
        FemaleButton.setActionCommand("Patient is Female");
        MessageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageTextActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(274, 274, 274))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(AgeLabel)
                                                        .addComponent(EmailLabel)
                                                        .addComponent(FNameLabel)
                                                        .addComponent(LNameLabel)
                                                        .addComponent(MessageLabel)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(71, 71, 71)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(MaleButton)
                                                                .addGap(77, 77, 77)
                                                                .addComponent(FemaleButton)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(OtherButton))
                                                        .addComponent(FNameText)
                                                        .addComponent(LNameText)
                                                        .addComponent(AgeText)
                                                        .addComponent(EmailText, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                319, Short.MAX_VALUE)
                                                        .addComponent(PatientType,
                                                                javax.swing.GroupLayout.Alignment.TRAILING, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(MessageText))))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UploadLabel)
                                        .addComponent(ImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 183,
                                                Short.MAX_VALUE))
                                .addContainerGap(104, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(FNameLabel)
                                                        .addComponent(FNameText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(LNameLabel)
                                                        .addComponent(LNameText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AgeLabel)
                                                        .addComponent(AgeText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(EmailLabel)
                                                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(UploadLabel)
                                                .addGap(9, 9, 9)
                                                .addComponent(ImageButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(MessageLabel)
                                                        .addComponent(MessageText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(PatientType,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(MaleButton)
                                                        .addComponent(FemaleButton)
                                                        .addComponent(OtherButton))))
                                .addGap(74, 74, 74)
                                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(83, Short.MAX_VALUE)));
    }
    private void MessageTextActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void MaleButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void OtherButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void FNameTextActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void FNameTextKeyPressed(java.awt.event.KeyEvent evt) {
    }
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        newPatient = new Patient();
        try {
            newPatient.setFName(FNameText.getText());
            newPatient.setLName(LNameText.getText());
            newPatient.setAge(AgeText.getText());
            newPatient.setEmail(EmailText.getText());
            newPatient.setMessage(MessageText.getText());
            newPatient.setIcon(icon);
            try {
                newPatient.setPatientType(PatientType.getSelectedItem().toString());
            } catch (Exception e) {
                throw new Exception("Patient Type Not Selected");
            }
            try {
                newPatient.setGender(GenderGroup.getSelection().getActionCommand());
            } catch (Exception e) {
                throw new Exception("Patient Gender Not Selected");
            }
            JOptionPane.showMessageDialog(this, "Submitted", "User Information", JOptionPane.INFORMATION_MESSAGE);
            ViewPanel newView = new ViewPanel(newPatient);
            BotPanel.add(newView);
            CardLayout layout = (CardLayout) BotPanel.getLayout();
            layout.next(BotPanel);
            submitted = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "User Information", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void ImageButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(),
                        Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    icon = new ImageIcon(edited_image);
                    ImageLabel.setIcon(icon);
                    JOptionPane.showMessageDialog(null, "Successfully uploaded", "Display Image",
                            JOptionPane.INFORMATION_MESSAGE, (Icon) icon);
                    UploadLabel.setText("Image Uploaded");
                } else {
                    throw new Exception("Unsupported File");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "User Information", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public Patient getPatient() {
        return this.newPatient;
    }
    public boolean getSubmitted() {
        return this.submitted;
    }
    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void PatientTypeActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeText;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel FNameLabel;
    private javax.swing.JTextField FNameText;
    private javax.swing.JRadioButton FemaleButton;
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JButton ImageButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel LNameLabel;
    private javax.swing.JTextField LNameText;
    private javax.swing.JRadioButton MaleButton;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextField MessageText;
    private javax.swing.JRadioButton OtherButton;
    private javax.swing.JComboBox<String> PatientType;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UploadLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}
