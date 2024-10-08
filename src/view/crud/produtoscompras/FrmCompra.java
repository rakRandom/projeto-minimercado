/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.crud.produtoscompras;

import view.FrmPainelControle;

/**
 *
 * @author Fellipe Leonardo
 */
public class FrmCompra extends javax.swing.JFrame {

    /**
     * Creates new form FrmCompra
     */
    public FrmCompra() {
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

        jPanelMain = new javax.swing.JPanel();
        jLabelPesquisa = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jToolBar = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jButtonNovoRegistro = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBoxPesquisa1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Compras");
        setPreferredSize(new java.awt.Dimension(1039, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(735, 515));
        jPanelMain.setName(""); // NOI18N
        jPanelMain.setPreferredSize(new java.awt.Dimension(1024, 480));
        jPanelMain.setRequestFocusEnabled(false);
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesquisa.setText("Pesquisar por");
        jPanelMain.add(jLabelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, 20));
        jPanelMain.add(jTextFieldPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 410, -1));

        jButtonPesquisar.setText("Pesquisar");
        jPanelMain.add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, -1, -1));

        jToolBar.setBackground(new java.awt.Color(0, 51, 102));
        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        jLabel3.setText("   ");
        jToolBar.add(jLabel3);

        jButtonNovoRegistro.setText(" Novo Registro ");
        jButtonNovoRegistro.setFocusable(false);
        jButtonNovoRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovoRegistro.setPreferredSize(new java.awt.Dimension(150, 23));
        jButtonNovoRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonNovoRegistro);

        jButtonGravar.setText(" Gravar ");
        jButtonGravar.setFocusable(false);
        jButtonGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(75, 24));
        jButtonGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonGravar);

        jButtonAlterar.setText(" Alterar ");
        jButtonAlterar.setToolTipText("");
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonAlterar);

        jButtonExcluir.setText(" Excluir ");
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonExcluir);
        jToolBar.add(jSeparator1);

        jButtonPrimeiro.setText(" Primeiro ");
        jButtonPrimeiro.setFocusable(false);
        jButtonPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonPrimeiro);

        jButtonAnterior.setText(" Anterior ");
        jButtonAnterior.setFocusable(false);
        jButtonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonAnterior);

        jButtonProximo.setText(" Próximo ");
        jButtonProximo.setFocusable(false);
        jButtonProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonProximo);

        jButtonUltimo.setText(" Último ");
        jButtonUltimo.setFocusable(false);
        jButtonUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(jButtonUltimo);
        jToolBar.add(jSeparator2);

        jButtonSair.setText("   Sair   ");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonSair);

        jPanelMain.add(jToolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 40));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cód. da Compra:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jTextField2.setEditable(false);
        jTextField2.setPreferredSize(new java.awt.Dimension(26, 22));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id. do Funcionário:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        jFormattedTextField4.setPreferredSize(new java.awt.Dimension(60, 22));
        jPanel3.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preço Bruto:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        jLabel11.setBackground(new java.awt.Color(200, 200, 200));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Atributos");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 2));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id. do Cliente:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Valor Desconto:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Método de Pagamento:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jFormattedTextField5.setPreferredSize(new java.awt.Dimension(60, 22));
        jFormattedTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Data da Compra:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jFormattedTextField6.setPreferredSize(new java.awt.Dimension(60, 22));
        jFormattedTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, -1));

        jFormattedTextField8.setPreferredSize(new java.awt.Dimension(60, 22));
        jFormattedTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 90, -1));

        jFormattedTextField9.setPreferredSize(new java.awt.Dimension(60, 22));
        jFormattedTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField9ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, -1));

        jFormattedTextField10.setPreferredSize(new java.awt.Dimension(60, 22));
        jFormattedTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField10ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, -1));

        jPanelMain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 410));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodCompra", "IdFunc", "IdCliente", "DataCompra", "MetodoPag", "PrecoBruto", "ValorDesconto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        jPanelMain.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 760, 380));

        jComboBoxPesquisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cód. da Compra", "Id. do Funcionário", "Id. do Cliente", "Data da Compra", "Método de Pagamento", "Preço Bruto", "Valor Desconto" }));
        jComboBoxPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisa1ActionPerformed(evt);
            }
        });
        jPanelMain.add(jComboBoxPesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
        var painel = new FrmPainelControle();
        painel.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jFormattedTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField5ActionPerformed

    private void jFormattedTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField6ActionPerformed

    private void jFormattedTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField8ActionPerformed

    private void jFormattedTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField9ActionPerformed

    private void jFormattedTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField10ActionPerformed

    private void jComboBoxPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPesquisa1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovoRegistro;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxPesquisa1;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
}
