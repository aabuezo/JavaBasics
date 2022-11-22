public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

//        for (int i = 0; i < numeros.length/2; i++) {
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.println(numeros[i] + " - " + numeros[numeros.length -1 -i]);
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
        }

        for (int j : a) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }
}
