public class WuerfelTest {
  public static void main(String[] args) {
    Wuerfel wurfel = new Wuerfel();
    long[] statistik = new long[8];
    for (int i = 0; i < Short.MAX_VALUE; i++) {
      wurfel.rollen();
      int augenzahl = wurfel.punktzahlAngeben();
      statistik[augenzahl - 1]++;                 
      statistik[6]++;              
      statistik[7] += augenzahl;  
    }
    System.out.println("Gewuerfelte zahlen: ");
    for (int i = 0; i < 6; i++) {
    System.out.println((i + 1) + ": " + statistik[i]);
    }
    System.out.println("Gesamt: " + statistik[6]);
    System.out.println("Gesamt (Augenzahl):" + statistik[7]);  
    System.out.println("Durchnitt:" + (((double) statistik[7]) / statistik[6]));
  }
}
