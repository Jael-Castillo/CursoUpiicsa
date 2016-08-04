package itokcenter.com.sqliteandroid;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DBController dbController;

    TextView txtContent;
    EditText edtxName, edtxAddress, edtxAge;
    Button btnInsert, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbController = new DBController(MainActivity.this);

        txtContent = (TextView) findViewById(R.id.txtContenido);
        edtxName = (EditText) findViewById(R.id.edtxName);
        edtxAddress = (EditText) findViewById(R.id.edtxAddress);
        edtxAge = (EditText) findViewById(R.id.edtxAge);
        btnInsert = (Button) findViewById(R.id.btnInsertar);
        btnDelete = (Button) findViewById(R.id.btnBorrar);

    }

    @Override
    protected void onResume() {
        super.onResume();

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbController.open();
                dbController.insertData(edtxName.getText().toString(),
                        edtxAddress.getText().toString(),
                        Integer.parseInt(edtxAge.getText().toString()));
                showData();
                dbController.close();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbController.open();
                dbController.delete(0);
                showData();
                dbController.close();
            }
        });

    }

    public void showData() {
        txtContent.setText("");
        Cursor cursor = dbController.getData();
        if (cursor.moveToFirst()) {
            do {
//                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                int age = cursor.getInt(2);
                String address = cursor.getString(3);
                txtContent.append("nombre: " + name
                        + " direccion: "
                        + address + " Edad: "
                        + age + "\n");
            } while (cursor.moveToNext());
        }
    }

}
