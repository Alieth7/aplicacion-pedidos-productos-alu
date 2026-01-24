package com.example.alunethproyect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity_Productos extends AppCompatActivity {

    SessionClass sesionUsuario;


    DrawerLayout drawerLayout;
    ImageButton buttonDrawerMenu;
    NavigationView navegacionView;

    RecyclerView reciclerView;
    ArrayList<Cuaderno> listaCuadernos;

    Button buttonPedido;
    TextView textCostoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it = getIntent();

        if(it.getExtras()!=null){


            int idUsuario= getIntent().getIntExtra("idUsuario",0);
            String nomUsuario= getIntent().getStringExtra("nombreUsuario");
            String rolUsuario= getIntent().getStringExtra("rol");
            String token= getIntent().getStringExtra("token");
            String nombre= getIntent().getStringExtra("nombre");
            String apellido= getIntent().getStringExtra("apellido");

            sesionUsuario= new SessionClass(token,nomUsuario,idUsuario,rolUsuario,nombre,apellido);

        }
    //Menu desplegable
        drawerLayout =findViewById(R.id.main_drawerLayout);
        buttonDrawerMenu=findViewById(R.id.btn_DrawerMenu);
        navegacionView=findViewById(R.id.navegacionView);

        buttonDrawerMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.open();
            }
        });
        //header
        View headerView=navegacionView.getHeaderView(0);
        ImageView useImage = headerView.findViewById(R.id.imgView_Usuario);
        TextView nombreUsuario = headerView.findViewById(R.id.txt_NombreUsuario);
        TextView nombreCompleto =headerView.findViewById(R.id.txt_NombreCliente);

        if(sesionUsuario!=null){

            nombreUsuario.setText(sesionUsuario.getNomUsuario());
            nombreCompleto.setText(sesionUsuario.getNombre()+" "+sesionUsuario.getApPaternos());
        }

        useImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity_Productos.this,nombreUsuario.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        navegacionView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId= item.getItemId();

                if(itemId==R.id.navProductos){
                    Toast.makeText(MainActivity_Productos.this, "Estamos en productos ", Toast.LENGTH_SHORT).show();

                }

                if(itemId==R.id.navPersonalizado){

                    Intent it= new Intent(MainActivity_Productos.this,TipoEncuadernado_6.class); //cambiamos algunas cosas aca en lugar de solo (this)-->MainActivity_Productos.this
                    startActivity(it);

                }

                if(itemId==R.id.navContactos){

                    Intent it = new Intent(Intent.ACTION_VIEW);
                    it.setData(Uri.parse("https://wa.me/message/"));
                    startActivity(it);
                }
                if(itemId==R.id.navRedesSociales){

                    Intent it = new Intent(Intent.ACTION_VIEW);
                    it.setData(Uri.parse("https://www.instagram.com/"));
                    startActivity(it);
                }
                if(itemId==R.id.navInicioSesion){
                    //Intent
                    String mensaje="Hola inicio de sesion";
                    Intent it= new Intent(MainActivity_Productos.this, InicioSesion_4.class); //cambiamos algunas cosas aca en lugar de solo (this)-->MainActivity_Productos.this
                    it.putExtra("mensajellave",mensaje);
                    startActivity(it);
                }

                drawerLayout.close();
                return false;
            }
        });
        //
        //Recycler
        reciclerView = findViewById(R.id.Rview_Cuadernos);

        listaCuadernos =new ArrayList<>();

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        reciclerView.setLayoutManager(linearLayoutManager);

        Cuaderno cuaderno1= new Cuaderno(1,"001",75.0,false,"Album de fotos","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_1);
        Cuaderno cuaderno2= new Cuaderno(2,"002",75.0,false,"Album de fotos 2","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_2);
        listaCuadernos.add(new Cuaderno(2,"002",75.0,false,"Album de fotos 2","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_2));
        listaCuadernos.add(new Cuaderno(2,"002",75.0,false,"Album de fotos 2","Album de fotos mitad oficio con hojas de cartulina.",R.drawable.book_2));
        listaCuadernos.add(cuaderno1);
        listaCuadernos.add(cuaderno2);

        ListAdapterCuaderno listAdapterCuaderno= new ListAdapterCuaderno(this,listaCuadernos);
        reciclerView.setAdapter(listAdapterCuaderno);
        //

        buttonPedido= findViewById(R.id.btn_Pedido);
        textCostoTotal=findViewById(R.id.txt_TotalCosto);
    }
    //Intent

    //VA A ListaPedido_2
    public void listarPedido(View v){

        String saludoprueba="Hola, vengo del main activity";
        Intent it = new Intent(this, ListaPedido_2.class);
        it.putExtra("mensajellaveprueba",saludoprueba);
        startActivity(it);

    }
}