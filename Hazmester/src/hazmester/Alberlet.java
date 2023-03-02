
package hazmester;

public class Alberlet extends Lakas implements Berelheto {
    private int foglalHonapok;

    public Alberlet( double terulet, int szobaSzam, int nmAr) {
        super(terulet, szobaSzam, 0, nmAr);
        this.foglalHonapok = 0;
    }

    @Override
    public int mennyibeKerul(int honapokSzama) {
            return this.lakok ==0? -1 : (this.osszesKoltseg()/this.lakok)*honapokSzama;
    }

    @Override
    public boolean lefoglaltE() {
       return this.foglalHonapok !=0;
    }

    @Override
    public boolean lefoglal(int honapokSzama) {
        if (!this.lefoglaltE()) {
            this.foglalHonapok=honapokSzama;
            return true;
        }
        return false;
    }

    @Override
    public boolean bekoltozik(int emberekSzama) {
        if (( ((this.lakokSzama()+emberekSzama))/this.szobaSzam <=8) && (this.terulet/(this.lakokSzama() + emberekSzama))>=2) {
            this.lakok += emberekSzama;
            return true;
            
        }
        return false;
    
    
}

    @Override
    public String toString() {
        return super.toString()+  ", Hónapok száma: " + foglalHonapok;
    }
}