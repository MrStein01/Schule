package aufgabe1;
import java.util.*;

/**
 * Write a description of class Flugzeug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flugzeug
{
    // instance variables - replace the example below with your own
    private int nummer;
    private String name;
    private Gesellschaft gesellschaft;
    private ArrayList<Sitzplatz> plaetze;

    /**
     * Constructor for objects of class Flugzeug
     */
    public Flugzeug(int nummer, String name, Gesellschaft gesellschaft)
    {
        // initialise instance variables
        this.nummer = nummer;
        this.name = name;
        this.gesellschaft = gesellschaft;
        plaetze = new ArrayList();
    }
    
    public ArrayList<Sitzplatz> getPlaetze()
    {
        return plaetze;
    }
}
