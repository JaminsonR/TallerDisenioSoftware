/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

/**
 *
 * @author jamir
 */
public abstract class MenuDecorator {
    private MenuOpciones menu;
    
    public MenuDecorator(MenuOpciones i){
        
    }
    
    public abstract String ejecutarOpciones(int op);
}
