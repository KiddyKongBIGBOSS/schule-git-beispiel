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
  * Eine Person kennt zwei Wuerfel und den Topf:
  */ 
 
   private   Wuerfel wuerfel1;
   private   Wuerfel wuerfel2;
   private   Topf topf;
   
  /** 
  * Hier folgen die Attribute der Klasse Person:
  */
  
   private String name;
   private int punkte;
   private int vermoegen;
   private int wurfAnzahl;

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
    * (Hier fehlen die Kommentare. Das ist Ihre Aufgabe:.........)
    */
   public void topfLeeren ()
   {
        this.vermoegen = this.vermoegen + this.topf.einsatzAbgeben();
        this.punkte = 0;
        this.wurfAnzahl = 0;
   }

   /**
    * 
    */
   public int wurfAnzahlAngeben ()
   {
      return this.wurfAnzahl;
   }

   /**
    * 
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
    * 
    */
   public void wuerfeln ()
   {
         wuerfel1.rollen();
         wuerfel2.rollen();
         this.punkte = this.punktestandAngeben()+wuerfel1.punktzahlAngeben()+wuerfel2.punktzahlAngeben();
         this.wurfAnzahl++;
    }
 
   /**
    * 
    */
   public void setName (String neuerName)
   {
         this.name = neuerName;
   }
}

