package prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype {
    private String nume;
    private Float gramajMedicament;
    private Map<String, Float> solutii;

    public Reteta(String nume, Float gramajMedicament, Map<String, Float> solutii) {
        this.nume = nume;
        this.gramajMedicament = gramajMedicament;
        Float sum = 0f;
        for (Float val : solutii.values()) {
            sum += val;
        }
        if (this.gramajMedicament <= sum + 0.1f && this.gramajMedicament >= sum - 0.1f) {
            this.solutii = solutii;
        } else {
            throw new IllegalArgumentException("Gramaj gresit!");
        }
    }

    private Reteta() {
        nume = null;
        gramajMedicament = null;
        solutii = null;
    }

    @Override
    public Prototype clonare() {
        Reteta r = new Reteta();
        r.nume = this.nume;
        r.gramajMedicament = this.gramajMedicament;
        r.solutii = new HashMap<>();
        for (String val : this.solutii.keySet()) {
            r.solutii.put(val, this.solutii.get(val));
        }
//        r.solutii.putAll(this.solutii);
        return r;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", gramajMedicament=" + gramajMedicament +
                ", solutii=" + solutii +
                '}';
    }
}
