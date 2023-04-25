package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    private List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        super();
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma = 0;
        for (Element element : elemente){
            suma+= element.calculeazaSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaGrup(Element element) {
        elemente.add(element);
    }

    @Override
    public void stergeGrup(Element element) {
        this.elemente.remove(element);
    }

    @Override
    public Element getGrup(int pozitie) {
        return this.elemente.get(pozitie);
    }

    @Override
    public void afisareSumaAsiguare() {
        System.out.println("Suma pentru asigurare este de "+ this.calculeazaSumaAsigurare());
    }
}
