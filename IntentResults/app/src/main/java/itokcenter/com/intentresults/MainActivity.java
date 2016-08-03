package itokcenter.com.intentresults;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMail = (Button) findViewById(R.id.btnMail);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{
                        "sebastian.tellez.o@gmail.com", "mail@mail.com"
                });
                intent.putExtra(Intent.EXTRA_SUBJECT, "Este es un subject");
                intent.putExtra(Intent.EXTRA_TEXT, "Este es el texto del mensaje");
                startActivity(intent);
            }
        });

    }
}
