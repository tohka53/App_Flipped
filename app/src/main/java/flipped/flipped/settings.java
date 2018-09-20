package flipped.flipped;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    Button paymetod;
    Button tuto;
    Button contac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        paymetod = (Button)findViewById(R.id.btpay);
        paymetod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (settings.this , pagar.class);
                startActivity(intent);
            }
        });
        tuto = (Button)findViewById(R.id.bttuotital);
        tuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (settings.this , tutorial1.class);
                startActivity(intent);
            }
        });
        contac = (Button)findViewById(R.id.btcontactenos);
        contac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (settings.this , conactenos.class);
                startActivity(intent);
            }
        });


    }
}
