package com.example.alunethproyect;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//volley
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import  com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

//JSON
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONStringer;
import org.json.JSONArray;

//Para enviar multiples datos desde aca a la api por JSON
import java.util.HashMap;
import java.util.Map;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InicioSesion_4 extends AppCompatActivity {

    SessionClass sesionUsuario;

    EditText etnombreUsuario,etpassword;
    Button   btnIngresar,btnCrearCu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion4);

        etnombreUsuario= findViewById(R.id.edtxt_NombreUsuario);
        etpassword= findViewById(R.id.edtxt_Contrasenia);
        btnIngresar = findViewById(R.id.btn_InicioSesion);
        btnCrearCu =findViewById(R.id.btn_CrearCuenta);
        btnIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                      validarLogin(Config.BASE_URL + "/auth/login");}
            }
        );
        btnCrearCu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String saludo="Hola vengo de iniciar sesion a crear una cuenta";
                Intent it = new Intent(getApplicationContext(), CrearCuenta_5.class);
                it.putExtra("llaveprueba",saludo);
                startActivity(it);
            }
        });
    }

    private void validarLogin(String URLAPI) {
        JSONObject parametros = new JSONObject();


        try {
            parametros.put("username", etnombreUsuario.getText().toString());
            parametros.put("password", etpassword.getText().toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, URLAPI, parametros,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            String token = response.getString("token");
                            int idUsuario = response.getInt("id");
                            String nombreUsuario = response.getString("username");
                            String rol = response.getString("role");
                            String nombre=response.getString("name");
                            String apellido=response.getString("lastname");

                            Intent it = new Intent(getApplicationContext(), MainActivity_Productos.class);
                            it.putExtra("idUsuario", idUsuario);
                            it.putExtra("nombreUsuario", nombreUsuario);
                            it.putExtra("rol", rol);
                            it.putExtra("token", token);
                            it.putExtra("nombre", nombre);
                            it.putExtra("apellido", apellido);
                            startActivity(it);

                            //enviamos los datos de la sesion actual

                        } catch (JSONException ex) {
                            ex.printStackTrace();
                            Toast.makeText(InicioSesion_4.this, "Error en la respuesta del servidor", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(InicioSesion_4.this, "Error: " + error.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        );

        // Agrega la solicitud a la cola
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
    }
}