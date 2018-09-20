package flipped.flipped;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class formaperfil extends AppCompatActivity {

    Button btsave;
    Button btmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formaperfil);

        btsave = findViewById(R.id.btsave);
        btsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_text(v);
                Intent intent = new Intent (formaperfil.this , barra.class);
                startActivity(intent);
            }
        });
        btmenu = findViewById(R.id.menu);
        btmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (formaperfil.this , barra.class);
                startActivity(intent);
            }
        });

    }
    public void save_text(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.alert);
        builder.setMessage(R.string.juanito);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        Dialog dialog = builder.create();
        dialog.show();

    }
}
