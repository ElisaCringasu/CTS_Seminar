package clase;

public class Soare {
    private String culoare;
    private int dimensiune;

    //    lazy init
    private static Soare instanta = null;

    private Soare(String culoare, int dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public static Soare getInstance(String culoare, int dimensiune) {
        if (instanta == null) {
            instanta = new Soare(culoare, dimensiune);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Soare{" +
                "culoare='" + culoare + '\'' +
                ", dimensiune=" + dimensiune +
                '}';
    }
}
