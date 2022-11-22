public class EjemploArraysOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo) {

        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total -1; i++) {
            for (int j = 0; j < total -1 -i; j++) {
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0) { // < para ordenar de menor a mayor
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
                contador++;
            }
        }

        System.out.println("contador = " + contador);
    }

    public static void main(String[] args) {

        String[] personas = {"Juan", "Pedro", "Karla", "Andrés", "Erika", "Sandra", "Fernanda"};
        Integer[] numeros = {35, 12, -7, 0, 101, -33, 1024, -100};

        sortBurbuja(personas);
        for(var persona: personas) {
            System.out.println(persona);
        }

        sortBurbuja(numeros);
        for (var num: numeros) {
            System.out.println(num);
        }
    }
}
