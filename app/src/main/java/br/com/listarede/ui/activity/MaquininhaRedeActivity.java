package br.com.listarede.ui.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import br.com.listarede.R;
import br.com.listarede.ui.adapter.ListaMaquininhaAdapter;

public class MaquininhaRedeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maquininha_rede);
        ListView listaDeMaquininha = findViewById(R.id.maquininha);
        listaDeMaquininha.setAdapter(new ListaMaquininhaAdapter());
    }
}