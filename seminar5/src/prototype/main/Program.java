package prototype.main;

import prototype.clase.Autobuz;
import prototype.clase.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        MijlocTransport a = new Autobuz("B123ASD", 25);
        MijlocTransport b = new Autobuz("B999BIG", 40);

        Autobuz c = (Autobuz) a.copiaza();

        c.setNrInmatriculare("IF96UIF");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        
    }
}
