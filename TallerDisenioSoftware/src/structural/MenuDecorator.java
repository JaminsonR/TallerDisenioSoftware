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
public abstract class MenuDecorator implements MenuOpciones{
    private MenuOpciones menu;
    protected Scanner sc = new Scanner(System.in);
    
    public MenuDecorator(MenuOpciones i){
        this.menu = i;
    }
    
   
    public void mostrarOpciones(){
        this.menu.mostrarOpciones();
        
    }
    
    public String matricula(){
        String matricula = "none";
        String flag = "2";
        while(flag.equals("2")){
            System.out.println("Ingrese el numero de matricula del estudiante: ");
            matricula = sc.nextLine();
            System.out.println("Usted ha ingresado el numero de matricula "+ matricula+". Es este numero correcto?\nIngrese 1 para confirmar 2 para volverlo a intentar: ");
        }
        return matricula;
    }
    public abstract String ejecutarOpciones(int op);
}
