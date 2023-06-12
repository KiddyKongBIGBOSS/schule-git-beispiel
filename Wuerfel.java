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
      // Anstatt wert = (int) Math.round(Math.random()*(maximum-1)) + 1;
      // Die variante mit Math#round führt dazu, dass 1 und 6 halb so wahrscheinlich wie alle anderen Zahlen sind. So funktioniert aber kein Würfel.
      wert =(int)Math.floor(Math.random()*maximum)+1;
      return wert;
   }

   /**
    * laesst den Wuerfel rollen
    */
   public void rollen ()
   {
      this.punkte = zufallsZahlAusgeben(10);
   }
  // Ende Methoden

}

