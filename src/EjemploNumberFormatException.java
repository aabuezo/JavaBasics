import javax.swing.*;

public class EjemploNumberFormatException {
    public static void main(String[] args) {

        try {
            String data = JOptionPane.showInputDialog("Ingrese un entero:");
            int intData = validarData(data);
            System.out.println(10/intData);
        } catch (NumberFormatException | ArithmeticException | ExcepcionPersonalizada nfe) {
            nfe.printStackTrace();
        } finally {
            System.out.println("finally block... we're done.");
        }
    }

    public static int validarData(String data) throws ExcepcionPersonalizada {
        int valor = Integer.parseInt(data);
        if (valor == 0) {
            throw new ExcepcionPersonalizada("No se puede dividir por cero.");
        }
        return valor;
    }
}

class ExcepcionPersonalizada extends Exception {
    public ExcepcionPersonalizada(String msg) {
        super(msg);
    }
}