
package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.justjava.R;

import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=2;
    public void increment(View view)
    {
    quantity=quantity + 1;
    displayQuantity(quantity);
    }
    public void decrement(View view)
    {
    quantity=quantity-1;
        displayQuantity(quantity);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

      int price = calculatePrice();
       displayMessage(createOrderSummary( price));

    }

    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }
    private String createOrderSummary(int price){
        String priceMessage = "Total  :$ " + price;
        priceMessage ="Name Vineeth \n"+ priceMessage + "\nQuantity : "+ quantity +"\nThank you" ;
       return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
   
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


}