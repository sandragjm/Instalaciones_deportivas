package Instalaciones;


import java.util.Date;
import java.util.List;

/**
 * La clase RESERVA tiene como objetivo describir las reservas
 * de dicho centro y pueden ser de varios tipos, teniendo reservas
 * de instalaciones o de articulos. En la reserva se describe el id,
 * a fecha de dicha reserva y la hora de inicio y final de dicha reserva.
 * @author Sandra
 * @version 1.0
 * @since 2021
 */

public class Reserva {

    /** La variable id es un Interger que identifica cada reserva realizada */
    public Integer id;
    /** La variable fecha describe la fecha en la que se ha realizado la reserva*/
    public Date fecha;
    /** La variable horaInicio, describe a qué hora se inicia esa reserva */
    public Date horaInicio;
    /** La variable horaFin, describe a qué hora finaliza esa reserva */
    public Date horaFin;
    /** La variable socioReserva es una lista de todos los socios que han
     * realizado una o varias reservas */
    List<Socio> socioReserva;
}
