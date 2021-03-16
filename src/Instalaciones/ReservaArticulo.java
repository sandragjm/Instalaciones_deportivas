package Instalaciones;

/**
 * Esta clase, RESERVAARTICULO, es descendiente de la clase RESERVA.
 * En ella se describe la cantidad de articulos y el articulo que se reserva.
 *
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class ReservaArticulo extends Reserva{

    /** La variable cantidad de tipo interger define la cantidad */
    public Integer cantidad;
    /** La variable articulo de tipo articulo define el artículo que
     *  se reserva */
    Articulo articulo;
}
