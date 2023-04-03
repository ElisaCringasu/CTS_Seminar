package factory_method.clase;

public class FactoryAsistenti implements Factory {

    @Override
    public PersonalSpital createInstance(String nume) {
        return new Asistent(nume);
    }
}
