
package mascotapp_ii.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp_ii.entidades.Mascota;
import mascotapp_ii.excepciones.MascotaException;

public class ServicioMascota {
    
        //useDelimiter("\n"): se utiliza para crear espacio entre las preguntas planteadas.
    
    private Scanner leer; // La instanciación "new Scanner (System.in).useDelimiter("\n"), se pasa para el Constructor.
    private List<Mascota> mascotas; //Se debe crear como ArrayList, sin embargo, esta es otra forma de crearlo, teniendo en cuenta que  List es el "padre" de ArrayList.
                                   //Se cambia el tipo de dato"String", por "Mascota". Ejemplo 2.     
    public ServicioMascota() {
        this.leer = new Scanner (System.in).useDelimiter("\n"); //Se inicializa desde el Constructor. Método más profesional.
        this.mascotas = new ArrayList(); //ArrayList se inicializa desde el Constructor.
    }
//    
//    private ArrayList<Mascota> listaMascota = new ArrayList();
//    
//    public ArrayList<Mascota> getListMascota(){
//        return listaMascota;
//    }
//    
//    public void setListmascota() {
//        this.listaMascota = listaMascota;
//    }
    
    public void crearMascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, 
            String raza) throws MascotaException{
        
        try {
            if (nombre.isEmpty()) {
                throw new MascotaException("Debe indicar el nombre de la mascota.");
            }
            if (apodo.isEmpty()) {
                throw new MascotaException("Debe indicar el apodo de la mascota.");
            }
            if (tipo.isEmpty()) {
                throw new MascotaException("Debe indicar el tipo de  mascota.");
            }
            if (color.isEmpty()) {
                throw new MascotaException("Debe indicar el color de la mascota.");
            }
            if (edad <= 0.0) {
                throw new MascotaException("La edad no puede ser cero.");
            }
            if (raza.isEmpty()) {
                throw new MascotaException("Debe indicar la razza de la mascota.");
            }
            
            Mascota mascota = new Mascota();
            
            mascota.setNombre(nombre);
            mascota.setApodo(apodo);
            mascota.setTipo(tipo);
            mascota.setColor(color);
            mascota.setEdad(edad);
            mascota.setRaza(raza);
            
            
        } catch (MascotaException e) {
            throw e;
        }catch (Exception e){
            e.printStackTrace();
            throw new MascotaException("Error en el sistema");
        }
            
    }
    
    public Mascota crearMascota(){// Se reemplaza la palabra "Mascota" por "void" para efectos de ejemplo(1).
        
        System.out.println("Introducir el nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir el apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir el tipo");
        String tipo = leer.next();
        
        //Mascota m = new Mascota(nombre, apodo, tipo);
        //return m;
        //Los reglones 21 y 22, se pueden unir de la siguiente manera:
        
//        return new Mascota(nombre, apodo, tipo); Para efectos de ejemplo(1) se cambia el método a "void".
        
//        String mascota = nombre + " " + apodo + " " + tipo; //Se comenta para ejemplo 2.

//        mascotas.add(mascota); //En ejemplo 2, se cambia el méstodo, se ingresa de nuevo el "retun".

//        return new Mascota(nombre, apodo, tipo);//Se modifica el "return". Ejemplo 2. Adicional se añade creación de variable "m".

//        Mascota m = new Mascota(nombre, apodo, tipo);// Ejemplo 3. Se craa un método nuevo para "agregar" mascota.
//        mascotas.add(m);
//        return m;
            
        return new Mascota(nombre, apodo, tipo);
    }
    
    public void agregarMascota(Mascota m){ // Ejemplo 3. Se crea este método para realizar función que "Mascota m" en ejemplo 2.
        mascotas.add(m);
    }
    
    public void mostrarMascota(){
        
        System.out.println("Las mascotas actuales de la lista son: ");
        
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
    }
    /**
     ** Crear mascotas TODOS Peques.
     * @param cantidad equivale a la cantidad de mascotas a crear o añadir a la lista.
     */
    public void fabricaPeques(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Toro", "Boca", "Perro"));
        }
    }
    
    /**
     * Crear mascotas pidiendo datos por teclado.
     */
    public void fabricaMascota (int cantidad){
        for (int i = 0; i <cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada); // Ejemplo 3.
            
            System.out.println(mascotaCreada.toString());
        }
    }
            
//    //TODO (significa "hacer"). Agregar Try and Catch. 
//    public void actualizarMascota(int index){//Una manera de realizar método de Actualización. Poco ortodoxo.
//        Mascota m = mascotas.get(index);
//        m.setApodo("Toño");

    public void actualizarMascota(int index){
        
        if (index <= (mascotas.size()-1)) {
            System.out.println("");
        System.out.println("-----------Actualizar-----------");
        
        Mascota m = crearMascota();
        mascotas.set(index, m);
        }else{
            System.out.println("Fallo al aliminar. El índice está errado");
        } 
    }
    
    public void eliminarMascota (int index){
     
        if (index <= (mascotas.size()-1)) {
               mascotas.remove(index);
        }else{
            System.out.println("Fallo al aliminar. El índice está errado");
        } 
    }
}
