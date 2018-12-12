package com.example.lopez.tubigprojectgalore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button button1; //character
    private Button button2; //impacts
    private Button button3; //calcu
    private Button button4; //about


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1 = findViewById(R.id.characterButton);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCharacter();
            }
        });

        button2 = findViewById(R.id.impactsButton);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openImpacts();
            }
        });

        button1 = findViewById(R.id.calculatorButton);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCalculator();
            }
        });

        button1 = findViewById(R.id.aboutButton);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAbout();
            }
        });

    }

    public void openCharacter(){
        Intent intent = new Intent(this, character_page.class);
        startActivity(intent);
    }

    public void openImpacts(){
        Intent intent = new Intent(this, impacts_page.class);
        startActivity(intent);
    }

    public void openCalculator(){
        Intent intent = new Intent(this, calculator_page.class);
        startActivity(intent);
    }

    public void openAbout(){
        Intent intent = new Intent(this, about_page.class);
        startActivity(intent);
    }

}
