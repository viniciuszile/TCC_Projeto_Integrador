/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jogos;

import Menus.Menu_Principal;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author janaina.csilva64
 */
public class Jokenpo extends javax.swing.JFrame {

    /**
     * Creates new form Jokenpo
     */
    static int escolha = 0;
    static int cont_j = 0;
    static int cont_m = 0;
    double player = 0;
    double maquina = Math.floor(Math.random() * 4);

    public Jokenpo() {
        initComponents();
        btn_recomecar.setVisible(false);
        Jogar.setVisible(false);
        jLabel5.setText("Vitorias Jogador: " + cont_j);
        jLabel6.setText("Vitorias Maquina: " + cont_m);

    }

    public Jokenpo(String text) {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jogar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_pedra = new javax.swing.JToggleButton();
        btn_tesoura2 = new javax.swing.JToggleButton();
        btn_papel2 = new javax.swing.JToggleButton();
        btn_pedra2 = new javax.swing.JToggleButton();
        btn_papel = new javax.swing.JToggleButton();
        btn_tesoura = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        btn_recomecar = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 500));

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/janaina.csilva64/Downloads/gamer.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel1.setText("Faça Sua Escolha");

        Jogar.setText("Jogar");
        Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JogarActionPerformed(evt);
            }
        });

        jToggleButton1.setText(" ↲");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/janaina.csilva64/Downloads/gamer.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel7.setText("Escolha adversario");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OPÇÕES");

        btn_pedra.setBackground(new java.awt.Color(204, 153, 255));
        btn_pedra.setText("👊");
        btn_pedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedraActionPerformed(evt);
            }
        });

        btn_tesoura2.setBackground(new java.awt.Color(204, 153, 255));
        btn_tesoura2.setText("✌");

        btn_papel2.setBackground(new java.awt.Color(204, 153, 255));
        btn_papel2.setText("🖐");

        btn_pedra2.setBackground(new java.awt.Color(204, 153, 255));
        btn_pedra2.setText("👊");

        btn_papel.setBackground(new java.awt.Color(204, 153, 255));
        btn_papel.setText("🖐");
        btn_papel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_papelActionPerformed(evt);
            }
        });

        btn_tesoura.setBackground(new java.awt.Color(204, 153, 255));
        btn_tesoura.setText("✌");
        btn_tesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tesouraActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ganhador ?");

        btn_recomecar.setText("Recomeçar");
        btn_recomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recomecarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Vitorias Jogador 0");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Vitorias maquina 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btn_pedra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_papel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_tesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(116, 116, 116)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_pedra2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_papel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_tesoura2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                                .addComponent(jLabel7)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btn_recomecar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Jogar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pedra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tesoura2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_papel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pedra2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_papel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(Jogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btn_recomecar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JogarActionPerformed

        if (maquina == 1) {
            btn_papel2.setVisible(false);
            btn_tesoura2.setVisible(false);
        } else if (maquina == 2) {
            btn_pedra2.setVisible(false);
            btn_tesoura2.setVisible(false);
        } else if (maquina == 3) {
            btn_papel2.setVisible(false);
            btn_pedra2.setVisible(false);
        }

        if (escolha == 1) {
            btn_papel.setVisible(false);
            btn_tesoura.setVisible(false);
        } else if (escolha == 2) {
            btn_pedra.setVisible(false);
            btn_tesoura.setVisible(false);
        } else if (escolha == 3) {
            btn_papel.setVisible(false);
            btn_pedra.setVisible(false);
        }

        if (escolha == 1 && maquina == 3) {
            jLabel2.setText("pedra quebra tesoura. o jogador venceu");
            btn_recomecar.setVisible(true);
            cont_j++;
            jLabel5.setText("Vitorias Jogador: " + cont_j);
        } else if (escolha == 2 && maquina == 1) {
            jLabel2.setText("papel embrulha pedra. o jogador venceu");
            btn_recomecar.setVisible(true);
            cont_j++;
            jLabel5.setText("Vitorias Jogador: " + cont_j);
        } else if (escolha == 3 && maquina == 2) {
            jLabel2.setText("tesoura corta papel. o jogador venceu");
            btn_recomecar.setVisible(true);
            cont_j++;
            jLabel5.setText("Vitorias Jogador: " + cont_j);
        }

        if (maquina == 1 && escolha == 3) {
            jLabel2.setText("pedra quebra tesoura. a maquina venceu");
            cont_m++;
            jLabel6.setText("Vitorias Maquina: " + cont_m);
            btn_recomecar.setVisible(true);
        } else if (maquina == 2 && escolha == 1) {
            jLabel2.setText("papel embrulha pedra. a maquina venceu");
            btn_recomecar.setVisible(true);
            cont_m++;
            jLabel6.setText("Vitorias Maquina: " + cont_m);
        } else if (maquina == 3 && escolha == 2) {
            jLabel2.setText("tesoura corta papel. a maquina venceu");
            btn_recomecar.setVisible(true);
            cont_m++;
            jLabel6.setText("Vitorias Maquina: " + cont_m);
        } else if (maquina == escolha) {
            escolha = 0;
            btn_recomecar.setVisible(false);
            btn_papel.setVisible(true);
            btn_pedra.setVisible(true);
            btn_tesoura.setVisible(true);
            btn_papel2.setVisible(true);
            btn_pedra2.setVisible(true);
            btn_tesoura2.setVisible(true);
            maquina = Math.floor(Math.random() * 4);
            jLabel2.setText("EMPATE!!!");
            Jogar.setVisible(false);
        }


    }//GEN-LAST:event_JogarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        // cria e exibe a janela "solo"
        Menu_Principal Menu_Principal = new Menu_Principal();
        Menu_Principal.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btn_pedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedraActionPerformed
        // TODO add your handling code here:
        escolha = 1;
        Jogar.setVisible(true);
    }//GEN-LAST:event_btn_pedraActionPerformed

    private void btn_papelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_papelActionPerformed
        // TODO add your handling code here:
        escolha = 2;
        Jogar.setVisible(true);
    }//GEN-LAST:event_btn_papelActionPerformed

    private void btn_tesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tesouraActionPerformed
        // TODO add your handling code here:
        escolha = 3;
        Jogar.setVisible(true);
    }//GEN-LAST:event_btn_tesouraActionPerformed

    private void btn_recomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recomecarActionPerformed
        // TODO add your handling code here:
        escolha = 0;
        btn_recomecar.setVisible(false);
        btn_papel.setVisible(true);
        btn_pedra.setVisible(true);
        btn_tesoura.setVisible(true);
        btn_papel2.setVisible(true);
        btn_pedra2.setVisible(true);
        btn_tesoura2.setVisible(true);
        maquina = Math.floor(Math.random() * 4);
        jLabel2.setText("Ganhador ?");
        Jogar.setVisible(false);
    }//GEN-LAST:event_btn_recomecarActionPerformed

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
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jokenpo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jokenpo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jogar;
    private javax.swing.JToggleButton btn_papel;
    private javax.swing.JToggleButton btn_papel2;
    private javax.swing.JToggleButton btn_pedra;
    private javax.swing.JToggleButton btn_pedra2;
    private javax.swing.JToggleButton btn_recomecar;
    private javax.swing.JToggleButton btn_tesoura;
    private javax.swing.JToggleButton btn_tesoura2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

}
