package com.example.f21comp1011gcfinalb;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;

public class Utility {

    public static Dealership getDealershipDataFromJson() {
        Gson gson = new Gson();
        Dealership dealership = null;
        try (
                FileReader fileReader = new FileReader("carData.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            dealership = gson.fromJson(jsonReader,Dealership.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  dealership;
    }
}
