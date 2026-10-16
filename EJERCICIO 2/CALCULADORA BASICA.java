import javax.swing.JOptionPane;

public class CalculadoraBasica {
    public static void main(String[] args) {

        double num1, num2, resultado;
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "CALCULADORA BASICA\n\n" +
                        "1. Suma\n" +
                        "2. Resta\n" +
                        "3. Multiplicacion\n" +
                        "4. Division\n\n" +
                        "Seleccione una opcion:"));

        num1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el primer numero:"));

            num2 = Double.parseDouble(
                    JOptionPane.showInputDialog("Ingrese el segundo numero:"));

        if (opcion == 1) {
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null,
                    "La suma es: " + resultado);

        }// CIERRA OPCION 1 IF
        else if (opcion == 2) {
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null,
                    "La resta es: " + resultado);

            } // CIERRA OPCION 4 ELSE IF
        else if (opcion == 3) {
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null,
                        "La multiplicacion es: " + resultado);

            }// CIERRA ELSE IF OPCION 3
        else if (opcion == 4) {

            if (num2 != 0) {
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null,
                        "La division es: " + resultado);

            }// CIERRA IF OPCION 4
        }// CIERRA ELSE IF OPCION 4
    }// CIERRA ARGS
}// CIERRA PUBLICS CLASS
