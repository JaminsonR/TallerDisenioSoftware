/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jamir
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;
    private float promedio;

    public Estudiante(String nombre, String apellido, String matricula, float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promedio = promedio;
    }
    
    public String getInfo(){
        return this.getNombre() + "|" + this.getApellido() + "|" + this.getMatricula();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
}
