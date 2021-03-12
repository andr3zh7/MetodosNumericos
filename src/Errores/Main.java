
package Errores;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String [] args){
        
        int valorreal = Integer.parseInt(JOptionPane.showInputDialog("digite el valor real: "));
        int valoraprox = Integer.parseInt(JOptionPane.showInputDialog("digite el valor aproximado: "));
        
        Errores error=new Errores();
        
        System.out.println("el valor del error absoluto es: "+error.eabsoluto(valorreal,valoraprox));
        System.out.println("el valor del error relativo es: "+error.erelativo(valorreal,valoraprox));
        System.out.println("el valor del error relativo porcentual es :"+ error.erporcental(valorreal, valoraprox)+"%");
        
        
    }
    
}
