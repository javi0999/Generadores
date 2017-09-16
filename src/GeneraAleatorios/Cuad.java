/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneraAleatorios;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JAVI
 */
public class Cuad {
    
    static void NumC(){
        
        DecimalFormat dc = new DecimalFormat("#.####");
        
        int nu = 0;
        int cu = 0;
        int l = 0;
        int m = 0;
        double valorFinal = 0;
        String aux = "";
        String cad = "";
        String subCadena = "";
        
        aux = JOptionPane.showInputDialog("Ingrese la semilla: ");
        nu = Integer.parseInt(aux);
        
        cu = nu * nu;
        
        cad = String.valueOf(cu);
        
        l = cad.length();
        m = l / 2;
        
        if(l < 4){
            System.out.println("Este numero no es válido ingrese otro.");
        } else if (l == 4){
            subCadena = cad.substring(0,3);
            valorFinal = Integer.parseInt(subCadena) / 10000;
            System.out.println("Valor: "+valorFinal);
        } else if (l > 4){
            subCadena = cad.substring(m-2, m+2);
            valorFinal = Double.parseDouble(subCadena) / 10000;
            System.out.println("Valor: "+dc.format(valorFinal));
        }
        
    }
    
}
