package itokcenter.com.controlesbasicos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    AppCompatSeekBar seekBar;
    TextView txtDataUno, txtDataSeg;
    RadioGroup radioGroup;
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        seekBar = (AppCompatSeekBar) findViewById(R.id.seekBar);
        txtDataUno = (TextView) findViewById(R.id.txtData);
        txtDataSeg = (TextView) findViewById(R.id.txtSecondData);

        radioGroup = (RadioGroup) findViewById(R.id.rdGroup);

        toolbar.setTitle("Titulo de mi toolbar");
        toolbar.setSubtitle("Subtitulo de mi toolbar");
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int position, boolean b) {
                txtDataUno.setText("" + position);
                txtDataSeg.setTranslationY(position);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.rdbtnUno:
                        Log.e("rdgroup", getString(R.string.optionuno));
                        break;
                    case R.id.rdbtnDos:
                        Log.e("rdgroup", getString(R.string.optiondos));
                        break;
                    case R.id.rdbtnTres:
                        Log.e("rdgroup", getString(R.string.optiontres));
                        break;
                }
            }
        });

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

    public void getOption(View v) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        Toast.makeText(MainActivity.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
    }

}
