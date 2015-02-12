package emmajanefearn.financingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Declare Buttons
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);


        //On click of a buttons listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button:
                        Intent intent = new Intent(Menu.this, Overview.class);
                        startActivity(intent);
                        break;
                    case R.id.button2:
                        Intent intent2 = new Intent(Menu.this, Recommendations.class);
                        startActivity(intent2);
                        break;
                    case R.id.button3:
                        Intent intent3 = new Intent(Menu.this, Outgoings.class);
                        startActivity(intent3);
                        break;
                    case R.id.button4:
                        Intent intent4 = new Intent(Menu.this, Income.class);
                        startActivity(intent4);
                        break;
                    case R.id.button5:
                        Intent intent5 = new Intent(Menu.this, Settings.class);
                        startActivity(intent5);
                        break;
                    case R.id.button6:
                        Intent intent6 = new Intent(Menu.this, LogExpenditure.class);
                        startActivity(intent6);
                        break;
                }
            }
        };

        //Set the listener
        button.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
    }
}

