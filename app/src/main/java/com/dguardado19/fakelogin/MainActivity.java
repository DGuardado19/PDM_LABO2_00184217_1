
package com.dguardado19.fakelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1, text2;
    private Button bt1;
    private TextView mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.boton);
        text1 =findViewById(R.id.username);
        text2 = findViewById(R.id.password);
        mostrar = findViewById(R.id.vista);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mostrar.setText(text1.getText().toString());
            }
        });
        bt1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mostrar.setText(text2.getText().toString());
                return false;
            }
        });
    }
}
