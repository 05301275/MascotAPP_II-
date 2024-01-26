
package mascotapp_ii.entidades;

import mascotapp_ii.interfaces.AccionMascota;

public final class Mascota<T> implements AccionMascota{
    
    private String nombre;
    private String apodo;
    // Conejo, Gato, Perro, Loro, Carpincho.
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    // Documentar parámetros: con /**.
    
    /**
     * Función destinada a pasear.
     * 
     * @param energiaRestar
     * @return energia.
     */
    
//    public int pasear (int energiaRestar){
//        
//        energia -= energiaRestar;
//        
//        return energia;
//    }
    
    /**
     * Función destinada a pasear por vueltas.    
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia.
     */
    public int pasear (int energiaRestar, int vueltas){
        
        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }
        
        return energia;
    }

    @Override
    public int molestarDueno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comerAlimento(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pasear(int cantidadVueltas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
