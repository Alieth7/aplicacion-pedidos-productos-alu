package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaPedido_2 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Cuaderno> listaPedido;
    ImageButton imgBack;
    Button irdatosRecojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pedido2);


        recyclerView= findViewById(R.id.Rview_listaCompra);

        listaPedido= new ArrayList<>();

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //datos de prueba
        listaPedido.add(new Cuaderno(2,"002",75.0,false,"Album de fotos 2","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_2));
        listaPedido.add(new Cuaderno(3,"003",75.0,false,"Cuaderno bitacora","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_2));
        listaPedido.add(new Cuaderno(4,"004",75.0,false,"Cuaderno anillado","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_2));

        ListAdapterPedido listAdapterPedido = new ListAdapterPedido(this,listaPedido);
        recyclerView.setAdapter(listAdapterPedido);

       imgBack=findViewById(R.id.imgbtn_BackMain);
    }

    public void backMain(View v){
       Intent it = new Intent(this, MainActivity_Productos.class);
        startActivity(it);
    }

    //VA A DatosRecojo_3
    public void pedirDatos(View view) {
        String saludoprueba1="Hola,vengo de Lista Pedido 2";
        Intent it =new Intent(this, DatosRecojo_3.class);
        it.putExtra("llavemensaje",saludoprueba1);
        startActivity(it);
    }
}