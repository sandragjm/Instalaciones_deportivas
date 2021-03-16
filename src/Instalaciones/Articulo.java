package Instalaciones;

import java.util.List;

/**
 * Esta clase representa los ARTICULOS que son reservados
 * (pueden estar en varias reservas) en un centro.
 *
 * @version 1.0
 * @author Sandra Gonzalez
 * @since 2021
 */

public class Articulo {

    /** El valor codigo es un Interger para identificar ese articulo */
    public Integer codigo;
    /** El valor descripcion es un String para describir un articulo*/
    public String descripcion;
    /** el valor tipo es un TipoArticulo(enum) que clasifica de qué tipo es el articulo */
    public TipoArticulo tipo;
    /** El valor reserva es una lista de las reservas en las que puede estar dicho articulo */
    List<ReservaArticulo> reserva;
}
