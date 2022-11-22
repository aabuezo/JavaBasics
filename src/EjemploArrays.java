import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {

        String[] personas = new String[8];
        personas[0] = "Juan";
        personas[1] = "Pedro";
        personas[2] = "Karla";
        personas[3] = "Franco";
        personas[4] = "Maria";
        personas[5] = "Elisabeth";
        personas[6] = "Jonathan";
        personas[7] = "Walter";

        // modifica el array original
        // Arrays es una clase de ayuda
        Arrays.sort(personas);

        for(var persona: personas) {
            System.out.println(persona);
        }
    }
}
