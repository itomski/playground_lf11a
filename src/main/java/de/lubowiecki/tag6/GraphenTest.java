package de.lubowiecki.tag6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphenTest {

    public static void main(String[] args) {

        Map<String, List<String>> verbindungen = new HashMap<>();
        verbindungen.put("Hamburg", new ArrayList<>());
        verbindungen.get("Hamburg").add("Kiel");
        verbindungen.get("Hamburg").add("Berlin");
        verbindungen.get("Hamburg").add("Lübeck");



    }
}
