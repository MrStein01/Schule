package aufgabe1;


/**
 * Write a description of class Sitzplatz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sitzplatz
{
    // instance variables - replace the example below with your own
    private static int nummer = 1;
    private int platznummer;
    public boolean belegt;

    /**
     * Constructor for objects of class Sitzplatz
     */
    public Sitzplatz()
    {
        // initialise instance variables
        platznummer = nummer;
        nummer++;
        belegt = false;
    }
}
