public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = "Programacion Java";
        }
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso ".concat(curso));   // si curso es null lanza exception
        System.out.println("Bienvenido al curso " + curso);

        boolean esVacio = curso.length() == 0;
        if(!esVacio) {
            System.out.println("esVacio = " + esVacio);
            System.out.println("curso.isEmpty() = " + curso.isEmpty());
        }

        curso = " ";    // espacio en blanco
        System.out.println("curso.isBlank() = " + curso.isBlank());
    }
}
