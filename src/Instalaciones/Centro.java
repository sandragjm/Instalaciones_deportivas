package Instalaciones;

import java.util.List;

/**
 * Esta clase representa el CENTRO del que se trata.
 * Aquí se describe su nombre, las instalaciones y los socios
 * que posee.
 *
 * @version 1.0
 * @author Sandra Gonzalez
 * @since 2021
 */

public class Centro {

    /** Esta variable String representa al nombre del centro*/
    public String nombre;
    /** La variable instalaciones es una lista de las instalaciones que tiene el centro*/
    List<Instalacion> instalaciones;
    /** La variable socios es una lista de las socios que tiene el centro */
    List<Socio> socios;
}
