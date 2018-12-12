package com.example.lopez.tubigprojectgalore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class impacts_page extends AppCompatActivity {
    private Button button1; //character
    private Button button2; //impacts
    private Button button3; //calcu
    private Button button4; //about
    private Button button5; //elnino
    private Button button6; //lanina
    private Button button7; //regional climate
    private Button buttonX; //HOME

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impacts_page);

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

        button5 = findViewById(R.id.buttonImpacts1);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openImpacts1();
            }
        });

        button6 = findViewById(R.id.buttonImpacts2);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openImpacts2();
            }
        });

        button7 = findViewById(R.id.buttonImpacts3);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openImpacts3();
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

    public void openImpacts1(){
        Intent intent = new Intent(this, impacts1.class);
        startActivity(intent);
    }

    public void openImpacts2(){
        Intent intent = new Intent(this, impacts2.class);
        startActivity(intent);
    }

    public void openImpacts3(){
        Intent intent = new Intent(this, impacts3.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

}
