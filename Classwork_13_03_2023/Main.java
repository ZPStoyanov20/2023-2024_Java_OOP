import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();

        names.add("Zafr");
        names.add("Trani");
        names.add("Kirov");

        names.forEach (e -> System.out.println(e));

        Map<String, Double> grades = new LinkedHashMap<>();

        grades.put("Jafar", 6.69);
        grades.put("Dankata", 9.96);

        Set<String> keys = grades.keySet();

        for(String key : keys){
            System.out.println(key + " - " + grades.get(key));
        }

        Collection<Double> value = grades.values();
    }
}