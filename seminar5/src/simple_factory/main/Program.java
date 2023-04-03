package simple_factory.main;

import simple_factory.clase.PersonalFactory;
import simple_factory.clase.PersonalSpital;
import simple_factory.clase.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        PersonalFactory factory = new PersonalFactory();
        PersonalSpital b = factory.createInstance(TipPersonal.BRANCARDIER, "Ion");
        PersonalSpital m = factory.createInstance(TipPersonal.MEDIC, "George");
        PersonalSpital a = factory.createInstance(TipPersonal.ASISTENT, "Marius");

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        listaPersonal.add(b);
        listaPersonal.add(m);
        listaPersonal.add(a);

        listaPersonal.add(factory.createInstance(TipPersonal.ANESTEZIST, "Cristi", 10));
        for (PersonalSpital p : listaPersonal) {
            p.descriere();
        }
    }
}