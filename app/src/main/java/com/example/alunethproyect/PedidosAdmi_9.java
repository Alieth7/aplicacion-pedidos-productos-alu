package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PedidosAdmi_9 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList listaPedidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pedidos_admi9);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_provisionalAdmin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void listarPedidos (View v){
        String saludo="Hola vengo de iniciar sesion como admin";
        Intent it= new Intent(this, ListaPedidosAdmi_10.class);
        it.putExtra("llaveprueba",saludo);
        startActivity(it);
    }
}