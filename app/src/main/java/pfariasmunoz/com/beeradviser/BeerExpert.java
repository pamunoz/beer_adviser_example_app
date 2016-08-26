package pfariasmunoz.com.beeradviser;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Pablo Farias on 26-08-16.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
