package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CodigoPedido_fin extends AppCompatActivity {

    EditText etCodigoPedido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_codigo_pedido_fin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_provisionalAdmin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void irMainActivity(View v){
        String saludoprueba="Hola,vengo de CodigoPedido_fin";
        Intent it =new Intent(this,MainActivity_Productos.class);
        it.putExtra("llavemensaje",saludoprueba);
        startActivity(it);
    }

    public void backLista3(View v){
        Intent it = new Intent(this, DatosRecojo_3.class);
        startActivity(it);
    }

}