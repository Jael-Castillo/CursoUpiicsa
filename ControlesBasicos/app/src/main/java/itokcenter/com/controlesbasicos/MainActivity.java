package itokcenter.com.controlesbasicos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Titulo de mi toolbar");
        toolbar.setSubtitle("Subtitulo de mi toolbar");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opc1:
                Toast.makeText(getBaseContext(), "Opción 1 presionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opc2:
                Log.e(TAG, "onOptionsItemSelected: " + "opcion2");
                return true;
            case R.id.opc3:
                Log.i(TAG, "onOptionsItemSelected: " + "opcion3");
                return true;
            case R.id.opc4:
                Log.d(TAG, "onOptionsItemSelected: " + "Opcion 4");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
