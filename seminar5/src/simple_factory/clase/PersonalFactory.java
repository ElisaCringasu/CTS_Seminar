package simple_factory.clase;

public class PersonalFactory {
    public PersonalSpital createInstance(TipPersonal tip, String nume) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier(nume);
            case MEDIC:
                return new Medic(nume);
            case ASISTENT:
                return new Asistent(nume);
            default:
                return null;
        }
    }

    public PersonalSpital createInstance(TipPersonal tip, String nume, int nrPacienti) {
        switch (tip) {
            case ANESTEZIST:
                return new Anestezist(nume, nrPacienti);
            default:
                return createInstance(tip, nume);
        }
    }
}
