package vecios.sartori.appminhaideia.controller;

import android.util.Log;

import vecios.sartori.appminhaideia.core.AppUtil;
import vecios.sartori.appminhaideia.model.Cliente;

public class ClienteController {

    //atributo
    String versaoApp;

    //usar método versaoDoAplicativo()

    //contrutor
    public ClienteController() {

        this.versaoApp = AppUtil.versaoDoAplicativo();

        Log.i(AppUtil.TAG, "ClienteController: Versão App: " + versaoApp);

    }
}
