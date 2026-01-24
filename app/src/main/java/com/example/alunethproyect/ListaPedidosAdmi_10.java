package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListaPedidosAdmi_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_pedidos_admi10);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_provisionalAdmin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //----------------------INTENT---------------------------//
    public void irTapasInterior (View v){
        String saludo="Hola vengo de ver los detalles de un pedido de la lista";
        Intent it= new Intent(this, PedidosAdmi_9.class);
        it.putExtra("llaveprueba",saludo);
        startActivity(it);
    }
}