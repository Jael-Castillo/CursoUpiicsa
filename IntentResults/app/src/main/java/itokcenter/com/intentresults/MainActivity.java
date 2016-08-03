package itokcenter.com.intentresults;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnMail;
    Button btnCamera;
    ImageView imgCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMail = (Button) findViewById(R.id.btnMail);
        btnCamera = (Button) findViewById(R.id.btnCamara);
        imgCamera = (ImageView) findViewById(R.id.imgCamera);

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

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intentCamera, 0);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            Log.e("Data Intent", data.toString());
            Log.e("Data Extras", data.getExtras().toString());
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imgCamera.setImageBitmap(bitmap);
        }
    }
}
