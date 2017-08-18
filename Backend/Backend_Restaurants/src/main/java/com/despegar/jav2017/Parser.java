package com.despegar.jav2017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static List<Restaurant> main(String[] args) {

        String csvFile = "com/despegar/jav2017/restaurantes.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        List<Restaurant> restaurantes = new ArrayList<Restaurant>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] arrayRestaurant = line.split(cvsSplitBy);

                Restaurant restaurant = new Restaurant(arrayRestaurant[0],arrayRestaurant[5],
                                        Integer.getInteger(arrayRestaurant[6]), arrayRestaurant[4],
                                        Integer.getInteger(arrayRestaurant[3]), Double.valueOf(arrayRestaurant[2]),
                                        Boolean.getBoolean(arrayRestaurant[1]));
                restaurantes.add(restaurant);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return restaurantes;

    }

}
