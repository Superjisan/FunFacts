package com.superjisan.funfacts.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener(){
          @Override
            public void onClick(View view){
              String fact = mFactBook.getmFacts();
              int color = mColorWheel.getColors();
              //update the fact with a dynamic fact
              factLabel.setText(fact);
              relativeLayout.setBackgroundColor(color);
              showFactButton.setTextColor(color);
          }
        };

        showFactButton.setOnClickListener(listener);
    }

}
