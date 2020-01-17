
/**
 * Write a description of class Apuesta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Apuesta
{
    double dinero;
    double apuestaMin;

    /**
     * Constructor de la clase Apuesta.
     */
    public Apuesta()
    {
        
    }

    /**
     * Getters y setters de la clase Apuesta.
     */
    public void setDinero(double dinero)
    {
        this.dinero=dinero;
    }
    
    public void setApuestaMin(double apuestaMin)
    {
        this.apuestaMin = apuestaMin;
    }
    
    public double getApuestaMin()
    {
        return apuestaMin;
    }
    
    public double getDinero()
    {
        return dinero;
    }
    
}
