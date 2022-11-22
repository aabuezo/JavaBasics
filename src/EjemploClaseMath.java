public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(2.1);
        System.out.println("techo = " + techo);

        double piso = Math.floor(2.9);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);
        entero = Math.round(3.49);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90.0);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));


    }
}
