/**
 * Der Schiedsrichter ist für den groben Spielfluss einer Runde zuständig.
 * Vor allem ist dieser für die Vorkonfiguration vor einer Runde und
 * das Auswerten innerhalb einer Runde zuständig.
 */
public class Schiedsrichter {
  
  /**
   * Der Spieler der in der derzeitigen Runde als erstes Würfelt.
   */
  private Spieler anfaenger;

  /**
   * Der Spieler der in derzeitigen Runde nach dem anfaenger Würfelt und
   * versuchen soll, ebenso viele oder mehr Punkte zu sammeln.
   */
  private Spieler nachfolger;
  
  /**
   * Konstruktor.
   */
  public Schiedsrichter(Spieler anfaenger, Spieler nachfolger) {
    this.anfaenger = anfaenger;
    this.nachfolger = nachfolger;
  }
  
  /**
   * Stößt eine neue Runde an.
   * Diese Methode erwartet, dass keine weitere Runde bereits im Gange ist
   * und setzt wie Wurfzahl und die Punktezahl des Spielers nicht zurück.
   */
  public void starteSpiel() {
    // TODO implement
  }
  
  /**
   * Gibt den Spieler zurück, der gewonnen hat.
   * Gewonnen hat der anfaenger, wenn der nachfolger weniger Punkte hat,
   * ansonsten gewinnt der nachfolger.
   */
  private Spieler findeSieger() {
    if (anfaenger.punktestandAngeben() <= nachfolger.punktestandAngeben()) {
      return nachfolger;
    } else {
      return anfaenger;
    }
  }
  
  /**
   * Wertet die Partie zum Schluss aus.
   * Der Gewinner bekommt den Inhalt des Topfs und die Wurf & Punktezahl
   * der Spieler werden zurückgesetzt.
   * Zudem werden die Rollen der Spieler vertauscht.
   */
  public void auswerten() {
    Spieler sieger = this.findeSieger();
    sieger.topfLeeren();
    anfaenger.zuruecksetzten();
    nachfolger.zuruecksetzten();
    
    Spieler temp = this.anfaenger;
    this.anfaenger = this.nachfolger;
    this.nachfolger = temp;
  }
}
