/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

import Menus.Menu_Principal;
import java.util.Scanner;

/**
 *
 * @author wesley.ssantos58
 */
public class Forca {

    public static void main(String[] args) {
        int decisao = 0;

        Scanner scan = new Scanner(System.in);

        do {
            for (int i = 0; i < 10; i++) {
                System.out.println("Jogo Da Forca solo.");
            }
            System.out.println("Digite 1 para jogar novamente 2 para voltar ao menu.");
            decisao = scan.nextInt();

        } while (decisao != 2);

        Menu_Principal menu = new Menu_Principal();
        menu.setVisible(true);
    }
}
