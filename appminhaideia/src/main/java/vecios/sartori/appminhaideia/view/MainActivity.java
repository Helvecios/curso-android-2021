package vecios.sartori.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import vecios.sartori.appminhaideia.R;
import vecios.sartori.appminhaideia.core.AppUtil;
import vecios.sartori.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.d(AppUtil.TAG, "onCreate: Tela Principal carregada ...");

        //reconstruir o Bundle
        Bundle bundle = getIntent().getExtras();

        Log.d(AppUtil.TAG, "onCreate: Nome ... " + bundle.getString("nome"));
        Log.d(AppUtil.TAG, "onCreate: Email ... " + bundle.getString("email"));

        txtNome = findViewById(R.id.textNome);
        txtNome.setText("Bem vindo ..." + bundle.getString("nome"));
    }
}