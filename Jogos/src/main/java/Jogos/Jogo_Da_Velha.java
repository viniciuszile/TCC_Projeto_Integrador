/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import Menus.Menu_Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

import javax.swing.*;

/**
 *
 * @author jc374
 *
 */
public class Jogo_Da_Velha extends JFrame {

    JLabel lb = new JLabel("Jogo da velha");
    JButton[] bt = new JButton[9];
    boolean xo = false;
    boolean[] click = new boolean[9];
    JPanel painelFundo; // novo JPanel para o painel de fundo

    public Jogo_Da_Velha() {
        setResizable(false);
        setSize(400, 430); // define o tamanho do JFrame
        setLocationRelativeTo(null); // centraliza o JFrame na tela
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // criar painel de fundo
        painelFundo = new JPanel();
        painelFundo.setBackground(new Color(17, 138, 126));
        painelFundo.setLayout(null);

        add(painelFundo);

        JButton btn = new JButton(" ↲");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.setBounds(getWidth() - 65, 10, 45, 25); // define as coordenadas e tamanho do botão
        painelFundo.add(btn); // adiciona o botão ao painel de fundo

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
                dispose();
                Menu_Principal menuPrincipal = new Menu_Principal();
                menuPrincipal.setVisible(true);
            }
        });

        JLabel labelTopo = new JLabel("Jogo da Velha", SwingConstants.CENTER);
        labelTopo.setBounds(0, 0, getWidth(), 50);
        labelTopo.setFont(new Font("Arial", Font.BOLD, 25));
        labelTopo.setForeground(Color.BLACK);
        labelTopo.setOpaque(true);
        labelTopo.setBackground(new Color(17, 138, 126));

        painelFundo.add(labelTopo);

        // adicionar botões ao painel de fundo
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            bt[cont] = new JButton();
            painelFundo.add(bt[cont]);
            bt[cont].setBounds((100 * (i % 3)) + 50, (100 * (i / 3)) + 50, 95, 95);
            bt[cont].setBackground(Color.BLACK);
            bt[cont].setForeground(Color.WHITE);
            Font font = bt[cont].getFont();
            bt[cont].setFont(font.deriveFont(font.getSize() + 20f));
            bt[cont].addMouseListener(new java.awt.event.MouseAdapter() {

                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    JButton button = (JButton) evt.getSource();
                    Border border = BorderFactory.createLineBorder(Color.WHITE, 2);
                    button.setBorder(border);
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    JButton button = (JButton) evt.getSource();
                    button.setBorder(null);
                }
            });
            cont++;

            JLabel labelFinal = new JLabel("Copyright © Janaina Costa");
            labelFinal.setBounds(70, 350, 250, 50);
            labelFinal.setFont(new Font("Arial", Font.BOLD, 18));
            labelFinal.setForeground(Color.BLACK);
// Adicionar a label ao painel de fundo
            painelFundo.add(labelFinal);

        }

        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }

        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[0] == false) {
                    click[0] = true;
                    mudar(bt[0]);
                }
            }
        });

        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[1] == false) {
                    click[1] = true;
                    mudar(bt[1]);
                }
            }
        });

        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[2] == false) {
                    click[2] = true;
                    mudar(bt[2]);
                }
            }
        });

        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[3] == false) {
                    click[3] = true;
                    mudar(bt[3]);
                }
            }
        });

        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[4] == false) {
                    click[4] = true;
                    mudar(bt[4]);
                }
            }
        });

        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[5] == false) {
                    click[5] = true;
                    mudar(bt[5]);
                }
            }
        });

        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[6] == false) {
                    click[6] = true;
                    mudar(bt[6]);
                }
            }
        });

        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[7] == false) {
                    click[7] = true;
                    mudar(bt[7]);
                }
            }
        });

        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (click[8] == false) {
                    click[8] = true;
                    mudar(bt[8]);
                }
            }
        });

    }

    public void mudar(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
            btn.setBackground(new Color(240, 93, 35));
            btn.setForeground(xo ? Color.BLACK : Color.BLACK);

        } else {
            btn.setText("X");
            xo = true;
            btn.setBackground(new Color(197, 216, 109));
            btn.setForeground(xo ? Color.BLACK : Color.BLACK);
        }
        ganhou();
    }

    public void ganhou() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true) {
                cont++;
            }
        }
        if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
                || (bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
                || (bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
                || (bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
                || (bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
                || (bt[2].getText() == "X" && bt[5].getText() == "X" && bt[0].getText() == "X")
                || (bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X")
                || (bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {

            JOptionPane.showMessageDialog(null, "X GANHOU!!!!!!");

            limpar();
        } else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
                || (bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
                || (bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
                || (bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
                || (bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
                || (bt[2].getText() == "O" && bt[5].getText() == "O" && bt[0].getText() == "O")
                || (bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O")
                || (bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {

            JOptionPane.showMessageDialog(null, "O GANHOU!!!!!!");

            limpar();
        } else if (cont == 9) {
            JOptionPane.showMessageDialog(null, "EMPATE !!!!!!!");
            limpar();
        }
    }

    public void limpar() {
        int contador = 0;
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            bt[contador].setBackground(xo ? Color.BLACK : Color.BLACK);
            click[i] = false;
            contador++;
        }
    }

    public void limparJogo() {
        xo = false;
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;
            bt[i].setEnabled(true); // Habilita os botões novamente
        }
    }

    public static void main(String[] args) {
        new Jogo_Da_Velha();

    }
}
