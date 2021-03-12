
package Errores;

public class Errores {

    //Metodos
    
    //metodo errorabsoluto
    public int eabsoluto (int valorreal, int valoraprox){
        double ea= valorreal - valoraprox ;
        return Math.abs((int) ea);
    }
   
    //metodo error relativo
    public double erelativo (double valoraprox, double valorreal){
        double er = ((valorreal - valoraprox) / valorreal);
        return  Math.abs(er);
    }
    
    //metodo error relativo porcentual
    public double erporcental (double valoraprox, double valorreal){
        double erp = ((valorreal - valoraprox) / valorreal);
        double erp1=erp*100;
        return Math.abs(erp1);
    }

}



/*Desarrollar una clase que contenga como nombre Errores con los métodos ErrorRelativo, ErrorAbsoluto, ErrorRelativoPorcentual.

La clase debe contener dos atributos privado valorReal y ValorAproximado.

Las funciones deben retornar el resultados.

Nota: Debe aplicar en la programación de funciones la reutilización de funciones.
*/

/*
ERROR ABSOLUTO= |P*-P|

ERROR RELATIVO =(|P*-P|)/P

ERROR RELATIVO PORCENTUAL = ER * 100

*/



