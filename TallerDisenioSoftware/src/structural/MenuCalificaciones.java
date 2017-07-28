/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import behavioral.IEscalaExtranjera;

/**
 *
 * @author jamir
 */
public class MenuCalificaciones extends MenuDecorator {

    private IEscalaExtranjera escala;

    public MenuCalificaciones(MenuOpciones i) {
        super(i);
    }
    
    
    @Override
    public String ejecutarOpciones(int op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
