package com.beatrizcriado.adivina_el_numero_ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView Drx_text; //Drx texto
    EditText answer; //Texto a introducir
    Button start; //Bonton
    Button playAgain; //volver al principio
    int numberToGuess = 54; //Numero a adivinar
    String answeruser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drx_text = findViewById(R.id.Drx_text);//Cuadro texto doctor, textView
        answer = findViewById(R.id.answer); //  Numero introducido, editText
        start = findViewById(R.id.start); //  Boton comprobar numero
    }

    public void startapp(View vista) {
        Log.d("MainActivity", "boton inicio pulsado");
        answeruser = answer.getText().toString();
        if ("".equals(answeruser)) {
            Drx_text.setText("Introduce a number, please!");
            Drx_text.setTextColor(getResources().getColor(R.color.naranja));
        } else {
            int answeruserint = Integer.parseInt(answeruser);

            if (answeruserint == numberToGuess) {
                Drx_text.setText("Congratulations");
                Drx_text.setTextColor(getResources().getColor(R.color.verde));

            } else {
                Drx_text.setText("Sorry, try again!");
                Drx_text.setTextColor(getResources().getColor(R.color.naranja));
            }
        }


    }
}

