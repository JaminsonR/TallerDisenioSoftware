/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import behavioral.*;


/**
 *
 * @author jamir
 */
public class MenuCalificaciones extends MenuDecorator {

    private IEscalaExtranjera escala;

    public MenuCalificaciones(MenuOpciones i) {
        super(i);
    }
    
    public String convertir(Float calif, String pais){
        escala = null;
        if (pais.equals("USA")){
            escala = new EscalaUSA();
        }else if(pais.equals("Alemania")){
            escala = new EscalaAlemania();
        }
        return escala.ConvertirCalificacion(calif);
    }
    
    @Override
    public String ejecutarOpciones(int op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
