import java.util.Scanner;

public class EjemploArregloDetectarOrden {

    // para verificar si un arreglo es ascendente
    public static boolean isAsc(int[] a) {
        boolean asc = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i+1]) {
                asc = true;
            } else {
                asc = false;
                break;
            }
        }
        return asc;
    }

    // para verificar si un arreglo es descendente
    public static boolean isDesc(int[] a) {
        boolean desc = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                desc = true;
            } else {
                desc = false;
                break;
            }
        }
        return desc;
    }

    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros:");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        if (isAsc(a)) {
            System.out.println("El arreglo es ascendente");
        } else if (isDesc(a)){
            System.out.println("El arreglo es descendente");
        } else {
            System.out.println("El arreglo esta desordenado");
        }
    }
}
