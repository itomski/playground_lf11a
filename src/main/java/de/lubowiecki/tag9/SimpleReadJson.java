package de.lubowiecki.tag9;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SimpleReadJson {

    public static void main(String[] args) {


        try(BufferedReader reader = new BufferedReader(new FileReader("config.json"))) {

            // Inhalt der Datei als String einlesen
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder(); // Veränderbare Zeichenkette
            while(line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            String json = sb.toString();

            // JSON-String als JSON Parsen
            final JSONObject obj = new JSONObject(json);
            final JSONArray array = obj.getJSONArray("personen");

            for(int i = 0; i < array.length(); i++) {
                JSONObject sub = array.getJSONObject(i);
                System.out.println(sub.getString("vorname") + " " + sub.getString("nachname"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }




    }
}
