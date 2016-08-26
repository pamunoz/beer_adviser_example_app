package pfariasmunoz.com.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {

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
    }
}
