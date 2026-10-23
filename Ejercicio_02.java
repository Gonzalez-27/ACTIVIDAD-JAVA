import javax.swing.*;
public class Ejercicio_02 {
    public static void main(String[] args) {
        Ejercicio_02 Compra = new Ejercicio_02();

        int[] lista_precios = { 2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400, 7500, 2200, 8900, 1200, 5600, 9800, 4300, 1500, 6700, 2100, 13400, 3200, 4800, 9200, 16000, 700, 2600, 8100, 5400, 3900, 11000, 600, 1700, 14500, 8800, 2300, 5100, 9400, 12000, 2900, 3600, 2000, 7800, 4100, 6500, 10200, 500, 1400, 8700, 15600, 3300, 2700, 9600, 1800, 4200, 6900, 11800, 2400, 5300, 9100, 1000, 3400, 7600, 1300, 8400, 14700, 2800, 4600, 9900, 6100, 17000, 900, 1900, 5700, 8200, 2500, 13500, 4400, 6800, 10500, 3100, 3800, 7200, 1600, 8600, 12500, 2100, 4900, 9300, 5900, 11500 };

        Compra.Reporte(lista_precios);



    }
    public void Reporte(int[] lista_precios){
        double suma = 0, mayor = lista_precios[0], menor = lista_precios[0];
        for (int i = 0; i < lista_precios.length; i++) {
            suma += lista_precios[i];
            if  (lista_precios[i] > mayor) {
                mayor = lista_precios[i];
            }
            if (lista_precios[i] < menor) {
                menor = lista_precios[i];
            }
        }
        JOptionPane.showMessageDialog(null,
                "Suma total: " + String.format("%,.2f", suma) +
                        "\nMás Caro: " + String.format("%,.0f", mayor) +
                        "\nMenos Caro: " + String.format("%,.0f", menor)
        );
    }
}
