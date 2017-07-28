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
    
    Scanner sc = new Scanner(System.in);
    public MenuCertificado(MenuOpciones i) {
        super(i);
    }
    
    

    @Override
    public String ejecutarOpciones(int op) {
        String matricula;
        String flag = "2";
        while(flag=="2"){
            System.out.println("Ingrese el numero de matricula del estudiante: ");
            matricula = sc.nextLine();
            System.out.println("Usted ha ingresado el numero de matricula "+ matricula+". Es este numero correcto?\nIngrese 1 para confirmar 2 para volverlo a intentar: ");
        }
        return "none";
    }
    
}
