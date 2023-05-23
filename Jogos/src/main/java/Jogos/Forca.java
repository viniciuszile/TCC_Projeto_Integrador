/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

import Menus.Menu_Principal;
import java.util.Scanner;

import java.util.Scanner;

public class Forca {

    static int MAX_TENTATIVAS = 5;

    public static void main(String[] args) {
        String resposta = "";
        int cont2 = 0;
        Scanner input = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {

            for (int x = 0; x < 250; x++) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
                        + "-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            jogarForca();
            System.out.println("Digite 1 para jogar novamente.");
            System.out.println("Digite 2 para voltar ao menu.");
            resposta = input.nextLine();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            jogarNovamente = resposta.equals("1");
        }

        switch (resposta) {
            case "2":
                Menu_Principal.main(new String[]{});
                cont2++;
                break;
            default:
                break;
        }
    }

    private static void jogarForca() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine().toUpperCase();
        System.out.print("Digite uma dica: ");
        String dica = input.nextLine();

        char[] palavraEscondida = criarPalavraEscondida(palavra);
        int tentativas = 0;

        for (int x = 0; x < 250; x++) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
                    + "-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        while (tentativas < MAX_TENTATIVAS && !palavraCompleta(palavraEscondida)) {
            System.out.println("\nPalavra: " + new String(palavraEscondida));
            System.out.println("Dica é: " + dica);
            System.out.println("Digite uma letra: ");

            String letra = input.nextLine().toUpperCase();
            if (letra.length() > 0) {
                char primeiraLetra = letra.charAt(0);
                boolean letraEncontrada = false;

                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == primeiraLetra) {
                        palavraEscondida[i] = primeiraLetra;
                        letraEncontrada = true;
                    }
                }

                if (!letraEncontrada) {
                    tentativas++;
                    System.out.println("Letra incorreta! Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
                }
            }
        }

        if (palavraCompleta(palavraEscondida)) {
            System.out.println("\nParabéns! Você acertou a palavra: " + palavra);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        } else {
            System.out.println("\nVocê perdeu! A palavra correta era: " + palavra);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

    private static char[] criarPalavraEscondida(String palavra) {
        char[] palavraEscondida = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            if (Character.isLetter(palavra.charAt(i))) {
                palavraEscondida[i] = '_';
            } else {
                palavraEscondida[i] = palavra.charAt(i);
            }
        }

        return palavraEscondida;
    }

    private static boolean palavraCompleta(char[] palavraEscondida) {
        for (char c : palavraEscondida) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
