package de.lubowiecki.tag6;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Berlin", 3_200_000);
        einwohner.put("Kiel", 350_000);
        einwohner.put("München", 1_600_000);

        einwohner.put("Kiel", 400_000); // Alter wert wird überschrieben

        System.out.println(einwohner.get("Kiel"));

        System.out.println(einwohner);
    }
}
