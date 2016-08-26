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
        Spinner color = (Spinner) findViewById(R.id.color);
        String beer = String.valueOf(color.getSelectedItem());
        TextView brands = (TextView) findViewById(R.id.brands);
        brands.setText(beer);


    }
}
