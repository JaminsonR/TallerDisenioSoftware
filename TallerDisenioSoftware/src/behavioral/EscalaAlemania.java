/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral;

/**
 *
 * 
 */
public class EscalaAlemania implements IEscalaExtranjera {

    @Override
    public String ConvertirCalificacion(Float c) {
        String mensajeCalificacion= "";
        double calificacion= c/2.5;
        if(calificacion>=1 && calificacion<=4){
            mensajeCalificacion+="Aprobado\n";
            if(calificacion>=1.4 && calificacion<=2.0){
                mensajeCalificacion+="Muy bueno";
            }
            else if(calificacion>=1.1 && calificacion<=1.3){
                mensajeCalificacion+="Sobresaliente";
            }
            else if(calificacion<1.1 && calificacion>=1){
                mensajeCalificacion+="Excelente";
            }      
        }
        else{
            mensajeCalificacion+="Reprobado";
        }
        return mensajeCalificacion;
    }
    
}
