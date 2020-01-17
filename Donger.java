
/**
 *
 * Carreras de Dongers
 *  Donger
 *  -numIdentificativo
 *  -posicion
 *  
 *  
 * -Apuesta
 *  -dinero
 *   doblar()
 *   pass()
 * 
 * -Gestor
 *  -Menu:
 *      1. Empezar nueva carrera
 *          *Comprobación de dinero(si es suficiente).
 *          *(true) Empieza la carrera
 *              generarDongers(Random)
 *              start() Mostrar panel
 *                  apuestaInicial()
 *              
 *          *(false) Mensaje de error
 *      2. Ingresar dinero
 *      3. Comprobar dinero
 *      4. Salir
 *      
 *  gestor-stage()
 *  apuesta()
 *  
 *
 *  Esta clase pretende generar objetos de tipo Donger.
 *  Serán los participantes en nuestra carrera.
 *  
 *  Tienen dos identificadores: 
 *  'int numIden': hace referencia al número identificativo de cada participante.
 *  'int posicion': hace referencia a la posición que tiene el participante en la carrera.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Donger
{
    int numIden;
    int posicion;
    /**
     * Constructor de la clase Donger.
     */
    public Donger(int numIden, int posicion)
    {
        this.numIden = numIden;
        this.posicion = posicion;
    }
    
    /**
     * Getters y setters de la clase Donger.
     */
    public void setPosicion(int posicion)
    {
        this.posicion=posicion;
    }
    public void setNumIden(int numIden)
    {
        this.numIden = numIden;
    }
    public int getPosicion()
    {
        return posicion;
    }
    public int getNumIden()
    {
        return numIden;
    }
}
