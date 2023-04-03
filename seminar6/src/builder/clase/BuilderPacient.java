package builder.clase;

public class BuilderPacient implements IBuilder {
    private Pacient pacient;

    public BuilderPacient(String nume) {
        this.pacient = new Pacient(nume);
    }

    @Override
    public Pacient build() {
        return pacient;
    }

    public IBuilder setNume(String nume) {
        throw new IllegalArgumentException("Not Aplicable!");
    }

    public IBuilder setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public IBuilder setMicDejun(boolean micDejun) {
        pacient.setMicDejun(micDejun);
        return this;
    }

    public IBuilder setPapuciCamera(boolean papuciCamera) {
        pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    public IBuilder setHalatInterior(boolean halatInterior) {
        pacient.setHalatInterior(halatInterior);
        return this;
    }
}
