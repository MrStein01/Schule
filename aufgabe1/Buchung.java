package aufgabe1;


/**
 * Write a description of class Buchung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buchung
{
    // instance variables - replace the example below with your own
    private static int buchungsNr = 1;
	private int buchNr;
    private Flugzeug flugzeug;
    private Passagier passagier;
	private Sitzplatz sitzplatz;
	boolean erfolgreich;

    /**
     * Constructor for objects of class Buchung
     */
    public Buchung(Flugzeug flugzeug, Passagier passagier)
    {
        // initialise instance variables
        this.flugzeug = flugzeug;
		this.passagier = passagier;
		buchNr = buchungsNr;
		buchungsNr++;
		erfolgreich = false;
    }
    
    public void platzBuchung(Passagier passagier)
    {
        for(Sitzplatz platz : flugzeug.getPlaetze())
        {
            if(!platz.belegt)
            {
                platz.belegt = true;
                this.sitzplatz = platz;
                break;
            }
        }
    }
}
