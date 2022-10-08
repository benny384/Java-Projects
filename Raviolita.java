package BG11;

 public class Raviolita {
 public static void main (String[] args) {

           final double PI = 3.141592;
           double u, h;

           u = 40; // geeignete Testwerte einbauen
           h = 15; // geeignete Testwerte einbauen

           // nachfolgend die fehlenden Deklarationen ergaenzen
           double dBoden;
           double fBoden;
           double fMantel;
           double fGesamt;
           double v;

           // nachfolgend die fehlenden Berechnungen ergaenzen
           
           dBoden  = u / PI;
           fBoden  = PI * (dBoden/2) * (dBoden/2);
           fMantel = u * h;
           fGesamt = 2 * fBoden + fMantel;
           v       = fBoden * h;

           // nachfolgend die fehlenden Ausgaben ergaenzen
           
        
           System.out.println("Umfang der Dose: " + u);
           System.out.println("Hoehe der Dose: " + h);
           System.out.println("Durchmesser des Dosenbodens: " + dBoden);
           System.out.println("Flaeche des Dosenbodens: " + fBoden);
           System.out.println("Mantelflaeche der Dose: " + fMantel);
           System.out.println("Gesamtflaeche der Dose: " + fGesamt);
           System.out.println("Volumen der Dose: " + v);
         }
 }
 

