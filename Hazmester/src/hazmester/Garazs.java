
package hazmester;


public class Garazs implements Berelheto, Ingatlan {
    private double terulet;
    private int nmAr;
    private boolean futottE;
    private int honapSzam;
    private boolean auto;

    public Garazs(double terulet, int nmAr, boolean futottE) {
        this.terulet = terulet;
        this.nmAr = nmAr;
        this.futottE = futottE;
        this.honapSzam = 0;
        this.auto = false;
    }

    @Override
    public int osszesKoltseg() {
        return (int)this.terulet*this.nmAr;
    }

    @Override
    public int mennyibeKerul(int honapokSzama) {
           return this.futottE? (int)Math.round(this.osszesKoltseg()*1.5)*honapokSzama:this.osszesKoltseg()*honapokSzama;
        
        
    }

    @Override
    public boolean lefoglaltE() {
        return (this.honapSzam>0) || auto;
    }

    @Override
    public boolean lefoglal(int honapokSzama) {
        if (!this.lefoglaltE()) {
            this.honapSzam+=honapokSzama;
            return true;
        }
        return false;
    }
   public void autoKiBeAll(){
       this.auto = !this.auto;
   }

    @Override
    public String toString() {
        return "Garázs területe: "+ terulet + " Nm / Ar: " + nmAr + " Futott: " + futottE + " Honapok szama: " + honapSzam + (this.auto?"All bent auto":" ");
    }
    
}
