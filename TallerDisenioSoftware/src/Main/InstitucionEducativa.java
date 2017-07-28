/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Map;
import structural.MenuOpciones;

/**
 *
 * @author jamir
 */
public class InstitucionEducativa {
    private String nombre;
    private String provincia;
    private String canton;
    private String parroquia;
    private String zona;
    private int creada;
    private MenuOpciones menu;
    private Map estudiantes;

    public Map getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Map estudiantes) {
        this.estudiantes = estudiantes;
    }

    public InstitucionEducativa(String nombre, String canton, String parroquia, String zona, int creada, MenuOpciones menu) {
        this.nombre = nombre;
        this.canton = canton;
        this.parroquia = parroquia;
        this.zona = zona;
        this.creada = creada;
        this.menu = menu;
        this.estudiantes = null;
    }

    public String getInfo(){
        return "none";
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getCreada() {
        return creada;
    }

    public void setCreada(int creada) {
        this.creada = creada;
    }

    public MenuOpciones getMenu() {
        return menu;
    }

    public void setMenu(MenuOpciones menu) {
        this.menu = menu;
    }
    
    

}
