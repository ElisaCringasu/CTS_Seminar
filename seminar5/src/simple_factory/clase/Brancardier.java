package simple_factory.clase;

public class Brancardier implements PersonalSpital {
    private String nume;

    protected Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul " + nume);
    }
}
