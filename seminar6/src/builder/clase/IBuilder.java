package builder.clase;

public interface IBuilder {
    Pacient build();

    IBuilder setNume(String nume);

    IBuilder setPatRabatabil(boolean patRabatabil);

    IBuilder setMicDejun(boolean micDejun);

    IBuilder setPapuciCamera(boolean papuciCamera);

    IBuilder setHalatInterior(boolean halatInterior);
}
