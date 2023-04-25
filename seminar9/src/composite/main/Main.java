package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Element autobuz1 = new Autobuz("Mercedes", 3000, 9);
        Element autobuz2 = new Autobuz("Mercedes", 3000, 7);

        Element grupAutobuzeMici = new Grup("Autobuze mici");
        grupAutobuzeMici.adaugaGrup(autobuz1);
        grupAutobuzeMici.adaugaGrup(autobuz2);
        grupAutobuzeMici.afisareSumaAsiguare();


        Element autobuz3 = new Autobuz("Mercedes", 5000, 15);
        Element autobuz4 = new Autobuz("Mercedes", 4000, 20);
        Element grupAutobuzeMijlocii = new Grup("Autobuze mijlocii");
        grupAutobuzeMijlocii.adaugaGrup(autobuz3);
        grupAutobuzeMijlocii.adaugaGrup(autobuz4);
        grupAutobuzeMijlocii.afisareSumaAsiguare();

        Element flota = new Grup("Autobuze");
        flota.adaugaGrup(grupAutobuzeMici);
        flota.adaugaGrup(grupAutobuzeMijlocii);
        flota.afisareSumaAsiguare();

        Element autobuzVIP = new Autobuz("Dacia", 9000, 30);
        flota.adaugaGrup(autobuzVIP);
        flota.afisareSumaAsiguare();

    }
}
