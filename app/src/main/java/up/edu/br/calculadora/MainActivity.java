package up.edu.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declara todas as views da activty

    private Button btnNumero1, btnNumero2, btnNumero3,
            btnNumero4, btnNumero5, btnNumero6,
            btnNumero7, btnNumero8, btnNumero9, btnNumero0;

    private Button btnVirgula, btnIgual, btnMais, btnMenos, btnLimpar, btnDividir, btnMultiplicar;
    private TextView txtResultado;
    private double numero1, numero2, resultado;
    private String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linear);

        btnNumero0 = (Button) findViewById(R.id.btnNumero0);
        btnNumero1 = (Button) findViewById(R.id.btnNumero1);
        btnNumero2 = (Button) findViewById(R.id.btnNumero2);
        btnNumero3 = (Button) findViewById(R.id.btnNumero3);
        btnNumero4 = (Button) findViewById(R.id.btnNumero4);
        btnNumero5 = (Button) findViewById(R.id.btnNumero5);
        btnNumero6 = (Button) findViewById(R.id.btnNumero6);
        btnNumero7 = (Button) findViewById(R.id.btnNumero7);
        btnNumero8 = (Button) findViewById(R.id.btnNumero8);
        btnNumero9 = (Button) findViewById(R.id.btnNumero9);
        btnNumero0 = (Button) findViewById(R.id.btnNumero0);

        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnVirgula = (Button) findViewById(R.id.btnVirgula);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnMais = (Button) findViewById(R.id.btnMais);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnDividir = (Button) findViewById(R.id.btnDividir);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

    }

    public void btnNumeroClick(View view){
        Button btn = (Button) view;
        txtResultado.setText(txtResultado.getText() + btn.getText().toString());
    }

    public void btnOperadorClick(View view){
        if(!TextUtils.isEmpty(txtResultado.getText().toString())){
            Button btn = (Button) view;
            numero1 = Double.valueOf(txtResultado.getText().toString());
            txtResultado.setText("");
            operador = btn.getText().toString();
        }

    }

    public void btnIgualClick(View view) {
        if(!TextUtils.isEmpty(txtResultado.getText().toString())){
            numero2 = Double.valueOf(txtResultado.getText().toString());
            switch (operador) {
                case "*": {
                    resultado = numero1 * numero2;
                    break;
                }
                case "+": {
                    resultado = numero1 + numero2;
                    break;
                }
                case "-": {
                    resultado = numero1 - numero2;
                    break;
                }
                case "/": {
                    resultado = numero1 / numero2;
                    break;
                }
            }
        }

        txtResultado.setText(String.valueOf(resultado));
    }
    public void btnVirgulaClick(View view) {
        if(!txtResultado.getText().toString().contains(".")){
            txtResultado.setText(txtResultado.getText() + ".");
        }
    }

    public void btnLimpar(View view) {
        txtResultado.setText("");
    }
}
