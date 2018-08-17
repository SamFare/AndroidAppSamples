package samfare.me.gimmiepizza;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PizzaElement extends Fragment {

    public static PizzaElement newInstance(String pizzaName) {
        return new PizzaElement();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle inState) {
        View pizzaView =  inflater.inflate(R.layout.fragment_pizza_element, container, false);

        TextView textView = pizzaView.findViewById(R.id.pizzaName);
        textView.setText(getArguments().getString("pizzaName"));

        Button plusButton = pizzaView.findViewById(R.id.plusButton);
        plusButton.setOnClickListener(plusButtonListener);


        Button minusButton = pizzaView.findViewById(R.id.minusButton);
        minusButton.setOnClickListener(minusButtonListener);

        return pizzaView;
    }

    private View.OnClickListener plusButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            EditText numberOfPizza =  getView().findViewById(R.id.numberOfPizza);
            int newNumber = Integer.parseInt(numberOfPizza.getText().toString());
            numberOfPizza.setText(String.valueOf(++newNumber));
        }
    };


    private View.OnClickListener minusButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            EditText numberOfPizza =  getView().findViewById(R.id.numberOfPizza);
            int newNumber = Integer.parseInt(numberOfPizza.getText().toString());
            numberOfPizza.setText(String.valueOf(--newNumber));
        }
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
