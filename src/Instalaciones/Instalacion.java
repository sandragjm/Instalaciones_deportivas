package Instalaciones;

import java.util.List;

/**
 * La clase INSTALACION tiene como objetivo describir las instalaciones
 * de dicho centro y se revela su nombre, el tipo de instalacion, el centro
 * que posee esta instalacion y sus reservas.
 * @author Sandra
 * @version 1.0
 * @since 2021
 */
public class Instalacion {

    /** Esta variable del tipo String revela el nombre de la instalacion*/
    public String nombre;
    /** La variable TipoInstalacion (enum) clasifica en un tipo la instalacion*/
    public TipoInstalacion tipo;
    /** La variable instalacionesreserva se trata de una lista de reservas
     * que tiene dicha instalacion*/
    List<ReservaInstalacion> instalacionReserva;
    /** La variable centro representa el centro donde se encuentra esta instalacion*/
    Centro centro;
}
