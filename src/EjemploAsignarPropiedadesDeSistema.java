import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config2.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "mi valor para properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            //ps.list(System.out);
            System.out.println("Autor: " + ps.getProperty("config.autor.nombre"));

            String miPropiedad = System.getProperty("config.autor.email");
            System.out.println("email = " + miPropiedad);

        } catch (IOException e) {
            System.err.println("No existe el archivo: " + e);
            System.exit(1);
        }


    }
}
