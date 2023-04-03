package builder.clase;

public class BuilderPacientV2 implements IBuilder {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public BuilderPacientV2() {
        this.nume = "";
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.patRabatabil, this.micDejun, this.papuciCamera, this.halatInterior);
    }

    public IBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public IBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public IBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public IBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public IBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }
}
