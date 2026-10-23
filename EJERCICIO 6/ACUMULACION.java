import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int numero, suma = 0, contador = 0;
        double promedio;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero (negativo para terminar:)")
        );

        if (numero >= 0) {
            suma = suma + numero;
            contador++;
        }

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese otro numero:")
        );

        if (numero >= 0) {
            suma = suma + numero;
            contador++;
        }


        if (contador > 0) {
            promedio = (double) suma / contador;

            JOptionPane.showMessageDialog(null,
                    "Suma total: " + suma +
                            "\nPromedio: " + promedio);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se ingresaron numeros validos");
        }
    }
}