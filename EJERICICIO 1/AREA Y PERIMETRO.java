import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        float altura, base, area, perimetro;

        base = Float.parseFloat(
                JOptionPane.showInputDialog("Ingrese la base del rectangulo:"));

        altura = Float.parseFloat(
                JOptionPane.showInputDialog("Ingrese la altura del rectangulo:"));

        area = base * altura;
        perimetro = 2 * (base + altura);

        JOptionPane.showMessageDialog(null,
                "EL AREA DEL RECTANGULO ES: " + area);

        JOptionPane.showMessageDialog(null,
                "EL PERIMETRO DEL RECTANGULO ES: " + perimetro);

    }//CIERRA ARGS
}// CIERRA MAIN