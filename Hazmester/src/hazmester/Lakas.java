
package hazmester;

public abstract class Lakas implements Ingatlan {
   protected double terulet;
   protected int szobaSzam;
   protected int lakok;
   protected int nmAr;

    public Lakas(double terulet, int szobaSzam, int lakok, int nmAr) {
        this.terulet = terulet;
        this.szobaSzam = szobaSzam;
        this.lakok = lakok;
        this.nmAr = nmAr;
    }
    
    public abstract boolean bekoltozik(int emberekSzama);

    public int lakokSzama(){
    
        return this.lakok;
    };
        
    @Override
    public int osszesKoltseg()
    {
    return (int)this.terulet * this.nmAr;
    };

    @Override
    public String toString() {
        return "Lakas terulete: " + terulet + " Szobaszam: " + szobaSzam + " Lakok szama: " + lakok + " Nm / Ár: " + nmAr + '}';
    }
    

}   
