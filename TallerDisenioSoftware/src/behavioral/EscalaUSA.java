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
public class EscalaUSA implements IEscalaExtranjera{

    @Override
    public String ConvertirCalificacion(Float c) {
        String mensajeCalificacion= "";
        double calificacion= c;
        String calificacionUsa="";
        if(calificacion>=7){
            mensajeCalificacion+="Aprobado\n";
            if(calificacion>=7 && calificacion<=7.5){
                calificacionUsa="D";
            }
            else if(calificacion>7.5 && calificacion<=8.0){
                calificacionUsa="C";
            }
            if(calificacion>=8 && calificacion<=8.5){
                calificacionUsa+="-B";
                mensajeCalificacion+="Muy bueno";
            }
            else if(calificacion>8.5 && calificacion<=9.0){
                calificacionUsa="+B";
                mensajeCalificacion+="Muy bueno";
            }
            else if(calificacion>9.0 && calificacion<9.5){
                calificacionUsa="-A";
                mensajeCalificacion+="Sobresaliente";
            }
            else if(calificacion>=9.5 && calificacion<10){
                calificacionUsa="+A";
                mensajeCalificacion+="Sobresaliente";
            }
            else if(calificacion==10){
                calificacionUsa="A";
                mensajeCalificacion+="Excelente";
            }
        }
        else{
            mensajeCalificacion+="Reprobado";
        }
        return mensajeCalificacion;
    
    }
    
}
