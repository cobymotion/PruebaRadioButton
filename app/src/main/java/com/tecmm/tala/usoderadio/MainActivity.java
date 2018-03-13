package com.tecmm.tala.usoderadio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {


    TextView txtResultado;

    RadioButton rdSuma, rdResta, rdMultiplicacion, rdDivision;
    EditText edNum1,  edNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("PRUEBAS", "Mi app se esta iniciando");
        Toast.makeText(this,"Paso algo",Toast.LENGTH_SHORT).show();

        txtResultado = (TextView) findViewById(R.id.txtResultado);
        rdSuma = (RadioButton) findViewById(R.id.rdSuma);
        rdResta = (RadioButton) findViewById(R.id.rdResta);
        rdMultiplicacion = (RadioButton) findViewById(R.id.rdMultiplicacion);
        rdDivision = (RadioButton) findViewById(R.id.rdDivision);
        edNum1 = (EditText) findViewById(R.id.edNum1);
        edNum2 = (EditText) findViewById(R.id.edNum2);

    }

    public void operacion(View v){
        int num1=0,num2=0;
        try {
            num1 = Integer.parseInt(edNum1.getText().toString());
            num2 = Integer.parseInt(edNum2.getText().toString());
        }catch(NumberFormatException e)
        {
            Toast.makeText(this,"Deben ser numeros", Toast.LENGTH_LONG)
                    .show();
            return;
        }

        if(rdSuma.isChecked())
            num1 = num1 + num2;
        else if(rdResta.isChecked())
            num1 = num1 - num2;
        txtResultado.setText("Resultado:" + num1 );
    }

}
