package flipped.flipped;

import android.app.ProgressDialog;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class logcorreo extends AppCompatActivity implements View.OnClickListener {

    private Button btlogiar;
    private EditText editemail;
    private  EditText editpass;
    private TextView textViewSing;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcorreo);

        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() !=null)
        {
            finish();
            startActivity(new Intent(getApplicationContext(),barra.class));
        }
        btlogiar = (Button)findViewById(R.id.btlog);
        editemail = (EditText) findViewById(R.id.txemail);
        editpass = (EditText) findViewById(R.id.txpass);
        textViewSing= (TextView)findViewById(R.id.txtviewsing);

        btlogiar.setOnClickListener(this);
        textViewSing.setOnClickListener(this);

        progressDialog = new ProgressDialog(this  );
    }

    private void userLogin()
    {
        String email = editemail.getText().toString().trim();
        String password = editpass.getText().toString().trim();

        if (TextUtils.isEmpty(email))
        {
            Toast.makeText(this,"Pleas enter email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password))
        {

            Toast.makeText(this,"Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Register User...");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful())
                        {
                            finish();
                            startActivity(new Intent(getApplicationContext(),barra.class));
                        }
                    }
                });
    }
    @Override
    public void onClick(View v) {
        if(v == btlogiar)
        {
            userLogin();
        }
        if(v==textViewSing)
        {
            finish();
            startActivity(new Intent(this,login.class));

        }
    }
}
