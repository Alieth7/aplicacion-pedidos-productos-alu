package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class DatosRecojo_3 extends AppCompatActivity {


    EditText nombreCliente,apeCliente,nroCelular,nroCi;
   // ImageButton imgBackList;
    Button btnTerminarPedido;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_datos_recojo3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_provisionalAdmin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nombreCliente=findViewById(R.id.edtxt_Nombre);
        apeCliente=findViewById(R.id.edtxt_Apellidos);
        nroCelular=findViewById(R.id.edtxt_Celular);
        nroCi=findViewById(R.id.edtxt_Ci);
        //botoncito volver
        //imgBackList=findViewById(R.id.imgbtn_BackLista);
    }

    public void backLista1(View v){
        Intent it = new Intent(this, MainActivity_Productos.class);
        startActivity(it);
    }

    public void registrarClienteSin (){
        String nomCliente=  nombreCliente.getText().toString();
        String apCliente=   apeCliente.getText().toString();
        int    nroCel=      Integer.parseInt(nroCelular.getText().toString());
        String ci=          nroCi.getText().toString();
        String rol=         "Cliente";

        Persona persona= new Persona(nomCliente,apCliente,ci,nroCel,rol);
    }
    public void verCodigoPedido(View v){

        String saludoprueba="Hola,vengo de Datos Recojo_3";
        Intent it =new Intent(this,CodigoPedido_fin.class);
        it.putExtra("llavemensaje",saludoprueba);
        startActivity(it);

    }
}