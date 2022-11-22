import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        System.out.println("Listado de variables de entorno");
        for(String key: varEnv.keySet()) {
            System.out.println(key + "= " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2);


    }
}
