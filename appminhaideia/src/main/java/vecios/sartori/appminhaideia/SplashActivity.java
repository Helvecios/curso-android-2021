package vecios.sartori.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    //atributos
    int tempoDeEspera = 1000 * 10; //10 s

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //metodo nativo do android onCreate
        Log.d(TAG, "onCreate: Tela Splash carregada ...");
               
        trocarTela();

    }
    //metodo para trocar de tela
    private void trocarTela() {

        Log.d(TAG, "trocarTela: Mudando de tela");
        Log.d(TAG, "trocarTela: Esperando um tempo de 10 segundos");

        //classe nativa do android Handler, utilizado para dar um delay para trocar a tela
        //instaciar Runnable
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {

                                          //Log.d(TAG, "trocarTela: Esperando um tempo");

                                          //criar objeto trocarDeTela
                                          Intent trocarDeTela = new Intent(SplashActivity.this, MainActivity.class);
                                          //executar a ação de trocar a tela
                                          startActivity(trocarDeTela);
                                          //finalizar a ação
                                          finish();

                                          Log.d(TAG, "trocarTela: Final do tempo de esperando");

                                      }
                                  },tempoDeEspera);


    }
}