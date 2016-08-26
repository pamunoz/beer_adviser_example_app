package pfariasmunoz.com.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // Call when the user clicks the button
    public void onClickFindBeer(View view) {
        // get the reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        // get the reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        // Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        // Display the selected item
        brands.setText(beerType);
        // Get recomendations from the BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        // Display the beers
        brands.setText(brandsFormatted);
    }
}
