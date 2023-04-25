package composite.clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements Element {
    private String producator;
    private int capacitateCilindrica;
    private int numarLocuri;


    public Autobuz(String producator, int capacitateCilindrica, int numarLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma = (float) (1.5 * this.capacitateCilindrica);
        return suma;
    }

    @Override
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("operatia nu este implementata");
    }

    @Override
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("operatia nu este implementata");
    }

    @Override
    public Element getGrup(int pozitie) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("operatia nu este implementata");
    }

    @Override
    public void afisareSumaAsiguare() {
        System.out.println("Suma de asigurare pentru autobuzul cu capacitatea cilindrica" + this.capacitateCilindrica +" este "+ this.calculeazaSumaAsigurare());
    }
}
