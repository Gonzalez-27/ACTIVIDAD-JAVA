import javax.swing.JOptionPane;

public class numerospar {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero entero:"));


        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par");
        } // cierra if
        else {
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }// cierra else


        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El numero es positivo");
        } else {
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El numero es negativo");
            } else {
                JOptionPane.showMessageDialog(null, "El numero es cero");
            }// CIERRA ELSE
        }// CIERRA ELSE IF
    }// CIERRA ARGS
}// CIERRA PUBLIC