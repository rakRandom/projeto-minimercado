/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.crud.produtoscompras;

import controller.CRUD;
import controller.enums.TipoAtributo;
import controller.db.Conexao;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neo
 */
public class DialogLote extends javax.swing.JDialog {
    Conexao conexao;
    CRUD crud;

    public DialogLote(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conexao = new Conexao();
        conexao.conectar();
        
        jTable.getColumnModel().getColumn(0).setPreferredWidth(75);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(75);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        
        crud = new CRUD(
                conexao,
                modelo,
                "lote",
                new String[] {
                    "cod_lote",
                    "cod_prod",
                    "data_validade",
                    "data_compra",
                    "quantidade"
                },
                new String[] {
                    "",
                    "produto",
                    "",
                    "",
                    ""
                },
                new TipoAtributo[] {
                    TipoAtributo.PK,
                    TipoAtributo.FK,
                    TipoAtributo.String,
                    TipoAtributo.String,
                    TipoAtributo.Number
                },
                new JTextField[] {
                    jTextFieldLote,
                    jTextFieldProduto,
                    jFormattedTextFieldValidade,
                    jFormattedTextFieldCompra,
                    jTextFieldQuantidade
                },
                jComboBoxPesquisa,
                jTextFieldPesquisa
        );
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
        jToolBar = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldLote = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jFormattedTextFieldValidade = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCompra = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jComboBoxPesquisa = new javax.swing.JComboBox<>();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonResetar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1040, 520));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(735, 515));
        jPanelMain.setPreferredSize(new java.awt.Dimension(735, 515));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesquisa.setText("Pesquisar por");
        jPanelMain.add(jLabelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        jToolBar.setBackground(new java.awt.Color(0, 51, 102));
        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        jLabel5.setText("   ");
        jToolBar.add(jLabel5);

        jButtonNovoRegistro.setText(" Novo Registro ");
        jButtonNovoRegistro.setFocusable(false);
        jButtonNovoRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovoRegistro.setPreferredSize(new java.awt.Dimension(150, 23));
        jButtonNovoRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNovoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoRegistroActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonNovoRegistro);

        jButtonGravar.setText(" Gravar ");
        jButtonGravar.setFocusable(false);
        jButtonGravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGravar.setPreferredSize(new java.awt.Dimension(75, 24));
        jButtonGravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonGravar);

        jButtonAlterar.setText(" Alterar ");
        jButtonAlterar.setToolTipText("");
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonAlterar);

        jButtonExcluir.setText(" Excluir ");
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonExcluir);
        jToolBar.add(jSeparator1);

        jButtonPrimeiro.setText(" Primeiro ");
        jButtonPrimeiro.setFocusable(false);
        jButtonPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPrimeiro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonPrimeiro);

        jButtonAnterior.setText(" Anterior ");
        jButtonAnterior.setFocusable(false);
        jButtonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonAnterior);

        jButtonProximo.setText(" Próximo ");
        jButtonProximo.setFocusable(false);
        jButtonProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });
        jToolBar.add(jButtonProximo);

        jButtonUltimo.setText(" Último ");
        jButtonUltimo.setFocusable(false);
        jButtonUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });
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
        jLabel6.setText("Cód. do Lote:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cód. do Produto:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 2));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data de Validade:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quantidade:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Data da Compra:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel3.add(jTextFieldLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, -1));
        jPanel3.add(jTextFieldProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, -1));
        jPanel3.add(jTextFieldQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, -1));

        jFormattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        jPanel3.add(jFormattedTextFieldValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, -1));

        jFormattedTextFieldCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        jPanel3.add(jFormattedTextFieldCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, -1));

        jPanelMain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 320));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CodLote", "CodProd", "Data de Validade", "Data da Compra", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setEnabled(false);
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        jPanelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 760, 420));
        jPanelMain.add(jTextFieldPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, -1));

        jComboBoxPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cód do Lote", "Cód do Produto", "Data de Validade", "Data da Compra", "Quantidade" }));
        jPanelMain.add(jComboBoxPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 140, -1));

        jButtonPesquisar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonPesquisar.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 115, -1));

        jButtonResetar2.setText("Resetar");
        jButtonResetar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetar2ActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonResetar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 115, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoRegistroActionPerformed
        crud.novoRegistro();
    }//GEN-LAST:event_jButtonNovoRegistroActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        crud.gravar();
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        crud.alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        crud.excluir();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        crud.primeiro();
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        crud.anterior();
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        crud.proximo();
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        crud.ultimo();
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        crud.pesquisar();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonResetar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetar2ActionPerformed
        crud.resetarTabela();
    }//GEN-LAST:event_jButtonResetar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovoRegistro;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonResetar2;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxPesquisa;
    private javax.swing.JFormattedTextField jFormattedTextFieldCompra;
    private javax.swing.JFormattedTextField jFormattedTextFieldValidade;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
}
