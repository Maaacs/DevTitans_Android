package com.example.lembrete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button BotaoArbrirProximaTela;


   public void BotaoAbrirProximaTela(View view){
       Intent nextActivity = new Intent(MainActivity.this, MainActivity2.class);
       //Intent nextActivity = new Intent(packageContext:MainActivity.this, MainActivity2.class);
       startActivity(nextActivity);
   }

    public Button getBotaoArbrirProximaTela() {
        return BotaoArbrirProximaTela;
    }

    public void setBotaoArbrirProximaTela(Button botaoArbrirProximaTela) {
        BotaoArbrirProximaTela = botaoArbrirProximaTela;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*this.setDisplayEntrada(findViewById(R.id));
        this.setEntradaTexto(findViewByIdr.id());
        this.setSalvarBotao(findViewById())*/
        this.setBotaoArbrirProximaTela(findViewById(R.id.button));

        /*this.setTextRecebido(findViewById(R.id));
        Intent intentRecebido = getIntent();
        getTextRecebido().setText(intentRecebido.getStringExtra());*/
    }
}