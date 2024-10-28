/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.crud.recursoshumanos;

import controller.CRUD;
import controller.enums.TipoAtributo;
import controller.db.Conexao;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neo
 */
public class DialogExpediente extends javax.swing.JDialog {
    Conexao conexao;
    CRUD crud;

    public DialogExpediente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conexao = new Conexao();
        conexao.conectar();
        
        jTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        
        crud = new CRUD(
                conexao,
                modelo,
                "expediente",
                new String[] {
                    "cod_expediente",
                    "hora_inicio",
                    "hora_fim"
                },
                new String[] {
                    "",
                    "",
                    ""
                },
                new TipoAtributo[] {
                    TipoAtributo.PK,
                    TipoAtributo.String,
                    TipoAtributo.String
                },
                new JTextField[] {
                    jTextFieldCodigo,
                    jFormattedTextFieldInicio,
                    jFormattedTextFieldTermino,
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
        jLabelPesquisa = new javax.swing.JLabel();
        jComboBoxPesquisa = new javax.swing.JComboBox<>();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldInicio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTermino = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonResetar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Expedientes");
        setPreferredSize(new java.awt.Dimension(735, 515));
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar.setBackground(new java.awt.Color(0, 51, 102));
        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);

        jLabel5.setText("      ");
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

        jPanelMain.add(jToolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        jLabelPesquisa.setText("Pesquisar por");
        jPanelMain.add(jLabelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jComboBoxPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cód. do Expediente", "Hora de Início", "Hora de Término" }));
        jPanelMain.add(jComboBoxPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 230, -1));
        jPanelMain.add(jTextFieldPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 230, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Hora de Início", "Hora de Término"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            jTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jPanelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 420, 360));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cód. do Expediente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setPreferredSize(new java.awt.Dimension(26, 22));
        jPanel1.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora de Início:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jFormattedTextFieldInicio.setPreferredSize(new java.awt.Dimension(60, 22));
        jPanel1.add(jFormattedTextFieldInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 80, -1));

        jFormattedTextFieldTermino.setPreferredSize(new java.awt.Dimension(60, 22));
        jFormattedTextFieldTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTerminoActionPerformed(evt);
            }
        });
        jPanel1.add(jFormattedTextFieldTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 80, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora de Término:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(200, 200, 200));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Atributos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 2));

        jPanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 200));

        jButtonPesquisar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonPesquisar.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 115, -1));

        jButtonResetar2.setText("Resetar");
        jButtonResetar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetar2ActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonResetar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 115, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jFormattedTextFieldTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTerminoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTerminoActionPerformed

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
    private javax.swing.JFormattedTextField jFormattedTextFieldInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToolBar jToolBar;
    // End of variables declaration//GEN-END:variables
}
