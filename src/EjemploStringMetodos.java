public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Alejandro";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Alejandro\") = " + nombre.equals("Alejandro"));
        System.out.println("nombre.equals(\"alejandro\") = " + nombre.equals("alejandro"));
        System.out.println("nombre.equalsIgnoreCase(\"Alejandro\") = " + nombre.equalsIgnoreCase("alejandro"));
        System.out.println("nombre.compareTo(\"Alejandro\") = " + nombre.compareTo("Alejandro")); // basado en la tabla Unicode
        System.out.println("nombre.compareTo(\"alejandro\") = " + nombre.compareTo("alejandro"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0, 3) = " + nombre.substring(0, 3));
        System.out.println("nombre.substring(6, nombre.length()) = " + nombre.substring(6, nombre.length()));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);   // el original no cambio
        System.out.println("trabalenguas.indexOf(\"i\") = " + trabalenguas.indexOf("i"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());

    }
}
