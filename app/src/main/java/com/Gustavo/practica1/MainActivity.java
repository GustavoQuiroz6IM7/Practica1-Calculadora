package com.Gustavo.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnborrar, btnlimpiar, btnigual, btnsuma, btnresta, btnmul, btndiv;
    private Button txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt0, txtpunto;
    private TextView txv;
    String[] numAr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnborrar = (Button)findViewById(R.id.btnborrar);
        btnlimpiar = (Button)findViewById(R.id.btnlimpiar);
        btnigual = (Button)findViewById(R.id.btnigual);
        btnsuma = (Button)findViewById(R.id.txtmas);
        btnresta = (Button)findViewById(R.id.txtmenos);
        btnmul = (Button)findViewById(R.id.txtpor);
        btndiv = (Button)findViewById(R.id.txtentre);
        txt1 = (Button)findViewById(R.id.txt1);
        txt2 = (Button)findViewById(R.id.txt2);
        txt3 = (Button)findViewById(R.id.txt3);
        txt4 = (Button)findViewById(R.id.txt4);
        txt5 = (Button)findViewById(R.id.txt5);
        txt6 = (Button)findViewById(R.id.txt6);
        txt7 = (Button)findViewById(R.id.txt7);
        txt8 = (Button)findViewById(R.id.txt8);
        txt9 = (Button)findViewById(R.id.txt9);
        txt0 = (Button)findViewById(R.id.txt0);
        txtpunto = (Button)findViewById(R.id.txtpunto);
        txv = (TextView)findViewById(R.id.Recibe);

    }

    //Grupo de métodos para escribir, borrar o eliminar los números en el TextView

    public void eliminar(View view){
        txv.setText("");
    }

    public void esc1(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "1");
    }

    public void esc2(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "2");
    }

    public void esc3(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "3");
    }

    public void esc4(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "4");
    }

    public void esc5(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "5");
    }

    public void esc6(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "6");
    }

    public void esc7(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "7");
    }

    public void esc8(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "8");
    }

    public void esc9(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "9");
    }

    public void esc0(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + "0");
    }

    public void escpun(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        String a = (String)txv.getText();
        txv.setText(a + ".");
    }

    // Métodos en los cuales se escriben y realizan las operaciones
    public void escmas(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        Double res = calcular(txv.getText().toString(), "+");

        if (res != 0.0001) {
            txv.setText(Double.toString(res) + "+");
        }
    }

    public void escmenos(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }
        Double res = calcular(txv.getText().toString(), "-");
        if (res != 0.0001) {
            txv.setText(Double.toString(res) + "-");
        }
    }

    public void escmul(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        Double res = calcular(txv.getText().toString(), "*");
        if (res != 0.0001) {
            txv.setText(Double.toString(res) + "*");
        }
    }

    public void escdiv(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        Double res = calcular(txv.getText().toString(), "/");
        if (res != 0.0001) {
            txv.setText(Double.toString(res) + "/");
        }
    }

    public void potencia(View v){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        double res = calcular(txv.getText().toString(), "");
        res = Math.pow(res, 2);
        txv.setText(Double.toString(res));
    }



    public void raiz(View v){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        double res = calcular(txv.getText().toString(), "");
        res = Math.sqrt(res);
        txv.setText(Double.toString(res));
    }

    public void borrar(View view){
        if(txv.getText().equals("Ingresa valores")){
            txv.setText("");
        }

        if(txv.getText().length() != 0){
            String cadena = (String)txv.getText();
            String cadenaNueva = cadena.substring(0, cadena.length()-1);
            txv.setText(cadenaNueva);
        }
    }

    //Método en el cual se desarrollan todas las operaciones de manera secuencial.

    public Double calcular(String num, String op){
        double res = 0.0001;

        if(num.charAt(num.length()-1) == '+' || num.charAt(num.length()-1) == '-' || num.charAt(num.length()-1) == '*' || num.charAt(num.length()-1) == '/'){
            num = num.substring(0, (num.length() - 1)) + op;
            txv.setText(num);
        }else {
            if (num.indexOf('+') != -1) {
                numAr = num.split("\\+");
                res = Double.parseDouble(numAr[0]) + Double.parseDouble(numAr[1]);
            } else {
                if (num.indexOf('-') != -1) {
                    numAr = num.split("-");
                    res = Double.parseDouble(numAr[0]) - Double.parseDouble(numAr[1]);
                } else {
                    if (num.indexOf('*') != -1) {
                        numAr = num.split("\\*");
                        res = Double.parseDouble(numAr[0]) * Double.parseDouble(numAr[1]);
                    } else {
                        if (num.indexOf("/") != -1) {
                            numAr = num.split("/");
                            res = Double.parseDouble(numAr[0]) / Double.parseDouble(numAr[1]);
                        } else {
                            res = Double.parseDouble(txv.getText().toString());
                        }
                    }
                }
            }
        }
        return res;
    }

    public void igual(View v) {

        Double res = calcular(txv.getText().toString(), "");

        if (res != 0.0001) {

            txv.setText(Double.toString(res));

        }

    }

}
