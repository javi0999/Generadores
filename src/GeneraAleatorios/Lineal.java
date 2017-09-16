/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneraAleatorios;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author JAVI
 */
public class Lineal {


    protected void ObtenerProcesarDatos(){

        int m = 1;
        int semilla = 0;
        int adm = 0;
        int cons = 0;
        int mod = 0;
        String aux = "";

        boolean ban = false;

        //Captura de los datos iniciales para comenzar con la simulación  
        while (ban == false) {

            aux = JOptionPane.showInputDialog("Ingrese la semilla (Xo): ");

            try {
                semilla = Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor válido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (m == 1) {
                if (semilla != 0) {
                    ban = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La semillas debe ser > 0!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } 
        }

        ban = false;
        while (ban == false) {

            aux = JOptionPane.showInputDialog("Digite (a): ");

            try {
                adm = Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un valor valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (adm != 0) {
                ban = true;
            } else {
                JOptionPane.showMessageDialog(null, " (a) debe ser mayor a cero!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (m == 1) {
            ban = false;
            while (ban == false) {

                aux = JOptionPane.showInputDialog("Digite (b): ");
                try {
                    cons = Integer.parseInt(aux);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite un valor valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                if (cons != 0) {
                    ban = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La constante aditiva debe ser mayor a cero!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            cons = 0;
        }

        ban = false;
        while (ban == false) {
            aux = JOptionPane.showInputDialog("Digite el modulo: ");

            try {
                mod = Integer.parseInt(aux);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un valor valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            if (mod > semilla && mod > adm && mod > cons) {
                ban = true;
            } else {
                JOptionPane.showMessageDialog(null, "El mod (m) debe ser mayor a: (Xo) y (a)!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        System.out.print("\n");

        //Se generan los numeros aleatorios a partir de los datos ingresados por el usuario
        System.out.println("+-------------------------------------+");
        GenerarAleatorios(semilla, adm, cons, mod);
        System.out.print("\n");

       

    }// fin Obtener datos

    protected void GenerarAleatorios(int semilla, int adm, int constante, int mod) {

        if (constante == 0) {
            System.out.println("n\t " + "x(n)\t " + "a*x(n)\t " + "[a*x(n)] mod m");
        }
        if (constante > 0) {
            System.out.println("n\t " + "x(n)\t " + "a*x(n)+c\t " + "[a*x(n)+c] mod m");
        }

        int a = adm;
        int c = constante;
        int m = mod;
        int result_mod;
        int terc_col;
        int x = 0;
        boolean j = false;
        int n;

        for (n = 0; j == false; n++) {

            if (n == 0) {

                terc_col = ((semilla * a) + c);
                x = terc_col % m;
                System.out.println(n + "\t " + semilla + "\t " + terc_col + "\t\t " + x);

            } else if (n > 0) {
                terc_col = ((x * a) + c);
                result_mod = (terc_col % m);
                System.out.println(n + "\t " + x + "\t " + terc_col + "\t\t " + result_mod);
                x = result_mod;
            }

            if (x == semilla) {
                break;
            }

        }

        System.out.print("\n");
        
        JOptionPane.showMessageDialog(null, "A continuacion el resultado:");

        System.out.println("#################################");
        System.out.println("Periodo: " + (n + 1));
        System.out.println("#################################");

    }

}
