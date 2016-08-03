package itokcenter.com.controlesbasicos;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    EditText edtxName, edtxAge, edtxMail, edtxTwitter;
    TextView txtName, txtAge, txtMail, txtTwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        edtxName = (EditText) findViewById(R.id.edtxName);
        edtxAge = (EditText) findViewById(R.id.edtxAge);
        edtxMail = (EditText) findViewById(R.id.edtxMail);
        edtxTwitter = (EditText) findViewById(R.id.edtxTwitter);

        txtName = (TextView) findViewById(R.id.txtName);
        txtAge = (TextView) findViewById(R.id.txtAge);
        txtMail = (TextView) findViewById(R.id.txtMail);
        txtTwitter = (TextView) findViewById(R.id.txtTwitter);

    }
}
