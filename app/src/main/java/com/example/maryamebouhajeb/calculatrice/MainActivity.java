package com.example.maryamebouhajeb.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addition = null;
    Button soustraction = null;
    Button multiplication = null;
    Button division = null ;
    EditText montant1 = null;
    EditText montant2 = null;
    TextView textView = null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition = findViewById(R.id.addition);
        soustraction = findViewById(R.id.soustraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        montant1=findViewById(R.id.montant1);
        montant2=findViewById(R.id.montant2);
        textView=findViewById(R.id.result);
        addition.setOnClickListener(AdditionListener);
        soustraction.setOnClickListener(soustractionListener);
        multiplication.setOnClickListener(multiplicationListener);
        division.setOnClickListener(divisionListener);
        montant1.addTextChangedListener(textWatcher);
        montant2.addTextChangedListener(textWatcher);

    }
    private TextWatcher textWatcher;

    {
        textWatcher = new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.setText("");
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
    }


    private View.OnClickListener divisionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String m = montant1.getText().toString();
            String m1 = montant2.getText().toString();
            float mValue = Float.valueOf(m);
            float mValue1 = Float.valueOf(m1);

            mValue /= mValue1;
            textView.setText("Le montant apres la soustraction: " + String.valueOf(mValue));
        }


    };

    private View.OnClickListener multiplicationListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String m = montant1.getText().toString();
            String m1 = montant2.getText().toString();
            float mValue = Float.valueOf(m);
            float mValue1 = Float.valueOf(m1);

            mValue *= mValue1;
            textView.setText("Le montant apres la soustraction: " + String.valueOf(mValue));
        }


    };


    private View.OnClickListener soustractionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String m = montant1.getText().toString();
            String m1 = montant2.getText().toString();
            float mValue = Float.valueOf(m);
            float mValue1 = Float.valueOf(m1);

            mValue -= mValue1;
            textView.setText("Le montant apres la soustraction: " + String.valueOf(mValue));
        }


    };

    private View.OnClickListener AdditionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

                String m = montant1.getText().toString();
                String m1 = montant2.getText().toString();
                float mValue = Float.valueOf(m);
                float mValue1 = Float.valueOf(m1);

                    mValue += mValue1;
                    textView.setText("Le montant apres l'addition: " + String.valueOf(mValue));
        }


    };

}