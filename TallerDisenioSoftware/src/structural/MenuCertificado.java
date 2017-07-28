/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural;

import java.util.Scanner;

/**
 *
 * @author jamir
 */
public class MenuCertificado extends MenuDecorator {
    
   
    public MenuCertificado(MenuOpciones i) {
        super(i);
    }
    
    

    @Override
    public String ejecutarOpciones(int op) {
        return "none";
    }
    
}
