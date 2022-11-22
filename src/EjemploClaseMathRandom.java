import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println("random = " + random);

        random *= 6;
        System.out.println("random = " + random);

        random = Math.floor(random) + 1;
        System.out.println("random = " + random);

        String[] colores = {"azul", "rojo", "verde", "amarillo", "blanco", "negro"};
        int rnd = (int)Math.floor(Math.random() * colores.length);
        System.out.println("rnd = " + rnd);
        System.out.println(colores[rnd]);

        Random rndObj = new Random();
        int rndInt = 15 + rndObj.nextInt(10);   // entre 15 y 25 (sin incluir el 25)
        System.out.println("rndInt = " + rndInt);

        rndInt = rndObj.nextInt(colores.length);
        System.out.println("rndInt = " + rndInt);
        System.out.println(colores[rndInt]);

    }
}
