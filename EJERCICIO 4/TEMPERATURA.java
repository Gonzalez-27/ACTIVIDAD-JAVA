import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Constantes explicativas
        final double FACTOR_CONVERSION = 9.0 / 5.0;
        final double AJUSTE_FAHRENHEIT = 32.0;

        // Pedir la temperatura en Celsius
        String entrada = JOptionPane.showInputDialog(
                "Ingrese la temperatura en grados Celsius:");

        // Convertir el texto a número
        double celsius = Double.parseDouble(entrada);

        // Calcular Fahrenheit
        double fahrenheit =
                (celsius * FACTOR_CONVERSION) + AJUSTE_FAHRENHEIT;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(
                null, "Temperatura en Celsius: " + celsius + " °C\n"
                        + "Temperatura en Fahrenheit: " + fahrenheit + " °F");
    }// CIERRA ARGS
}// CIERRA MAIN