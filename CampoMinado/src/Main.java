import java.util.Random;
import java.util.Scanner;

public class Main {

    //0 vazio
    //1 bomba
    //2 percorrido
    static void GerarBombas(int[][] CampoMinado) {
        Random rng = new Random();
        int bombas = 0;

        while (bombas != 2) {
            int posBombaI = rng.nextInt(3);
            int posBombaJ = rng.nextInt(3);

            if (CampoMinado[posBombaI][posBombaJ] == 0) {
                CampoMinado[posBombaI][posBombaJ] = 1;
                bombas++;
            }
        }
    }

    static void LimparCampo(int [][] CampoMinado) {
        for (int i = 0; i < CampoMinado.length; i++) {
            for (int j = 0; j < CampoMinado.length; j++) {
                if (CampoMinado[i][j] == 2) {
                    CampoMinado[i][j] = 0;
                }
            }
        }
    }

    static int MostrarCampo(int [][] CampoMinado) {
        int cont = 0;
        for (int i = 0; i < CampoMinado.length; i++) {
            for (int j = 0; j < CampoMinado.length; j++) {
                if (CampoMinado[i][j] != 2) {
                    System.out.print("0 ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu = 1;
        boolean rodada;
        int entradaX, entradaY;

        System.out.println("Digite 1 para começar outro jogo");
        System.out.println("Digite qualquer outra coisa para finalizar");

        menu = scanner.nextInt();

        while(menu == 1) {
            rodada = true;
            int [][] CampoMinado = new int[3][3];
            GerarBombas(CampoMinado);

            while (rodada) {
                MostrarCampo(CampoMinado);
                System.out.println("Digite a posição X que deseja testar (1, 2 ou 3) : ");
                entradaX = scanner.nextInt();
                System.out.println("Digite a posição Y que deseja testar (1, 2 ou 3) : ");
                entradaY = scanner.nextInt();

                entradaX--;
                entradaY--;

                if (CampoMinado[entradaX][entradaY] == 0) {
                    System.out.println("Caminho correto!");
                    CampoMinado[entradaX][entradaY] = 2;
                } else if (CampoMinado[entradaX][entradaY] == 1) {
                    System.out.println("Escolheu uma bomba, reiniciando progresso!");
                    LimparCampo(CampoMinado);
                } else {
                    System.out.println("Esse caminho já foi escolhido, escolha outro!");
                }
            }

        }

    }
}