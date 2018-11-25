package es.usj.task202;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.telefono:
                Toast.makeText(this, "Se presionó el ícono del teléfono", Toast.LENGTH_LONG).show();
                break;

            case R.id.video:
                Toast.makeText(this, "Se presionó el ícono de la Cámara", Toast.LENGTH_LONG).show();
                break;

            case R.id.o1:
                Toast.makeText(this, "Se presionó la opción 1", Toast.LENGTH_LONG).show();
                break;

            case R.id.o2:
                Toast.makeText(this, "Se presionó la opción 2", Toast.LENGTH_LONG).show();
                break;

            case R.id.o3:
                Toast.makeText(this, "Se presionó la opción 3", Toast.LENGTH_LONG).show();
                break;


        }
            return true;

    }

    public void ocultar(View v) {
        getSupportActionBar().hide();
    }
    public void mostrar(View v) {
        getSupportActionBar().show();
    }
}
