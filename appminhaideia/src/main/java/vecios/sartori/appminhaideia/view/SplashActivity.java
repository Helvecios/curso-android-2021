package vecios.sartori.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import vecios.sartori.appminhaideia.R;
import vecios.sartori.appminhaideia.controller.ClienteController;
import vecios.sartori.appminhaideia.core.AppUtil;
import vecios.sartori.appminhaideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    //atributos
    int tempoDeEspera = 1000 * 5; //5 s

    TextView textAppVersion;

    //criar objeto objCliente
    Cliente objCliente;
    //criar objeto clienteController
    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //metodo nativo do android onCreate
        Log.d(AppUtil.TAG, "onCreate: Tela Splash carregada ...");

        textAppVersion = findViewById(R.id.textAppVersion);
        textAppVersion.setText(AppUtil.versaoDoAplicativo());

        //instanciar clienteController
        clienteController = new ClienteController();

        trocarTela();
    }
    //metodo para trocar de tela
    private void trocarTela() {

        Log.d(AppUtil.TAG, "trocarTela: Mudando de tela");
        Log.d(AppUtil.TAG, "trocarTela: Esperando um tempo de 5 segundos");

        //classe nativa do android Handler, utilizado para dar um delay para trocar a tela
        //instaciar Runnable
        new Handler().postDelayed(new Runnable() {
              @Override
              public void run() {

                  //instanciar o objeto objCliente
                  objCliente = new Cliente(   "Vecios",
                          "vecios@globo.com",
                          "1199998877",
                          59,
                          true);

                  //criar objeto trocarDeTela
                  Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);

                 //classe Bundle permite que sejam adicionados atributos, objetos
                  //para ser enviados para outra tela
                  Bundle bundle = new Bundle();
                  bundle.putString("nome", objCliente.getNome() );
                  bundle.putString("email", objCliente.getEmail() );

                  trocarDeTela.putExtras(bundle);

                  //executar a ação de trocar a tela
                  startActivity(trocarDeTela);
                  //finalizar a ação
                  finish();

                  Log.d(AppUtil.TAG, "trocarTela: Final do tempo de esperando");

              }
         },tempoDeEspera);


    }
}