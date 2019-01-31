package android.icesi.com.w4pplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {


    public static final int COLOR_NEGRO = 1;
    public static final int COLOR_BLANCO = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button boton_blanco = (Button) findViewById(R.id.blanco);
        boton_blanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionBlanco();
            }
        });
        Button boton_negro = (Button) findViewById(R.id.negro);
        boton_negro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accionNegro();
            }
        });
    }

    public void accionBlanco(){
        Intent i = new Intent(this, Main2Activity.class);
        startActivityForResult(i,COLOR_BLANCO);
    }

    public void accionNegro(){
        Intent i = new Intent(this, Main2Activity.class);
        startActivityForResult(i,COLOR_NEGRO);
    }
}
