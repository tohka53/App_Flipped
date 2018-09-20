package flipped.flipped;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class PaymentDetails extends AppCompatActivity {

    TextView txtID, txtAmount, txtStatus;
    Button backpay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);


        backpay = findViewById(R.id.btbackpay);
        backpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PaymentDetails.this , barra.class);
                startActivity(intent);
            }
        });
                txtID = findViewById(R.id.txtID);
                txtAmount= findViewById(R.id.Amount);
                txtStatus= findViewById(R.id.Status);

        Intent intent = getIntent();

        try
        {
            JSONObject jsonObject = new JSONObject(intent.getStringExtra("PaymetDetails"));
            showDetails(jsonObject.getJSONObject("response"), intent.getStringExtra("PaymentAmount"));

        }
        catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private void showDetails(JSONObject response, String paymetAmount)
    {
        try
        {
            txtID.setText(response.getString("id"));
            txtAmount.setText("$" + paymetAmount);
            txtStatus.setText(response.getString("state"));
        }
       catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
