package flipped.flipped;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class pagar extends AppCompatActivity {

    Button papal;
    Button googly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);

        papal = findViewById(R.id.btpaypal);
        papal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (pagar.this , paypal.class);
                startActivity(intent);
            }
        });
        googly = findViewById(R.id.btgoopay);
        googly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (pagar.this , googlepay.class);
                startActivity(intent);
            }
        });


    }
}
