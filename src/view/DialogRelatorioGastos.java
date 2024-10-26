/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.db.Conexao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neo
 */
public class DialogRelatorioGastos extends javax.swing.JDialog {
    Conexao conexao;
    DefaultTableModel modelo;

    public DialogRelatorioGastos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        conexao = new Conexao();
        conexao.conectar();
        
        String data = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        
        jLabelRelatorio.setText("Relatório Geral de Gastos - [" + data + "]:");
        
        jTable.setRowHeight(30);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        
        modelo = (DefaultTableModel) jTable.getModel();
        
        calcularGastos();
    }
    
    public String formatarDinheiro(Double n) {
        return "R$ " + n.toString().replace('.', ',');
    }
    
    public final void calcularGastos() {
        String sql;
        
        Double mesBruto = 0.0;
        Double anoBruto = 0.0;
        Double totalBruto = 0.0;
        
        Double mesDesconto = 0.0;
        Double anoDesconto = 0.0;
        Double totalDesconto = 0.0;
        
        Double mesProduto = 0.0;
        Double anoProduto = 0.0;
        Double totalProduto = 0.0;
        
        Double mesSalario = 0.0;
        Double anoSalario = 0.0;
        Double totalSalario = 0.0;
        
        Object[] rowTotalBrutoEmVendas;
        Object[] rowTotalEmDesconto;
        Object[] rowTotalLiquidoEmVendas;
        Object[] rowGastoEmProdutos;
        Object[] rowGastoEmSalario;
        Object[] rowTotalDeLucro;
        Object[] rowPorcentagemDeLucro;
        
        modelo.setNumRows(0);
        
        // =====================================================================
        
        try {
            sql = "SELECT * FROM compra WHERE MONTH(data_compra) = MONTH(CURRENT_DATE) AND YEAR(data_compra) = YEAR(CURRENT_DATE)";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                mesBruto += conexao.resultset.getDouble("preco_bruto");
            }
            sql = "SELECT * FROM compra WHERE YEAR(data_compra) = YEAR(CURRENT_DATE)";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                anoBruto += conexao.resultset.getDouble("preco_bruto");
            }
            sql = "SELECT * FROM compra";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                totalBruto += conexao.resultset.getDouble("preco_bruto");
            }
            
            rowTotalBrutoEmVendas = new Object[] {
                "Total Bruto em Vendas",
                formatarDinheiro(mesBruto),
                formatarDinheiro(anoBruto),
                formatarDinheiro(totalBruto)
            };
        } catch (SQLException | NullPointerException e) {
            rowTotalBrutoEmVendas = new Object[] {
                "Total Bruto em Vendas"
            };
        }
        
        
        // =====================================================================
        
        try {
            sql = "SELECT * FROM compra WHERE MONTH(data_compra) = MONTH(CURRENT_DATE) AND YEAR(data_compra) = YEAR(CURRENT_DATE)";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                mesDesconto += conexao.resultset.getDouble("valor_desconto");
            }
            sql = "SELECT * FROM compra WHERE YEAR(data_compra) = YEAR(CURRENT_DATE)";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                anoDesconto += conexao.resultset.getDouble("valor_desconto");
            }
            sql = "SELECT * FROM compra";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                totalDesconto += conexao.resultset.getDouble("valor_desconto");
            }
            
            rowTotalEmDesconto = new Object[] {
                "Total em Desconto",
                formatarDinheiro(mesDesconto),
                formatarDinheiro(anoDesconto),
                formatarDinheiro(totalDesconto)
            };
        } catch (SQLException | NullPointerException e) {
            rowTotalEmDesconto = new Object[] {
                "Total em Desconto"
            };
        }
        
        // =====================================================================
        
        Double mesLiquido = mesBruto - mesDesconto;
        Double anoLiquido = anoBruto - anoDesconto;
        Double totalLiquido = totalBruto - totalDesconto;
        
        rowTotalLiquidoEmVendas = new Object[] {
            "Total Líquido em Vendas",
            formatarDinheiro(mesLiquido),
            formatarDinheiro(anoLiquido),
            formatarDinheiro(totalLiquido)
        };
        
        // =====================================================================
        
        try {
            sql = "SELECT * FROM produto";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                Conexao conexaoInterna = new Conexao();
                conexaoInterna.conectar();
                
                String cod_prod = conexao.resultset.getString("cod_prod");
        
                Double mesProdutoUnico = 0.0;
                Double anoProdutoUnico = 0.0;
                Double totalProdutoUnico = 0.0;
                
                sql = "SELECT * FROM lote WHERE MONTH(data_compra) = MONTH(CURRENT_DATE) AND YEAR(data_compra) = YEAR(CURRENT_DATE) AND cod_prod = " + cod_prod;
                conexaoInterna.executarSQL(sql);
                while (conexaoInterna.resultset.next()) {
                    mesProduto += conexao.resultset.getDouble("preco") / 2 * conexaoInterna.resultset.getInt("quantidade");
                }
                sql = "SELECT * FROM lote WHERE YEAR(data_compra) = YEAR(CURRENT_DATE) AND cod_prod = " + cod_prod;
                conexaoInterna.executarSQL(sql);
                while (conexaoInterna.resultset.next()) {
                    anoProduto += conexao.resultset.getDouble("preco") / 2 * conexaoInterna.resultset.getInt("quantidade");
                }
                sql = "SELECT * FROM lote WHERE cod_prod = " + cod_prod;
                conexaoInterna.executarSQL(sql);
                while (conexaoInterna.resultset.next()) {
                    totalProduto += conexao.resultset.getDouble("preco") / 2 * conexaoInterna.resultset.getInt("quantidade");
                }
                
                mesProduto += mesProdutoUnico;
                anoProduto += anoProdutoUnico;
                totalProduto += totalProdutoUnico;
            }
            
            rowGastoEmProdutos = new Object[] {
                "Gasto em Produtos",
                formatarDinheiro(mesProduto),
                formatarDinheiro(anoProduto),
                formatarDinheiro(totalProduto)
            };
        } catch (SQLException | NullPointerException e) {
            rowGastoEmProdutos = new Object[] {
                "Gasto em Produtos"
            };
        }
        
        // =====================================================================
        
        try {
            int qtFunc = 0;
            
            sql = "SELECT * FROM funcionario";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                qtFunc++;
            }
            
            double salarioTotal = 0.0;
            sql = "SELECT * FROM cargo";
            conexao.executarSQL(sql);
            while (conexao.resultset.next()) {
                salarioTotal += conexao.resultset.getDouble("salario");
            }
            
            mesSalario = salarioTotal / qtFunc;
            anoSalario = salarioTotal / qtFunc * 12;
            
            rowGastoEmSalario = new Object[] {
                "Gasto em Salário",
                formatarDinheiro(mesSalario),
                formatarDinheiro(anoSalario),
                "- Sem dados -"
            };
        } catch (SQLException | NullPointerException e) {
            rowGastoEmSalario = new Object[] {
                "Gasto em Salário"
            };
        }
        
        // =====================================================================
        
        Double mesLucro = mesLiquido - mesProduto - mesSalario;
        Double anoLucro = anoLiquido - anoProduto - anoSalario;
        Double totalLucro = totalLiquido - totalProduto - anoSalario;
        
        rowTotalDeLucro = new Object[] {
            "Total de lucro",
            formatarDinheiro(mesLucro),
            formatarDinheiro(anoLucro),
            "~ " + formatarDinheiro(totalLucro)
        };
        
        // =====================================================================
        
        rowPorcentagemDeLucro = new Object[] {
            "Porcentagem de lucro",
            "~ %.2f %%".formatted(mesLucro / mesLiquido),
            "~ %.2f %%".formatted(anoLucro / anoLiquido),
            "~ %.2f %%".formatted(totalLucro / totalLiquido)
        };
        
        // =====================================================================
        
        modelo.addRow(rowTotalBrutoEmVendas);
        modelo.addRow(rowTotalEmDesconto);
        modelo.addRow(rowTotalLiquidoEmVendas);
        modelo.addRow(rowGastoEmProdutos);
        modelo.addRow(rowGastoEmSalario);
        modelo.addRow(rowTotalDeLucro);
        modelo.addRow(rowPorcentagemDeLucro);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelRelatorio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Geral de Gastos");
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setMinimumSize(new java.awt.Dimension(740, 480));
        jPanelMain.setName("MainPanel"); // NOI18N
        jPanelMain.setPreferredSize(new java.awt.Dimension(740, 480));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "-", "Mensal", "Anual", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 270));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRelatorio.setText("Relatório Geral de Gastos - [dd/mm/yyyy]:");
        jPanel1.add(jLabelRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 50));

        jMenu1.setMnemonic('S');
        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

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
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
