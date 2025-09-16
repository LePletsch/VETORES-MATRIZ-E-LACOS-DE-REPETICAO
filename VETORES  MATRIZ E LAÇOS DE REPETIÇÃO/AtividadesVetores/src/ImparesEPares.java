public class ImparesEPares {

    public static void main(String[] args) {

        int[] numeros = new int[15];
        numeros[0] = 1;
        numeros[1] = 22;
        numeros[2] = 34;
        numeros[3] = 45;
        numeros[4] = 58;
        numeros[5] = 61;
        numeros[6] = 73;
        numeros[7] = 80;
        numeros[8] = 98;
        numeros[9] = 100;
        numeros[10] = 11;
        numeros[11] = 27;
        numeros[12] = 53;
        numeros[13] = 49;
        numeros[14] = 15;

        System.out.println("Números Pares: ");
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Números Impares: ");
        for (int i = 0; i < 15; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
