/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneraAleatorios;

import FuncionesAleatorio.Funciones;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JAVI
 */
public class Numerosall {

    /**
     * @param args the command line arguments
     */
    void Aleatorio() {
        // TODO code application logic here
        int n = 0, aux = 0;
        double[] s = new double[5], u = new double[5];

        System.out.println("Ingrese la semilla\n");
        Scanner leer = new Scanner(System.in);
        int d = leer.nextInt();

        s[0] = d;
        while (aux < 4) {
            n++;
            s[n] = Funciones.FuncionCambio(s[n - 1]);
            u[n - 1] = Funciones.FuncionSalida(s[n]);
            aux++;
        }
        System.out.println("\n NÚMEROS ALEATORIOS: \n");
        System.out.println(Arrays.toString(s) + "\n" + Arrays.toString(u) + "\n");
    }
}
