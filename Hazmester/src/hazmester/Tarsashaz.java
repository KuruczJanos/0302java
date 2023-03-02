
package hazmester;

import java.util.ArrayList;


public class Tarsashaz {
    private ArrayList<Ingatlan> lista;
    private int maxgarazs;
    private int maxlakas;

    public Tarsashaz(int maxgarazs, int maxlakas) {
        this.lista = new ArrayList<Ingatlan>();
        this.maxgarazs = maxgarazs;
        this.maxlakas = maxlakas;
    }
    public boolean lakasHozzaAd(Lakas l)
    {
        int lakasokSzama = 0;
        for(Object o : this.lista) {
            if (o instanceof Lakas) {
                lakasokSzama++;
            }
            if (lakasokSzama<this.maxlakas){
            lista.add(l);
            return true; 
            }
            return false;
        
    }
    }
        public boolean garazsHozzaAd(Garazs g){
        int garazsSzama = 0;
        for(Object o : this.lista) {
            if (o instanceof Garazs) {
                garazsSzama++;
            }
            if (garazsSzama<this.maxgarazs){
            lista.add(g);
            return true; 
            }
            return false;
        
    }
        }
    public int osszesLako(){
        int lakok = 0;
        for (Object o : this.lista) {
            if (o instanceof Lakas) {
                lakok += ((Lakas)o).lakokSzama();
            }
            return lakok;
        }
    }
    public int ingatlanErtek(){
        int ertek = 0;
        for (Object o : lista){
            if ((o instanceof Lakas)&&((Lakas)o).lakokSzama()>0) {
                ertek+= ((Lakas)o).osszesKoltseg();
            }
            else if((o instanceof Garazs)&&((Garazs)o).garazsSzama()>0){
                 ertek+= ((Garazs)o).osszesKoltseg();
            }
            return ertek;
        }
    }
}

