import java.util.Scanner;

public class MaiorEMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i+1) + "º numero: ");
            numeros[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > numeros[maior]) {
                maior = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < numeros[menor]) {
                menor = i;
            }
        }

        System.out.println("O maior número é: " + numeros[maior]);
        System.out.println("O menor número é: " + numeros[menor]);
        
    }
}
