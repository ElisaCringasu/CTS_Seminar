package registryNerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
    private static Map<String, Firma> firmeRegistru = new HashMap<>();

    public static synchronized Firma getFirma(String nume) {
        if (!firmeRegistru.containsKey(nume)) {
            Firma firma = new Firma(nume, 0);
            firmeRegistru.put(nume, firma);
            return firma;
        }
        return firmeRegistru.get(nume);
    }
}
