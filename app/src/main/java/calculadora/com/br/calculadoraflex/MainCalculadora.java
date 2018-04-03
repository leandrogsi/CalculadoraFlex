package calculadora.com.br.calculadoraflex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainCalculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculadora);
    }

    public void calcular(View view){
        //RadioButton radioSomar = (RadioButton) findViewById(R.id.radioSomar);
        EditText etanolIn = (EditText) findViewById(R.id.editEtanol);
        EditText gasolinaIn = (EditText) findViewById(R.id.editGasolina);

        Double etanol = Double.parseDouble(etanolIn.getText().toString());
        Double gasolina = Double.parseDouble(gasolinaIn.getText().toString());

        Double resultado = etanol / gasolina;

        DecimalFormat df = new DecimalFormat("#.00");

       // Toast.makeText(this, "Resultado: " + df.format(resultado), Toast.LENGTH_SHORT).show();

        if(resultado < 0.70){
            Toast.makeText(this, "Abastecer com Etanol.", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "Abastecer com Gasolina: " + df.format(resultado), Toast.LENGTH_LONG).show();
        }


        //Log.i("MainActivity", "Resultado: " + df.format(resultado));

    }
}
