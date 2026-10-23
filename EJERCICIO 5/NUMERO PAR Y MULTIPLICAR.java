import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

                int numero, contador = 0, resultado;

                numero = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "INGRESE SU NUMERO"));

                resultado = numero * 1;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 2;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 3;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 4;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 5;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 6;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 7;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 8;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 9;
                if (resultado % 2 == 0) contador++;

                resultado = numero * 10;
                if (resultado % 2 == 0) contador++;

                JOptionPane.showMessageDialog(null,
                        "Cantidad de resultados pares: " + contador);
            }
        }