package View;

import Model.Crianca;
import DAO.CriancaDAO;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Isabel
 */
public class RegistarCrianca extends javax.swing.JFrame {

    /**
     * Creates new form RegistarCliente
     */
    public RegistarCrianca() {
        initComponents();
        setResizable(false);
        DefaultTableModel modelo = (DefaultTableModel) tb_criancas.getModel();
        tb_criancas.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) tb_criancas.getModel();
        modelo.setNumRows(0);
        CriancaDAO cdao = new CriancaDAO();

        for (Crianca c : cdao.listAll()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getDataNascimento(),
                c.getTipoDocumento(),
                c.getNumeroDocumento(),
                c.getSexo(),
                c.getTelefone(),
                c.getMorada(),
                c.getNomePai(),
                c.getNomeMae()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_criancas = new javax.swing.JTable();
        btn_guardar = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tf_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb_masc = new javax.swing.JRadioButton();
        rb_fem = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tf_morada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_tipoDocs = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tf_nrDocs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_telefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_dataNasc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tf_nomePai = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_nomeMae = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tb_criancas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Data Nascimento", "Tipo Documento", "Numero Documento", "Sexo", "Telefone", "Morada", "Nome do Pai", "Nome da Mae"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_criancas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_criancasMouseClicked(evt);
            }
        });
        tb_criancas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tb_criancasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_criancas);

        btn_guardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salvar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_deletar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_deletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excluir.png"))); // NOI18N
        btn_deletar.setText("Apagar");
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(btn_guardar)
                .addGap(29, 29, 29)
                .addComponent(btn_deletar)
                .addGap(33, 33, 33)
                .addComponent(btn_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_deletar)
                    .addComponent(btn_cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Formulario da Crianca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Sexo");

        RadioBtn.add(rb_masc);
        rb_masc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_masc.setText("Masculino");

        RadioBtn.add(rb_fem);
        rb_fem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rb_fem.setText("Femenino");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Morada");

        tf_morada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de Documento");

        cb_tipoDocs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_tipoDocs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione o Documento --", "Bilhete de Identificação", "Passaporte", "Dire", "Outro" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Numero do Documento");

        tf_nrDocs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Telefone");

        tf_telefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Data de Nascimento");

        tf_dataNasc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_dataNasc.setText("dd/mm/aaaa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rb_masc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb_fem)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_nome)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_dataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(tf_telefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cb_tipoDocs, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_nrDocs, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_morada))
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_tipoDocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nrDocs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_masc)
                    .addComponent(rb_fem)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_morada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel2)
                        .addComponent(tf_dataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados dos Pais"));

        tf_nomePai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_nomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomePaiActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Nome do Pai");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome da Mae");

        tf_nomeMae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addComponent(tf_nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tf_nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(tf_nomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tf_nomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_nomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomePaiActionPerformed

    private void tb_criancasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_criancasKeyReleased
        // TODO add your handling code here:
        if (tb_criancas.getSelectedRow() != -1) {
            tf_nome.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 1).toString());
            tf_dataNasc.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 2).toString());
            cb_tipoDocs.setSelectedItem(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 3).toString());
            tf_nrDocs.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 4).toString());
            tf_telefone.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 6).toString());
            tf_morada.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 7).toString());
            tf_nomePai.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 8).toString());
            tf_nomeMae.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_tb_criancasKeyReleased

    private void tb_criancasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_criancasMouseClicked
        // TODO add your handling code here:
        if (tb_criancas.getSelectedRow() != -1) {
            tf_nome.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 1).toString());
            tf_dataNasc.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 2).toString());
            cb_tipoDocs.setSelectedItem(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 3).toString());
            tf_nrDocs.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 4).toString());
            tf_telefone.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 6).toString());
            tf_morada.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 7).toString());
            tf_nomePai.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 8).toString());
            tf_nomeMae.setText(tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 9).toString());
        }
    }//GEN-LAST:event_tb_criancasMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        Calendar cal = Calendar.getInstance(); //obter o calendario do sistema
        int anoAtual = cal.get(Calendar.YEAR); //obter o ano do calendario
        String array[] = new String[2];
        array = tf_dataNasc.getText().split("/");
        int anoNasc;
        Integer idade = null;
        if (tf_dataNasc.getText().equals("dd/mm/aaaa")) {
            JOptionPane.showMessageDialog(this, "Insira a data de Nascimento", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            anoNasc = Integer.parseInt(array[2]);
            idade = anoAtual - anoNasc;
        }
        if (cb_tipoDocs.getSelectedItem().equals("-- Selecione o Documento --")) {
            JOptionPane.showMessageDialog(this, "Selecione o tipo de Documento", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else if (idade > 5) {
            Crianca c = new Crianca();
            CriancaDAO dao = new CriancaDAO();
            if (tb_criancas.getSelectedRow() != -1) {
                c.setId((int) tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 0));
            }
            c.setTipoDocumento((String) cb_tipoDocs.getSelectedItem());
            if (rb_fem.isSelected()) {
                c.setSexo("Femenino");
            } else if (rb_masc.isSelected()) {
                c.setSexo("Masculino");
            }
            c.setNome(tf_nome.getText());
            c.setDataNascimento(tf_dataNasc.getText());
            c.setMorada(tf_morada.getText());
            c.setNumeroDocumento(tf_nrDocs.getText());
            c.setTelefone(tf_telefone.getText());
            c.setNomePai(tf_nomePai.getText());
            c.setNomeMae(tf_nomeMae.getText());
            dao.save(c);

            cb_tipoDocs.setSelectedItem("-- Selecione o Documento --");
            tf_morada.setText("");
            tf_nome.setText("");
            tf_nrDocs.setText("");
            tf_telefone.setText("");
            tf_nomePai.setText("");
            tf_nomeMae.setText("");

            readTable();
        } else {
            JOptionPane.showMessageDialog(null, "A crianca deve ser Maior de 5 anos!", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente Apagar a Crianca ?");
        if (opcao == 0) {
            if (tb_criancas.getSelectedRow() != -1) {
                Crianca c = new Crianca();
                CriancaDAO dao = new CriancaDAO();
                c.setId((int) tb_criancas.getValueAt(tb_criancas.getSelectedRow(), 0));
                dao.delete(c.getId());

                cb_tipoDocs.setSelectedItem("-- Selecione o Documento --");
                tf_morada.setText("");
                tf_nome.setText("");
                tf_nrDocs.setText("");
                tf_telefone.setText("");
                tf_nomePai.setText("");
                tf_nomeMae.setText("");

                readTable();
            }
        }
    }//GEN-LAST:event_btn_deletarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioBtn;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cb_tipoDocs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_fem;
    private javax.swing.JRadioButton rb_masc;
    private javax.swing.JTable tb_criancas;
    private javax.swing.JTextField tf_dataNasc;
    private javax.swing.JTextField tf_morada;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_nomeMae;
    private javax.swing.JTextField tf_nomePai;
    private javax.swing.JTextField tf_nrDocs;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}
