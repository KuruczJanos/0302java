
package hazmester;


public class CsaladiApartman extends Lakas {
    private int gyerekekSzama;

    public CsaladiApartman( double terulet, int szobaSzam, int nmAr) {
        super(terulet, szobaSzam, 0, nmAr);
        this.gyerekekSzama = 0;
    }
    public boolean gyerekSzuletik(){
        if((this.lakokSzama()-this.gyerekekSzama)>=2){
            this.gyerekekSzama++;
            this.lakok++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bekoltozik(int emberekSzama) {
        double szemelyekSzama = this.lakok-(0.5*(double)this.gyerekekSzama);
       if (((szemelyekSzama/this.szobaSzam)<=2) && ((this.terulet/szemelyekSzama)<=10)) {
            this.lakok+=emberekSzama;
            return true;
}
return false;




    }

    @Override
    public String toString() {
        return super.toString()+ ", Gyerekek szama: " + gyerekekSzama;
    }
    
    
}