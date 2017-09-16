/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneraAleatorios;

/**
 *
 * @author JAVI
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JAVI PEDRAZA SALINAS
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int n = 0, aux = 0;
        double[] x = new double[7], y = new double[7];
        x[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuál va a ser la entrada "));
        while (aux < 6) {
            n++;
            x[n] = operacion(x[n - 1]);
            y[n - 1] = exit(x[n]);
            aux++;
        }

        JOptionPane.showMessageDialog(null, "Aleatoreidad en x " + Arrays.toString(x) );//+ "\n" + "Numeros en U: " + Arrays.toString(x));
        JOptionPane.showMessageDialog(null, "Aleatoreidad en u " + Arrays.toString(x) );
    }

    public static double operacion(double n) {
        return (n + 2) / Math.pow(n, 2);
    }

    public static double exit(double n) {
        return n / 33;
    }
    
}