package registryNerecomandat;

public class Firma {
    private String nume;
    private int cifraAfaceri;

    protected Firma(String nume, int cifraAfaceri) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }

    public void incheieContract(int suma) {
        this.cifraAfaceri += suma;
    }
}
