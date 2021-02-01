import java.util.*;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class MyLanguages {

    public static void main(String[] args) {

        final Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java", 10);
        map1.put("Ruby", 80);
        map1.put("Python", 65);
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);

        final Map<String, Integer> map3 = new HashMap<>();
        map3.put("C++", 60);
        map3.put("ASM", 80);
        map3.put("Haskell", 20);

        System.out.print(myLanguages(map1));
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {

        if(results.isEmpty())
        {
            return null;
        }
        int minValue = 60;
        //filter lowest value to highest
        Map<String, Integer> sorted = results.entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));


        //Set the Values in list
        List<Integer> values = new ArrayList<>(sorted.values());


        int key = 0;
        List<Integer> index = new ArrayList<>();
        for (Integer value : values) {
            if (value >= minValue)
                index.add(key);
            key++;
        }

//        Collections.reverse(index);
        List<String> myLanguages = new ArrayList<>();
        for (Integer value : index) {
            myLanguages.add((String) sorted.keySet().toArray()[value]);
        }
        Collections.reverse(myLanguages);

        return myLanguages;
    }


}
