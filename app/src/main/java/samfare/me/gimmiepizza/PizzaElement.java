package samfare.me.gimmiepizza;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PizzaElement extends Fragment {

    public static PizzaElement newInstance(String pizzaName) {
        return new PizzaElement();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle inState) {
        View pizzaView =  inflater.inflate(R.layout.fragment_pizza_element, container, false);

        TextView textView = pizzaView.findViewById(R.id.pizzaName);
        textView.setText(getArguments().getString("pizzaName"));

        return pizzaView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

}
