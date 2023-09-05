package com.databit.edadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edadEdit = findViewById(R.id.edad_edit);
        TextView resultadoText=findViewById(R.id.resultado_text);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String age=edadEdit.getText().toString();
            if (!age.isEmpty()) {
                int ageInt = Integer.parseInt(age);
                int resultado = ageInt * 7;
                String resultadoString = "Si fueras perro , tu edad sería de :" + resultado + " años";
                resultadoText.setText(resultadoString);
            } else {
                Toast.makeText(this,"Debes insertar una edad", Toast.LENGTH_SHORT).show();
            }

        });



    }
}