import javax.swing.*;
public class Ejercicio_03 {
    public int[] Reporte(int[] lista_tiempos){
        int participantes = lista_tiempos.length;

        int menor_tiempo = lista_tiempos[0], mayor_tiempo = lista_tiempos[0];

        for (int i = 0; i < lista_tiempos.length; i++){
            if (lista_tiempos[i] < menor_tiempo){
                menor_tiempo = lista_tiempos[i];
            }
            if (lista_tiempos[i] > mayor_tiempo){
                mayor_tiempo = lista_tiempos[i];
            }
        }
        int[] resultado = {participantes, mayor_tiempo, menor_tiempo};
        return resultado;
    }
    public static void main(String[] args){
        Ejercicio_03 info = new Ejercicio_03();


        int[] lista_tiempos = { 18, 29, 22, 25, 16, 26, 21, 23, 20, 27, 24, 19, 28, 17, 30, 22, 25, 21, 18,
                26, 23, 20, 29, 17, 27, 24, 19, 28, 22, 25, 21, 17, 18, 26, 23, 20, 29, 24, 19, 27, 22,
                25, 18, 28, 21, 17, 23, 20, 26, 24, 19, 27, 22, 25, 17, 28, 21, 18, 29, 23, 20, 26, 24,
                19, 22, 25, 17, 27, 21, 18, 29, 23, 20, 26, 24, 19, 28, 22, 25, 17, 21, 18, 27, 23, 20, 29,
                24, 19, 26, 22, 25, 17, 28, 21, 18, 23, 20, 27, 24, 19, 29, 22, 25, 17, 28, 21 };
        int[] datosReporte = info.Reporte(lista_tiempos);
        JOptionPane.showMessageDialog(null, "Participantes: " + datosReporte[0] + "\nMayor Tiempo: " + datosReporte[1] + "\nMenor Tiempo: " + datosReporte[2]);
    }
}
