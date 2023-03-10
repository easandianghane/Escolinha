package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Isabel
 */
public class TelaAdmin extends javax.swing.JFrame {
    
    public TelaAdmin() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Mi_RegUser = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jCheckBoxMenuItem6 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem7 = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add_User-80_icon-icons.com_57380.png"))); // NOI18N

        jButton1.setText("Adicionar Crianca");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pay_cash_payment_money_dollar_bill_icon_143267.png"))); // NOI18N

        jButton3.setText("Pagamento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/systemshutdown_103390.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1)
                        .addGap(226, 226, 226)
                        .addComponent(jButton3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton4)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_user.png"))); // NOI18N
        jMenu3.setText("Menu");

        Mi_RegUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        Mi_RegUser.setSelected(true);
        Mi_RegUser.setText("Registar Usuario");
        Mi_RegUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mi_RegUserActionPerformed(evt);
            }
        });
        jMenu3.add(Mi_RegUser);

        jCheckBoxMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Registar Crianca");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem4);

        jCheckBoxMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Registar Funcionario");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folder_page.png"))); // NOI18N
        jMenu4.setText("Mais Dados");

        jCheckBoxMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jCheckBoxMenuItem6.setSelected(true);
        jCheckBoxMenuItem6.setText("Check in/out");
        jCheckBoxMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem6);

        jCheckBoxMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jCheckBoxMenuItem7.setSelected(true);
        jCheckBoxMenuItem7.setText("Faturamento");
        jCheckBoxMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jCheckBoxMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/information.png"))); // NOI18N
        jMenu5.setText("Sobre");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Sobre");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Sair");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Mi_RegUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mi_RegUserActionPerformed
        // TODO add your handling code here:
        RegistarUsuario tela = new RegistarUsuario();
        tela.setVisible(true);
    }//GEN-LAST:event_Mi_RegUserActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        // TODO add your handling code here:
        RegistarCrianca tl = new RegistarCrianca();
        tl.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jCheckBoxMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem6ActionPerformed
        // TODO add your handling code here:
        CheckIn tl = new CheckIn();
        tl.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem6ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente terminar a sess??o ?");
        if (opcao == 0) {
            setVisible(false);
            Login tllg = new Login();
            tllg.setVisible(true);
        }

    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
        // TODO add your handling code here:
        RegistarFuncionario tl = new RegistarFuncionario();
        tl.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistarCrianca tl = new RegistarCrianca();
        tl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Caixa tl = new Caixa();
        tl.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente terminar a sess??o ?");
        if (opcao == 0) {
            setVisible(false);
            Login tllg = new Login();
            tllg.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem7ActionPerformed
        // TODO add your handling code here:
        Faturamento tl = new Faturamento();
        tl.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem Mi_RegUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem6;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
