import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);

        cuenta.consultarSaldo();

        cuenta.depositar(500);
        cuenta.retirar(200);

        cuenta.consultarSaldo();
    }//CUENTA ARGS
}//CIERRA MAIN

class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
        }
        else {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null,"Titular: " + titular);
        JOptionPane.showMessageDialog(null,"Saldo: " + saldo);
    }
}