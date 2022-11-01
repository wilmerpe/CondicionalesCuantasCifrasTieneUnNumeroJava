import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

        if(numero < 10){
            JOptionPane.showMessageDialog(null,"El numero " + numero + " tiene 1 cifra");
        }else if(numero < 100){
            JOptionPane.showMessageDialog(null,"El numero " + numero + " tiene 2 cifra");
        }else if(numero < 1000){
            JOptionPane.showMessageDialog(null,"El numero " + numero + " tiene 3 cifra");
        }else if(numero < 10000){
            JOptionPane.showMessageDialog(null,"El numero " + numero + " tiene 4 cifra");
        }else if(numero < 100000){
            JOptionPane.showMessageDialog(null,"El numero " + numero + " tiene 5 cifra");
        }

    }
}
