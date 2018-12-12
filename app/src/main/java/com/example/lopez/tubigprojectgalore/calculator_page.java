package com.example.lopez.tubigprojectgalore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator_page extends AppCompatActivity {
    private Button button1; //character
    private Button button2; //impacts
    private Button button3; //calcu
    private Button button4; //about
    private Button buttonX; //HOME
    EditText et_number;
    Button b_go;
    TextView tv_show;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_page);

        et_number = (EditText) findViewById(R.id.et_number);
        b_go = (Button) findViewById(R.id.b_go);
        tv_show = (TextView) findViewById(R.id.tv_show);

        b_go.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float number = Float.parseFloat(et_number.getText().toString());
                if(number <= 0.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC and has the same acidity with BATTERY ACID");
                } else if(number <= 1.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC and has the same acidity with GASTRIC ACID");
                } else if(number <= 2.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC and has the same acidity with VINEGAR");
                } else if(number <= 3.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC and has the same acidity with ORANGE JUICE");
                } else if(number <= 4.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC and has the same acidity with ACID RAIN");
                } else if(number == 5){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC, has the same acidity with BANANAS, and is OKAY FOR PLANTING");
                } else if(number == 6){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is ACIDIC, has the same acidity with URINE, and is OKAY FOR PLANTING");
                } else if(number == 7){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is NEUTRAL, has the same level as PURE WATER, and is OKAY FOR PLANTING");
                } else if(number == 8){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC, has the same alkalinity with SEA WATER, and is OKAY FOR PLANTING");
                } else if(number <= 8.4){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC, has the same alkalinity with SEA WATER, and is OKAY FOR PLANTING");
                } else if(number <= 8.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with SEA WATER");
                } else if(number <= 9.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with BAKING SODA");
                } else if(number <= 10.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with the GREAT SALT LAKE");
                } else if(number <= 11.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with an AMMONIA SOLUTION");
                } else if(number <= 12.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with SOAPY WATER");
                } else if(number <= 13.9){
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with BLEACH");
                } else{
                    tv_show.setText("\n" + "\n" + "\n" + "Water is BASIC and has the same alkalinity with LIQUID DRAIN CLEANER");
                }
            }
        });

        button1 = findViewById(R.id.subcharacterButton);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                opensubCharacter();
            }
        });

        button2 = findViewById(R.id.subimpactsButton);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                opensubImpacts();
            }
        });

        button3 = findViewById(R.id.subcalculatorButton);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                opensubCalculator();
            }
        });

        button4 = findViewById(R.id.subaboutButton);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                opensubAbout();
            }
        });

        buttonX = findViewById(R.id.homeButton);
        buttonX.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHome();
            }
        });
    }

    public void opensubCharacter(){
        Intent intent = new Intent(this, character_page.class);
        startActivity(intent);
    }

    public void opensubImpacts(){
        Intent intent = new Intent(this, impacts_page.class);
        startActivity(intent);
    }

    public void opensubCalculator(){
        Intent intent = new Intent(this, calculator_page.class);
        startActivity(intent);
    }

    public void opensubAbout(){
        Intent intent = new Intent(this, about_page.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
