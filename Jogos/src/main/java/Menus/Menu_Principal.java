/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import Jogos.Acerte_Numero;
import com.mycompany.forca.Forca_Palavra ;
import Jogos.Impar_Par_Sorteio;
import Jogos.Jokenpo;
import Jogos.Jogo_Da_Velha;
import com.mycompany.forca.Forca_Palavra;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Zile
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Multplayer
     */
    public Menu_Principal() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_acertenum = new javax.swing.JToggleButton();
        btn_velha = new javax.swing.JToggleButton();
        btn_jokenpo = new javax.swing.JToggleButton();
        btn_impapar = new javax.swing.JToggleButton();
        titulo = new javax.swing.JLabel();
        btn_forca = new javax.swing.JToggleButton();
        infos_an = new javax.swing.JButton();
        infos_velha = new javax.swing.JButton();
        infos_ip = new javax.swing.JButton();
        infos_jkp = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        jScrollPane1.setViewportView(jEditorPane1);

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(42, 42, 42));
        setSize(new java.awt.Dimension(500, 550));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(47, 8, 88));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_acertenum.setBackground(new java.awt.Color(3, 205, 8));
        btn_acertenum.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btn_acertenum.setForeground(new java.awt.Color(3, 130, 8));
        btn_acertenum.setText("Acerte o número");
        btn_acertenum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_acertenumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_acertenumMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_acertenumMouseReleased(evt);
            }
        });
        btn_acertenum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acertenumActionPerformed(evt);
            }
        });

        btn_velha.setBackground(new java.awt.Color(255, 15, 8));
        btn_velha.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btn_velha.setForeground(new java.awt.Color(150, 15, 8));
        btn_velha.setText("Jogo da velha");
        btn_velha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_velhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_velhaMouseExited(evt);
            }
        });
        btn_velha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_velhaActionPerformed(evt);
            }
        });

        btn_jokenpo.setBackground(new java.awt.Color(1, 158, 184));
        btn_jokenpo.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btn_jokenpo.setForeground(new java.awt.Color(1, 100, 158));
        btn_jokenpo.setText("Jokenpô");
        btn_jokenpo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jokenpoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jokenpoMouseExited(evt);
            }
        });
        btn_jokenpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jokenpoActionPerformed(evt);
            }
        });

        btn_impapar.setBackground(new java.awt.Color(242, 239, 8));
        btn_impapar.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btn_impapar.setForeground(new java.awt.Color(242, 150, 8));
        btn_impapar.setText("Ímpar ou par");
        btn_impapar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_impaparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_impaparMouseExited(evt);
            }
        });
        btn_impapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_impaparActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Selecione um jogo");
        titulo.setToolTipText("");
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tituloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tituloMouseExited(evt);
            }
        });

        btn_forca.setBackground(new java.awt.Color(255, 102, 0));
        btn_forca.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btn_forca.setForeground(new java.awt.Color(102, 51, 0));
        btn_forca.setText("Forca");
        btn_forca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_forcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_forcaMouseExited(evt);
            }
        });
        btn_forca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_forcaActionPerformed(evt);
            }
        });

        infos_an.setBackground(new java.awt.Color(3, 205, 8));
        infos_an.setForeground(new java.awt.Color(3, 130, 8));
        infos_an.setText("?");
        infos_an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infos_anActionPerformed(evt);
            }
        });

        infos_velha.setBackground(new java.awt.Color(255, 15, 8));
        infos_velha.setForeground(new java.awt.Color(150, 15, 8));
        infos_velha.setText("?");
        infos_velha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infos_velhaActionPerformed(evt);
            }
        });

        infos_ip.setBackground(new java.awt.Color(242, 239, 8));
        infos_ip.setForeground(new java.awt.Color(242, 150, 8));
        infos_ip.setText("?");
        infos_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infos_ipActionPerformed(evt);
            }
        });

        infos_jkp.setBackground(new java.awt.Color(1, 158, 184));
        infos_jkp.setForeground(new java.awt.Color(1, 100, 158));
        infos_jkp.setText("?");
        infos_jkp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infos_jkpActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setForeground(new java.awt.Color(102, 51, 0));
        jButton5.setText("?");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_velha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_acertenum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_impapar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_jokenpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_forca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infos_an)
                            .addComponent(infos_velha)
                            .addComponent(infos_ip)
                            .addComponent(infos_jkp)
                            .addComponent(jButton5)))
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(titulo))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_acertenum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infos_an))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_velha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infos_velha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_impapar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infos_ip))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_jokenpo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infos_jkp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_forca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acertenumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acertenumActionPerformed
        Acerte_Numero jogo = new Acerte_Numero();

        // Começa o Jogo e fecha a janela atual
        Acerte_Numero.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_acertenumActionPerformed

    private void btn_velhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_velhaActionPerformed
        // Começa o Jogo e fecha a janela atual
        Jogo_Da_Velha jogo = new Jogo_Da_Velha();
        this.dispose();
    }//GEN-LAST:event_btn_velhaActionPerformed

    private void btn_jokenpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jokenpoActionPerformed
        // TODO add your handling code here:
        Jokenpo jogo = new Jokenpo();

        // Começa o Jogo e fecha a janela atual
        Jokenpo.main(new String[]{});
        this.dispose();
    }//GEN-LAST:event_btn_jokenpoActionPerformed

    private void btn_impaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_impaparActionPerformed

        // TODO add your handling code here:
        Impar_Par_Sorteio jogo = new Impar_Par_Sorteio();

        // Começa o Jogo e fecha a janela atual
        Impar_Par_Sorteio.main(new String[]{});

        this.dispose();
    }//GEN-LAST:event_btn_impaparActionPerformed

    private void btn_acertenumMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_acertenumMouseReleased
        // TODO add your handling code here:
        btn_acertenum.setBackground(Color.BLUE);
    }//GEN-LAST:event_btn_acertenumMouseReleased

    private void btn_acertenumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_acertenumMouseEntered
        // TODO add your handling code here:
        btn_acertenum.setBackground(new Color(3, 130, 8));
        btn_acertenum.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_acertenumMouseEntered

    private void btn_acertenumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_acertenumMouseExited
        // TODO add your handling code here:;
        btn_acertenum.setForeground(new Color(3, 130, 8));
    }//GEN-LAST:event_btn_acertenumMouseExited

    private void btn_velhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_velhaMouseEntered
        // TODO add your handling code here:
        btn_velha.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_btn_velhaMouseEntered

    private void btn_jokenpoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jokenpoMouseEntered
        // TODO add your handling code here:
        btn_jokenpo.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_btn_jokenpoMouseEntered

    private void btn_impaparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_impaparMouseEntered
        // TODO add your handling code here:
        btn_impapar.setForeground(new Color(255, 255, 255, 255));
    }//GEN-LAST:event_btn_impaparMouseEntered

    private void btn_velhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_velhaMouseExited

        btn_velha.setForeground(new Color(150, 15, 8));
    }//GEN-LAST:event_btn_velhaMouseExited

    private void btn_jokenpoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jokenpoMouseExited
        // TODO add your handling code here:
        btn_jokenpo.setForeground(new Color(1, 100, 158));
    }//GEN-LAST:event_btn_jokenpoMouseExited

    private void btn_impaparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_impaparMouseExited
        // TODO add your handling code here:
        btn_impapar.setForeground(new Color(242, 150, 8));
    }//GEN-LAST:event_btn_impaparMouseExited

    private void tituloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseExited
        // TODO add your handling code here:
        titulo.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tituloMouseExited

    private void tituloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseEntered
        // TODO add your handling code here:
        titulo.setForeground(new Color(139, 0, 0));
    }//GEN-LAST:event_tituloMouseEntered

    private void btn_forcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forcaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_forcaMouseEntered

    private void btn_forcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forcaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_forcaMouseExited

    private void btn_forcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_forcaActionPerformed
        Forca_Palavra  jogos = new Forca_Palavra ();

        // Começa o Jogo e fecha a janela atual
        Forca_Palavra.main(new String[]{});

        this.dispose();
    }//GEN-LAST:event_btn_forcaActionPerformed

    private void infos_anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infos_anActionPerformed
        // Descrição do jogo
        String descricao = "Acerte o número é um jogo simples e divertido onde você precisa adivinhar um número entre 0 e 100.\n\nO jogo fornece dicas sobre se o número é maior ou menor a cada tentativa.\n\nTente acertar o número com o menor número de tentativas possível e desafie seus amigos. Divirta-se e teste suas habilidades de adivinhação com Acerte o número!";

        // Exibir a descrição em um alerta
        JOptionPane.showMessageDialog(this, descricao, "Informações sobre o jogo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infos_anActionPerformed

    private void infos_velhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infos_velhaActionPerformed
        String descricao = "O Jogo da Velha é um jogo clássico de 2 jogadores em que eles alternam entre X e O para preencher uma grade 3x3.\n\n"
                + "O objetivo é conseguir três símbolos iguais em linha, coluna ou diagonal. É um jogo simples, divertido e estratégico para duas pessoas";

        // Exibir a descrição em um alerta
        JOptionPane.showMessageDialog(this, descricao, "Informações sobre o jogo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infos_velhaActionPerformed

    private void infos_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infos_ipActionPerformed
        // TODO add your handling code here:
        String descricao = "O Jogo Ímpar ou Par é um jogo em que você desafia o computador a adivinhar se o número total de dedos que você e a máquina exibirão será ímpar ou par.\n\n"
                + "Faça sua escolha e veja quem será o vencedor!";

        // Exibir a descrição em um alerta
        JOptionPane.showMessageDialog(this, descricao, "Informações sobre o jogo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infos_ipActionPerformed

    private void infos_jkpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infos_jkpActionPerformed
        // TODO add your handling code here:
        String descricao = "O jogo \"Jokenpo\" é uma versão digital do famoso jogo de pedra, papel e tesoura. Nesse jogo,\n\n"
                + "o jogador compete contra a máquina em uma série de rodadas, onde cada jogador escolhe um dos três elementos: pedra, papel ou tesoura.";

        // Exibir a descrição em um alerta
        JOptionPane.showMessageDialog(this, descricao, "Informações sobre o jogo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infos_jkpActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String descricao = "O jogo da \"Forca\" é um jogo clássico em que você deve adivinhar uma palavra oculta.\n\n"
                + "Você receberá uma dica para te ajudar a descobrir a palavra correta. O objetivo é adivinhar as letras da palavra, uma por vez, antes de esgotar o número máximo de tentativas. ";

        // Exibir a descrição em um alerta
        JOptionPane.showMessageDialog(this, descricao, "Informações sobre o jogo", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_acertenum;
    private javax.swing.JToggleButton btn_forca;
    private javax.swing.JToggleButton btn_impapar;
    private javax.swing.JToggleButton btn_jokenpo;
    private javax.swing.JToggleButton btn_velha;
    private javax.swing.JButton infos_an;
    private javax.swing.JButton infos_ip;
    private javax.swing.JButton infos_jkp;
    private javax.swing.JButton infos_velha;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
