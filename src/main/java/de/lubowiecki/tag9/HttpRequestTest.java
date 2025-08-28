package de.lubowiecki.tag9;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpRequestTest {

    public static void main(String[] args) {


        final String URL = "http://localhost:8080/api/v1/all";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest anfrage = HttpRequest.newBuilder()
                                            .uri(URI.create(URL))
                                            .build();

        try {
            client.sendAsync(anfrage, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenApply(HttpRequestTest::parseJson)
                    .join();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String parseJson(String response) {

        var mapper = new ObjectMapper();

        try {
            CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Person.class);
            List<Person> personen = mapper.readValue(response, type);
            System.out.println(personen);
        }
        catch(IOException e) {
            System.out.println("Problem beim Lesen");
        }

        return null;
    }
}
