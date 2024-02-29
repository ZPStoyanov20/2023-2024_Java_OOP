import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Double> personkg = new TreeMap<>();
        personkg.put("Ivan", 70.5);
        personkg.put("Georgi", 80.0);
        personkg.putIfAbsent("Pesho", 90.0);
        personkg.put("Martin", 70.5);
//System.out.println(personKg.get("Martin"));
        Set<String> keys = personkg.keySet();
        for (String key : keys) {
            System.out.println(key + " - " + personkg.get(key));
        }

        Collection<Double> values = personkg.values();
        for (Double value : values) {
            System.out.println(value);
        }
        Set<Map.Entry<String,Double>> entries = personkg.entrySet();
        for(Map.Entry<String, Double> entry : entries)
        {
            System.out.println(entry.getKey() + " --- " + entry.getValue());
        }
    }
}