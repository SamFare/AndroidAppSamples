package samfare.me.gimmiepizza;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private final ArrayList pizzas = new ArrayList(Arrays.asList("Peperoni", "Chilli"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (String pizzaName : (ArrayList<String>) this.pizzas) {
            PizzaElement pizzaFragment = new PizzaElement();

            Bundle bundle = new Bundle();
            bundle.putString("pizzaName", pizzaName);

            pizzaFragment.setArguments(bundle);

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.pizzaLinearLayout, pizzaFragment).commit();
        }

    }



}
