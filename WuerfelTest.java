public class WuerfelTest {
  public static void main(String[] args) {
    Wuerfel wurfel = new Wuerfel();
    long[] statistik = new long[10 + 2];
    for (int i = 0; i < Short.MAX_VALUE; i++) {
      wurfel.rollen();
      int augenzahl = wurfel.punktzahlAngeben();
      statistik[augenzahl - 1]++;                 
      statistik[10]++;              
      statistik[11] += augenzahl;  
    }
    System.out.println("Gewuerfelte zahlen: ");
    for (int i = 0; i < 10; i++) {
    System.out.println((i + 1) + ": " + statistik[i]);
    }
    System.out.println("Gesamt: " + statistik[10]);
    System.out.println("Gesamt (Augenzahl):" + statistik[11]);  
    System.out.println("Durchnitt (Augenzahl pro Wurf):" + (((double) statistik[11]) / statistik[10])); 
    System.out.println("Durchnitt (Wurf pro Augenzahl):" + (((double) statistik[10]) / statistik[11]));
  }
}
