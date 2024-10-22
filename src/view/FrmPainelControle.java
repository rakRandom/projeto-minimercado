/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.crud.outros.DialogClassific;
import view.crud.outros.DialogContas;
import view.crud.outros.DialogMetodosPag;
import view.crud.outros.DialogTelefone;
import view.crud.produtoscompras.FrmCategoria;
import view.crud.produtoscompras.FrmCompra;
import view.crud.produtoscompras.FrmFabricante;
import view.crud.produtoscompras.FrmLote;
import view.crud.produtoscompras.FrmProduto;
import view.crud.produtoscompras.FrmPromoCate;
import view.crud.produtoscompras.FrmPromoProd;
import view.crud.recursoshumanos.DialogCargo;
import view.crud.recursoshumanos.DialogCliente;
import view.crud.recursoshumanos.DialogExpediente;
import view.crud.recursoshumanos.DialogFuncionario;

/**
 *
 * @author user
 */
public class FrmPainelControle extends javax.swing.JFrame {
    private static final String[] promocaoOpcoes = {
        "Produtos", 
        "Categorias", 
        "[Cancelar]"
    };

    /**
     * Creates new form FrmPainelControle
     */
    public FrmPainelControle() {
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
        jToolBar1 = new javax.swing.JToolBar();
        jLabel4 = new javax.swing.JLabel();
        jButtonClassificacoes = new javax.swing.JButton();
        jButtonTelefones = new javax.swing.JButton();
        jButtonMetodoPag = new javax.swing.JButton();
        jButtonContas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();
        jLabelRelatorio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemFuncionarios = new javax.swing.JMenuItem();
        jMenuItemExpedientes = new javax.swing.JMenuItem();
        jMenuItemCargos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuItemCategorias = new javax.swing.JMenuItem();
        jMenuItemLotes = new javax.swing.JMenuItem();
        jMenuItemFabricantes = new javax.swing.JMenuItem();
        jMenuItemPromocoes = new javax.swing.JMenuItem();
        jMenuItemCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel de Controle");
        setBounds(new java.awt.Rectangle(0, 0, 720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(740, 480));
        jPanelMain.setName("MainPanel"); // NOI18N
        jPanelMain.setPreferredSize(new java.awt.Dimension(740, 480));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(0, 51, 102));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Outras Tabelas:    ");
        jToolBar1.add(jLabel4);

        jButtonClassificacoes.setText("  Classificações  ");
        jButtonClassificacoes.setFocusable(false);
        jButtonClassificacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonClassificacoes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonClassificacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClassificacoesActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonClassificacoes);

