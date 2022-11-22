import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

//        calendario.set(1974, Calendar.DECEMBER, 20, 13,0,0);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.DECEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 20);

        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);

//        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");   // formato 24hs por HH
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");   // formato 12hs por hh
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
