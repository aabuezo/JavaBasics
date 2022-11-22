public class ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);    // 0 ok, 1 excepcion, -1 error
        }
        for (String arg: args) {
            System.out.println("arg = " + arg);
        }
    }
}
