/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp_ii.excepciones;

/**
 *
 * @author USUARIO
 */
public class MascotaException extends Exception {

    /**
     * Creates a new instance of <code>MascotaException</code> without detail
     * message.
     */
    public MascotaException() {
    }

    /**
     * Constructs an instance of <code>MascotaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MascotaException(String msg) {
        super(msg);
    }
}
