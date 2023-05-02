package flyweight.clase;

public class PozitieDesenare {
    private int rand;
    private int loc;
    private String culoareTricou;

    public PozitieDesenare(int rand, int loc, String culoareTricou) {
        this.rand = rand;
        this.loc = loc;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        return "PozitieDesenare{" +
                "rand=" + rand +
                ", loc=" + loc +
                ", culoareTricou='" + culoareTricou + '\'' +
                '}';
    }
}
