package up.edu.br.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        setContentView(R.layout.activity_main);

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

    public void btnNumero9Click(View view) {
        txtResultado.setText(txtResultado.getText() + "9");
    }

    public void btnNumero8Click(View view) {
        txtResultado.setText(txtResultado.getText() + "8");
    }

    public void btnNumero7Click(View view) {
        txtResultado.setText(txtResultado.getText() + "7");
    }

    public void btnNumero6Click(View view) {
        txtResultado.setText(txtResultado.getText() + "6");
    }

    public void btnNumero5Click(View view) {
        txtResultado.setText(txtResultado.getText() + "5");
    }

    public void btnNumero4Click(View view) {
        txtResultado.setText(txtResultado.getText() + "4");
    }

    public void btnNumero3Click(View view) {
        txtResultado.setText(txtResultado.getText() + "3");
    }

    public void btnNumero2Click(View view) {
        txtResultado.setText(txtResultado.getText() + "2");
    }

    public void btnNumero1Click(View view) {
        txtResultado.setText(txtResultado.getText() + "1");
    }

    public void btnNumero0Click(View view) {
        txtResultado.setText(txtResultado.getText() + "0");
    }

    public void btnVirgulaClick(View view) {
        if(!txtResultado.getText().toString().contains(",")){
            txtResultado.setText(txtResultado.getText() + ",");
        }
    }

    public void btnMaisClick(View view) {
        numero1 = Double.valueOf(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "+";
    }

    public void btnMenosClick(View view) {
        numero1 = Double.valueOf(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "-";
    }

    public void btnMultiplicarClick(View view) {
        numero1 = Double.valueOf(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "*";
    }

    public void btnIgualClick(View view) {
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

        txtResultado.setText(String.valueOf(resultado));
    }

    public void btnDividirClick(View view) {
        numero1 = Double.valueOf(txtResultado.getText().toString());
        txtResultado.setText("");
        operador = "/";
    }

    public void btnLimpar(View view) {
        txtResultado.setText("");
    }
}
