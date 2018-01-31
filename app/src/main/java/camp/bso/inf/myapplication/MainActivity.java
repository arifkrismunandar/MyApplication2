package camp.bso.inf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button persib;
    Button persija;
    Button pluspersib;
    Button pluspersija;
    Button minpersib;
    Button minpersija;
    Button reset;
    TextView skorpersib;
    TextView skorpersija;
    int a=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        persib = findViewById(R.id.persib);
        skorpersib=findViewById(R.id.skorpersib);
        skorpersija=findViewById(R.id.skorpersija);
        persib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent persib = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(persib);
            }
        });
        persija = findViewById(R.id.persija);
        persija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent persija = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(persija);
            }
        });
        pluspersib = findViewById(R.id.pluspersib);
        pluspersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                skorpersib.setText(String.valueOf(a));
            }
        });
        minpersib = findViewById(R.id.minpersib);
        minpersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a!=0) {
                    a--;
                    skorpersib.setText(String.valueOf(a));
                }
            }
        });
        pluspersija = findViewById(R.id.pluspersija);
        pluspersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                skorpersija.setText(String.valueOf(b));
            }
        });
        minpersija = findViewById(R.id.minpersija);
        minpersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b!=0) {
                    b--;
                    skorpersija.setText(String.valueOf(b));
                }
            }
        });
        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=0;
                b=0;
                skorpersib.setText(String.valueOf(a=0));
                skorpersija.setText(String.valueOf(b=0));
            }
        });

    }
}
