package composite.clase;

import jdk.jshell.spi.ExecutionControl;

public interface Element {
    public float calculeazaSumaAsigurare();
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException;
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException;
    public Element getGrup(int pozitie) throws ExecutionControl.NotImplementedException;
    public void afisareSumaAsiguare();
}
