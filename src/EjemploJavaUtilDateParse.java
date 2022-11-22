import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato (yyyy-MM-dd): ");
        try {
            // al ingresar en formato yyyy-MM-dd toma HH:mm:ss:SSS como 00:00:00:000
            Date fecha = formato.parse(s.next());
            System.out.println("fecha = " + fecha + " (ver HH:mm:ss:SSS)");
            System.out.println("formato = " + formato.format(fecha));

            Date fechaActual = new Date();
            System.out.println("fechaActual = " + fechaActual);

            // no da igual porque tiene en cuenta la hora, minutos, segundos y milisegundos
            // si bien toma el formato en String por simpleDateFormat,
            // se ve que compara los milisegundos a 1970
            if (fecha.after(fechaActual)) {
                System.out.println("Fecha " + formato.format(fecha) + " esta en el futuro");
            } else if (fecha.before(fechaActual)) {
                System.out.println("Fecha " + formato.format(fecha) + " esta en el pasado");
            } else if (fecha.equals(fechaActual)) {
                System.out.println("Esa es la fecha de hoy");
            }

            // no da igual porque tiene en cuenta la hora, minutos y segundos
            if (fecha.compareTo(fechaActual) > 0) {
                System.out.println("Fecha " + formato.format(fecha) + " esta en el futuro");
            } else if (fecha.compareTo(fechaActual) < 0) {
                System.out.println("Fecha " + formato.format(fecha) + " esta en el pasado");
            } else if (fecha.compareTo(fechaActual) == 0) {
                System.out.println("Esa es la fecha de hoy");
            }

            // verificacion de si toma los milisegundos para comparar
            long dif = fecha.getTime()-fechaActual.getTime();
            System.out.println(dif + " ms.");
            System.out.println("dif (dd): " + dif/1000/60/60/24);   // dias
            System.out.println("dif (HH): " + dif/1000/60/60);  // horas
            System.out.println("dif (mm)= " + dif/1000/60);     // minutos
            System.out.println("dif (ss)= " + dif/1000);        // segundos

        } catch (ParseException e) {
            //e.printStackTrace();
            //e.printStackTrace(System.out);
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            main(args);
        }

    }
}
