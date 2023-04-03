package factory_method.clase;

public class FactoryBrancardier implements Factory {

    @Override
    public PersonalSpital createInstance(String nume) {
        return new Brancardier(nume);
    }
}
