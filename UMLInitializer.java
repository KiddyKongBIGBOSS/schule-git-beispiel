public class UMLInitializer {
  private final Topf topf = new Topf();
  private final Wuerfel wuerfelEins = new Wuerfel();
  private final Wuerfel wuerfelZwei = new Wuerfel();
  private final Spieler spielerEins = new Computer(wuerfelEins, wuerfelZwei, topf);
  private final Spieler spielerZwei = new Computer(wuerfelEins, wuerfelZwei, topf);
  private final Schiedsrichter schiedsrichter = new Schiedsrichter(spielerEins, spielerZwei);
}
