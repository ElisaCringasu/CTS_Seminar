package factory_method.clase;

public class Asistent implements PersonalSpital {
    private String nume;

    protected Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + nume);
    }
}
