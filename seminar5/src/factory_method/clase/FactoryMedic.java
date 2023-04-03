package factory_method.clase;

public class FactoryMedic implements Factory {

    @Override
    public PersonalSpital createInstance(String nume) {
        return new Medic(nume);
    }
}
