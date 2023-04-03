package builder.clase;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    protected Pacient(String nume) {
        this.nume = nume;
        patRabatabil = false;
        micDejun = false;
        papuciCamera = false;
        halatInterior = false;
    }

    protected Pacient(String nume, boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    protected Pacient() {

    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    protected void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    protected void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }
}
