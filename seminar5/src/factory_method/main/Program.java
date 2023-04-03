package factory_method.main;

import factory_method.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Factory factoryMedici = new FactoryMedic();
        Factory factoryAsistenti = new FactoryAsistenti();
        Factory factoryBrancardieri = new FactoryBrancardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        listaPersonal.add(factoryAsistenti.createInstance("Ionescu"));
        listaPersonal.add(factoryMedici.createInstance("Andrei"));
        listaPersonal.add(factoryMedici.createInstance("Cristian"));
        listaPersonal.add(factoryBrancardieri.createInstance("Gigi"));
        listaPersonal.add(factoryAsistenti.createInstance("Marius"));
        listaPersonal.add(factoryBrancardieri.createInstance("Matei"));

        for (PersonalSpital p : listaPersonal) {
            p.descriere();
        }
    }
}
