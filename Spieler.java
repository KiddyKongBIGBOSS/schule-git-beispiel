/**
 * Klasse Spieler mit Fehlern
 * 
 * @author David Tepasse
 * @version 01
 * 
 * in dieser Klasse ist ein Fehler. Sie stimmt nicht mit
 * der Beschreibung unseres Spiels ueberein! Finden und korrigieren sie ihn.
 * 
 */

 
public class Spieler  
{
 
   /**
     * Der erste Würfel, der vom Spieler verwendet wird.
     */
   private   Wuerfel wuerfel1;                          
   /**
     * Der zweite Würfel, der vom Spieler verwendet wird.
     */
   private   Wuerfel wuerfel2;
   /**
     * Der Topf, in dem der Spieler einzahlt.
     */
   private   Topf topf;
   
  /** 
  * Hier folgen die Attribute der Klasse Person:
  */
  
   private String name;
   
   /**
     * Die Punktzahl des Spielers in diesem Moment.
     * Die Punktzahl ist die Summe aller Augenzahlen, die in der aktiven
     * Runde getätigt wurden, abzüglich der 7 - sollte diese gewürfelt worden sein.
     */
   private int punkte;
  
   /**
     * Das Vermögen des Spielers.
     * Dies gibt an, was der Spieler maximal Einsetzten kann.
     */
   private int vermoegen;
 
   /**
    * Die Anzahl der Würfe, die der Spieler getätigt hat.
    */
   private int wurfAnzahl;
  
   /**
     * Gibt an, ob der Spieler würfeln kann.
     * Der Spieler wird nicht mehr Würfelfähig, sobald
     * dieser eine 7 gewürfelt hat. 
     */
   private boolean kannSpielen;

   /**
    * Konstruktor fuer Objekte der Klasse Spieler
    * Mit der folgenden Methode wird ein Objekt der Klasse Spieler hergestellt.
   */
    public Spieler(Wuerfel pWuerfel1, Wuerfel pWuerfel2, Topf pTopf)
    {
        this.wuerfel1 = pWuerfel1;
        this.wuerfel2 = pWuerfel2;
        this.topf = pTopf;
        this.vermoegen = 1000;
        this.kannSpielen = true;
    }

   /**
    * Die bis dahin erreichte Punktesumme wird zurueckgegeben.
    * 
    */
   public int punktestandAngeben ()
   {
       return this.punkte;
   }


   /**
    * Leert den Topf und fügt den Inhalt des Topfes dem
    * Vermögen des Spielers zu.
    */
   public void topfLeeren ()
   {
        this.vermoegen = this.vermoegen + this.topf.einsatzAbgeben();
        this.punkte = 0;
        this.wurfAnzahl = 0;
        this.kannSpielen = true;
   }

   /**
    * Gibt die Anzahl der bereits geleisteten Würfe an.
    */
   public int wurfAnzahlAngeben ()
   {
      return this.wurfAnzahl;
   }

   /**
    * Fügt einen gewissen Einsatz zu dem Topf zu.
    * Sollte der Einsatz größer als das verfügbare Vermögen sein,
    * wird der Einsatz auf das Vermögen beschränkt.
    */
   public void einsatzSetzen (int einsatz)
   {
    if (this.vermoegen < einsatz)
        {
            einsatz = this.vermoegen;
        } 
        this.topf.einsatzAufnehmen(einsatz);
        this.vermoegen=this.vermoegen-einsatz;
   }

   /**
    * Würfelt beide Würfel und addiert die kombinierte Punktanzahl beider Würfel
    * zu der Punktanzahl des Spielers hinzu.
    * Die Wurfzahl wird um genau 1 erhöht.
    *
    * Sollte die kombinierte Augenzahl genau 7 sein wird anstatt einer addition
    * eine subtraktion ausgeführt.
    *
    * Diese Methode tut nichts, wenn der Spieler nicht würfelfähig ist. 
    */
   public void wuerfeln ()
   {
      if (this.kannSpielen) {
         wuerfel1.rollen();
         wuerfel2.rollen();
         int inkrement = wuerfel1.punktzahlAngeben() + wuerfel2.punktzahlAngeben();
         if (inkrement == 11) {
           inkrement = -11;
           this.kannSpielen = false;
         }

         this.punkte = this.punktestandAngeben() + inkrement;
         this.wurfAnzahl++;
      }
   }

   /**
    * Legt den Namen des Spielers neu fest.
    */
   public void setName (String neuerName)
   {
         this.name = neuerName;
   }
}

