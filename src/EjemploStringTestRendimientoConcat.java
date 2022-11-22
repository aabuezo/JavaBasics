public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
//            c = c.concat(a).concat(b).concat("\n");     // 500 => 1ms; 1000 => 3ms; 10.000 => 164ms; 100.000 => 6092ms
//            c += a + b + "\n";  // 500 => 35ms; 1000 => 30ms; 10.000 => 87ms; 100.000 => 2407ms
            sb.append(a).append(b).append("\n");  // 500 => 0ms; 1000 => 0ms; 10.000 => 1ms; 100.000 => 9ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println((fin-inicio)+" ms.");

        System.exit(0);
    }
}
