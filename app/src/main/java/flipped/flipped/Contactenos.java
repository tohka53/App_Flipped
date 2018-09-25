package flipped.flipped;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contactenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactenos);
        final EditText to = (EditText) findViewById(R.id.correo);

        final  EditText subject = (EditText) findViewById(R.id.subject);
        final EditText messaje = (EditText) findViewById(R.id.mensaje);
        Button enviar = (Button) findViewById(R.id.btcorreo);

        enviar.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                String tos = "mecg1994@gmail.com";
                String subs = subject.getText().toString();
                String mes = messaje.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                // email.putExtra(Intent.EXTRA_EMAIL, tos);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{tos} );
                email.putExtra(Intent.EXTRA_SUBJECT, subs);
                email.putExtra(Intent.EXTRA_TEXT, mes);

                email.setType("messaje/rfc822");
                startActivity(Intent.createChooser(email, "Choose app to send email"));
            }
        });



    }


}
