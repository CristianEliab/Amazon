package android.icesi.com.w4pplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("LifeCycle", "onCreate");

        Button boton = (Button) findViewById(R.id.login);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accion();
            }
        });

        tv_reg = (TextView) findViewById(R.id.register);
        tv_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRegister();
            }
        });
    }

    private void onRegister() {
        Intent i = new Intent(MainActivity.this, Register.class);
        startActivity(i);
    }

    @Override
    protected void onPause() {
        Log.e("LifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.e("LyCycle", "onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("LyCycle", "onRestart");
        super.onRestart();
    }

    public void accion() {
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("SALIR")
                .setMessage("¿Desea Salir?")
                .setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                });
        builder.show();
    }
}
