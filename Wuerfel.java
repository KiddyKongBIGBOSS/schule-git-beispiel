//import java.util. *;

/**
 * Klasse Wuerfel nach Beschreibung
 * 
 * @author David Tepasse
 * @version 01
 */

public class Wuerfel
{
   /**
    * Attribut der Klasse Wuerfel:
    */
  // Anfang Attribute
    private int punkte;
  // Ende Attribute

    /**
     * Konstruktor fuer Objekte der Klasse Wuerfel:
     */
    public Wuerfel()
    {
        // initialisiert die Augenzahl mit 0 
        punkte = 0;
    }
  // Anfang Methoden
   
   /**
    * Diese Methode gibt die gewuerfelte Augenzahl zurueck.
    */
   public int punktzahlAngeben ()
   {
      return this.punkte;
   }
   
   /**
    * Diese Methode liefert einen Zufallswert zwischen 1 und maximum 
    */
   
   private int zufallsZahlAusgeben(int maximum)
   { 
      int wert=0;
      wert =(int)Math.round(Math.random()*(maximum-1))+1;
      return wert;
   }

   /**
    * laesst den Wuerfel rollen
    */
   public void rollen ()
   {
      this.punkte = zufallsZahlAusgeben(6);
   }
  // Ende Methoden

}

