
package hazmester;

import java.io.BufferedReader;
import java.io.Reader;


public class Hazmester {

public static void karbantart(String path){
    Tarsashaz t = new Tarsashaz(100,100);
    BufferedReader br = new BufferedReader(FileReader(path));
    String sor = br.readLine();
    while (sor!= null){
        String [] szavak = sor.split(" ");
        if (szavak [0].equals("Alberlet")){
            Alberlet a = new Alberlet (Double.parseDouble(szavak[1]), Integer.parseInt(szavak[2]), Integer.parseInt(szavak[3]));
        }
    }
}
    public static void main(String[] args) {
    
    }

    private static Reader FileReader(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
