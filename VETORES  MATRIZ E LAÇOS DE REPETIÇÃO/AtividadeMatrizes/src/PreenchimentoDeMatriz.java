import java.util.Scanner;

public class PreenchimentoDeMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int coluna = 0;

        do {
            for (int i = 0; i < 3; i++) {
                System.out.println("Informe o valor da linha " + (i + 1) + " na coluna " + (coluna + 1));
                matriz[i][coluna] = sc.nextInt();
            }

            for (int i = 0; i < 1; i++) {
                coluna = coluna + 1;
            }

        } while (coluna < 3);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
