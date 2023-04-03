package prototype.main;

import prototype.clase.Prototype;
import prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Float> solutii = new HashMap<>();
        solutii.put("A", 5f);
        solutii.put("B", 7f);
        solutii.put("C", 12f);
        Reteta reteta = new Reteta("Reteta 1", 24f, solutii);

        System.out.println(reteta);

        Reteta r2 = (Reteta) reteta.clonare();

        Prototype r3 = reteta.clonare();

        System.out.println(r2);
        System.out.println(r3);
    }
}
