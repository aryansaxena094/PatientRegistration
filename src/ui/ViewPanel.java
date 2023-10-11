package ui;
import Model.Patient;
public class ViewPanel extends javax.swing.JPanel {
        void PopulateData(Patient newpatient) {
                GenderData.setText(newpatient.getGender());
                FNameData.setText(newpatient.getFName());
                LNameData.setText(newpatient.getLName());
                AgeData.setText(Integer.toString(newpatient.getAge()));
                EmailData.setText(newpatient.getEmail());
                MessageData.setText(newpatient.getMessage());
                PatientTypeData.setText(newpatient.getPatientType());
                GenderData.setText(newpatient.getGender());
                ImageLabel.setIcon(newpatient.getIcon());
        }
        public ViewPanel(Patient newPatient) {
                initComponents();
                PopulateData(newPatient);
        }
        @SuppressWarnings("unchecked")
        private void initComponents() {
                FNameLabel = new javax.swing.JLabel();
                LNameLabel = new javax.swing.JLabel();
                AgeLabel = new javax.swing.JLabel();
                EmailLabel = new javax.swing.JLabel();
                MessageLabel = new javax.swing.JLabel();
                PatientTypeLabel = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                ImageLabel = new javax.swing.JLabel();
                TitleLabel = new javax.swing.JLabel();
                MessageData = new javax.swing.JLabel();
                PatientTypeData = new javax.swing.JLabel();
                GenderData = new javax.swing.JLabel();
                FNameData = new javax.swing.JLabel();
                LNameData = new javax.swing.JLabel();
                AgeData = new javax.swing.JLabel();
                EmailData = new javax.swing.JLabel();
                setBackground(new java.awt.Color(156, 217, 208));
                FNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                FNameLabel.setText("First Name :");
                LNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                LNameLabel.setText("Last Name :");
                AgeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                AgeLabel.setText("Age :");
                EmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                EmailLabel.setText("Email :");
                MessageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                MessageLabel.setText("Message :");
                PatientTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                PatientTypeLabel.setText("Patient Type :");
                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel3.setText("Gender :");
                ImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                TitleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
                TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                TitleLabel.setText("Patient View Form ");
                MessageData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                MessageData.setText("no data");
                PatientTypeData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                PatientTypeData.setText("no data");
                GenderData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                GenderData.setText("no data");
                FNameData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                FNameData.setText("no data");
                LNameData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                LNameData.setText("no data");
                AgeData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                AgeData.setText("no data");
                EmailData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                EmailData.setText("no data");
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addComponent(ImageLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                160,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(FNameLabel)
                                                                                .addComponent(LNameLabel)
                                                                                .addComponent(AgeLabel)
                                                                                .addComponent(EmailLabel)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(MessageLabel)
                                                                                .addComponent(PatientTypeLabel,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                85,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                54,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(FNameData)
                                                                                .addComponent(LNameData)
                                                                                .addComponent(AgeData)
                                                                                .addComponent(EmailData)
                                                                                .addComponent(PatientTypeData)
                                                                                .addComponent(GenderData)
                                                                                .addComponent(MessageData))
                                                                .addGap(611, 611, 611))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(312, 312, 312)
                                                                .addComponent(TitleLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                356,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(TitleLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(69, 69, 69)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(ImageLabel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                190,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(FNameLabel)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(LNameLabel)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(AgeLabel)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(EmailLabel)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(PatientTypeLabel)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jLabel3)))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(MessageLabel))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(FNameData)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LNameData)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(AgeData)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(EmailData)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(PatientTypeData)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(GenderData)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(MessageData)))
                                                                .addContainerGap(330, Short.MAX_VALUE)));
        }
        private javax.swing.JLabel AgeData;
        private javax.swing.JLabel AgeLabel;
        private javax.swing.JLabel EmailData;
        private javax.swing.JLabel EmailLabel;
        private javax.swing.JLabel FNameData;
        private javax.swing.JLabel FNameLabel;
        private javax.swing.JLabel GenderData;
        private javax.swing.JLabel ImageLabel;
        private javax.swing.JLabel LNameData;
        private javax.swing.JLabel LNameLabel;
        private javax.swing.JLabel MessageData;
        private javax.swing.JLabel MessageLabel;
        private javax.swing.JLabel PatientTypeData;
        private javax.swing.JLabel PatientTypeLabel;
        private javax.swing.JLabel TitleLabel;
        private javax.swing.JLabel jLabel3;
}
