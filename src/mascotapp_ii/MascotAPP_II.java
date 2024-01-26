
package mascotapp_ii;

import mascotapp_ii.entidades.Mascota;
import mascotapp_ii.excepciones.MascotaException;
import mascotapp_ii.servicios.ServicioMascota;

public class MascotAPP_II {

    public static void main(String[] args) {
     
        ServicioMascota sm = new ServicioMascota();
        
//       Mascota m1 = sm.crearMascota();
//        
//       System.out.println(m1.toString());

        try {
            sm.crearMascota("Toto", "tato", "Moro", "café", 10, true, "Toro");
            sm.crearMascota("Toto", "", "Moro", "café", 10, true, "Toro");
            
        } catch (MascotaException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
