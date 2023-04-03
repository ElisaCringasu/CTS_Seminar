package mainRegistryNerecomandat;

import registryNerecomandat.Firma;
import registryNerecomandat.Registru;

public class Main {
    public static void main(String[] args) {
        Firma firma1 = Registru.getFirma("Adi SRL");
        Firma firma2 = Registru.getFirma("mafia srl");
        Firma firma3 = Registru.getFirma("Adi SRL");

        firma1.incheieContract(1000);
        firma2.incheieContract(300);
        firma3.incheieContract(5000);

        System.out.println(firma1);
        System.out.println(firma2);
        System.out.println(firma3);
    }
}
