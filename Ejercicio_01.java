import javax.swing.*;
import java.lang.reflect.Array;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Ejercicio_01 Calificacion = new Ejercicio_01();
        double[] listaNotas = {
                4.1, 4.8, 1.5, 2.3, 0.1, 0.9, 1.4, 1.8, 1.5, 3.0,
                2.7, 3.5, 4.0, 2.1, 1.9, 4.6, 3.8, 2.9, 0.5, 1.2,
                3.3, 4.9, 2.4, 3.1, 1.0, 4.2, 3.6, 2.8, 0.7, 1.6,
                2.0, 3.7, 4.4, 1.3, 0.8, 2.6, 3.9, 4.7, 1.1, 2.2,
                3.4, 4.5, 0.6, 1.7, 2.5, 3.2, 4.3, 1.9, 0.4, 2.8,
                3.6, 4.0, 1.4, 0.9, 2.1, 3.8, 4.6, 1.6, 0.3, 2.9
        };
        Calificacion.Reporte(listaNotas);
    }
    public void Reporte(double[] lista_notas) {
        double suma = 0, mayor = lista_notas[0], menor = lista_notas[0];

        for (int i = 0; i < lista_notas.length; i++) {
            suma = suma + lista_notas[i];

            if (lista_notas[i] > mayor) {
                mayor = lista_notas[i];
            }
            if (lista_notas[i] < menor) {
                    menor = lista_notas[i];
            }

        }
        double promedio = suma / lista_notas.length;
        JOptionPane.showMessageDialog(null, "Promedio: "+promedio+"\nMayor Nota: "+mayor+"\nMenos Nota: "+menor);
    }


}
