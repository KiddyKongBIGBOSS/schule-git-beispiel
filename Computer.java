/**
  * Ein Hochmoderner Computer für das Spiel "verflixte Spieben".
  */
public class Computer extends Spieler {
  
  /**
    * Konstruktor fuer Objekte der Klasse Computer:
    */
  public Computer(Wuerfel pWuerfel1, Wuerfel pWuerfel2, Topf pTopf) {
    super(pWuerfel1, pWuerfel2, pTopf);
  }                                    
  
  /**
    * Der Computer beginnt. Der Computer würfelt nach seiner vorprogrammierten Taktik so
    * lange, bis eines der folgenden Bedingungen erfüllt ist:
    * - Der Spieler kann nicht weiter speilen.
    * - Der Spieler hat eine verhältnismäßig hohe Punktzahl ( > 15 Punkte / Wurf)
    */
  public void spielBeginnen() {
    boolean weiterspielen = true;
    while (weiterspielen) { 
      super.wuerfeln();
      weiterspielen = false;
      if (super.getKannSpielen()) { // Nur wenn wir Würfeln können würfeln wir.
        double punkteSchnitt = ((double) super.punktestandAngeben()) / super.wurfAnzahlAngeben();
        if (punkteSchnitt <= 14) {
          // Wenn wir nicht eine hohe Punktzahl haben, sollte man noch einmal Würfeln.
          weiterspielen = true;
        }
      }
    }
  }
      
  /**
    * Der Gegner fängt an und hat schon bereits gewürfelt. Der Computer würfelt
    * solange bis die Punktzahl des Gegners erreicht wurde oder der Computer nicht
    * mehr Würfel kann/darf.
    */
  public void alsZweiterSpielen(int punkteGegener, int wurfzahlGegner) {
    boolean weiterspielen = true;
    while (weiterspielen) { 
      super.wuerfeln();
      weiterspielen = false;
      if (super.getKannSpielen()) { // Nur wenn wir Würfeln können würfeln wir.
        if (punkteGegener > super.punktestandAngeben() && wurfzahlGegner > super.wurfAnzahlAngeben()) {
          weiterspielen = true;
        }
      }
    }
  }
}
