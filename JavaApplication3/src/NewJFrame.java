/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Khaled
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 492));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MohamedKhaled\\Downloads\\WhatsApp Image 2019-12-07 at 1.07.38 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 492));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("French Script MT", 2, 36)); // NOI18N
        jLabel2.setText("Log In");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 30, 100, 50);

        jLabel4.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel4.setText("User Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 98, 28);

        jLabel5.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 71, 28);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jButton2.setText("Log In");
        jButton2.setActionCommand("Log In");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel1.add(jButton2);
        jButton2.setBounds(90, 380, 140, 33);

        jTextField1.setBackground(new java.awt.Color(255, 91, 113));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 160, 220, 14);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 180, 220, 10);

        jPasswordField1.setBackground(new java.awt.Color(255, 126, 99));
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(30, 260, 220, 14);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(30, 280, 220, 20);

        jRadioButton2.setBackground(new java.awt.Color(249, 139, 92));
        jRadioButton2.setFont(new java.awt.Font("French Script MT", 0, 24)); // NOI18N
        jRadioButton2.setText("Admin");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(180, 310, 110, 30);

        jRadioButton1.setBackground(new java.awt.Color(249, 139, 92));
        jRadioButton1.setFont(new java.awt.Font("French Script MT", 0, 24)); // NOI18N
        jRadioButton1.setText("Client");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(30, 310, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\MohamedKhaled\\Downloads\\Bridgehampton, NY Sunset 7_48pm.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 330, 490);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 330, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