        jButtonTelefones.setText("  Telefones  ");
        jButtonTelefones.setFocusable(false);
        jButtonTelefones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonTelefones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonTelefones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelefonesActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonTelefones);

        jButtonMetodoPag.setText("  Métodos de Pagamento  ");
        jButtonMetodoPag.setFocusable(false);
        jButtonMetodoPag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMetodoPag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMetodoPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMetodoPagActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonMetodoPag);

        jButtonContas.setText("  Contas e Credenciais  ");
        jButtonContas.setFocusable(false);
        jButtonContas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonContas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContasActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonContas);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(50, 25));
        jToolBar1.add(jSeparator1);

        jButtonSair.setText("   Sair   ");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSair);

        jPanelMain.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 700, 30));

        jLabelRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRelatorio.setText("Relatório Geral de Gastos:");
        jPanelMain.add(jLabelRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 700, 330));

        jMenu2.setText("Recursos Humanos");

        jMenuItemClientes.setText("Controle de Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemClientes);

        jMenuItemFuncionarios.setText("Controle de Funcionários");
        jMenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemFuncionarios);

        jMenuItemExpedientes.setText("Administrar Expedientes");
        jMenuItemExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExpedientesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExpedientes);

        jMenuItemCargos.setText("Administrar Cargos");
        jMenuItemCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCargos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Produtos e Compras");

        jMenuItemProdutos.setText("Controle de Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemProdutos);

        jMenuItemCategorias.setText("Controle de Categorias");
        jMenuItemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCategorias);

        jMenuItemLotes.setText("Controle de Lotes");
        jMenuItemLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLotesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemLotes);

        jMenuItemFabricantes.setText("Controle de Fabricantes");
        jMenuItemFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFabricantesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemFabricantes);

        jMenuItemPromocoes.setText("Gerenciar Promoções");
        jMenuItemPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPromocoesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemPromocoes);

        jMenuItemCompras.setText("Gerenciar Compras");
        jMenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComprasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCompras);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionariosActionPerformed
        var painel = new DialogFuncionario(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemFuncionariosActionPerformed

    private void jButtonClassificacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClassificacoesActionPerformed
        var painel = new DialogClassific(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jButtonClassificacoesActionPerformed

    private void jButtonTelefonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelefonesActionPerformed
        var painel = new DialogTelefone(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jButtonTelefonesActionPerformed

    private void jButtonMetodoPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMetodoPagActionPerformed
        var painel = new DialogMetodosPag(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jButtonMetodoPagActionPerformed

    private void jButtonContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContasActionPerformed
        var painel = new DialogContas(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jButtonContasActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        var painel = new DialogCliente(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExpedientesActionPerformed
        var painel = new DialogExpediente(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemExpedientesActionPerformed

    private void jMenuItemCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargosActionPerformed
        var painel = new DialogCargo(this, true);
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemCargosActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        dispose();
        var painel = new FrmProduto();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriasActionPerformed
        dispose();
        var painel = new FrmCategoria();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriasActionPerformed

    private void jMenuItemLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLotesActionPerformed
        dispose();
        var painel = new FrmLote();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemLotesActionPerformed

    private void jMenuItemFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFabricantesActionPerformed
        dispose();
        var painel = new FrmFabricante();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemFabricantesActionPerformed

    private void jMenuItemPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPromocoesActionPerformed
        int opcao = javax.swing.JOptionPane.showOptionDialog(null, 
                "Escolha uma tabela",
                "Você deseja abrir o formulário CRUD referente as promoções de: ",
                javax.swing.JOptionPane.DEFAULT_OPTION,
                javax.swing.JOptionPane.INFORMATION_MESSAGE,
                null,
                promocaoOpcoes,
                promocaoOpcoes[2]);

        switch(opcao) {
            case 0 -> {
                dispose();
                var painel = new FrmPromoProd();
                painel.setVisible(true);
            }
            case 1 -> {
                dispose();
                var painel = new FrmPromoCate();
                painel.setVisible(true);
            }
            default -> javax.swing.JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }//GEN-LAST:event_jMenuItemPromocoesActionPerformed

    private void jMenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComprasActionPerformed
        dispose();
        var painel = new FrmCompra();
        painel.setVisible(true);
    }//GEN-LAST:event_jMenuItemComprasActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        int op = javax.swing.JOptionPane.showConfirmDialog(
                null, 
                "Você realmente deseja sair do Painel de Controle?", 
                "Confirmar logout", 
                javax.swing.JOptionPane.YES_NO_OPTION, 
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        
        if (op == javax.swing.JOptionPane.YES_OPTION) {
            dispose();
            var painel = new FrmMain();
            painel.setVisible(true);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClassificacoes;
    private javax.swing.JButton jButtonContas;
    private javax.swing.JButton jButtonMetodoPag;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonTelefones;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCargos;
    private javax.swing.JMenuItem jMenuItemCategorias;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemCompras;
    private javax.swing.JMenuItem jMenuItemExpedientes;
    private javax.swing.JMenuItem jMenuItemFabricantes;
    private javax.swing.JMenuItem jMenuItemFuncionarios;
    private javax.swing.JMenuItem jMenuItemLotes;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemPromocoes;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
