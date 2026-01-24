package com.example.alunethproyect;

import static com.android.volley.Request.Method.POST;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//VOLLEY Y JSON
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CrearCuenta_5 extends AppCompatActivity {

    EditText etNombreUsuario, etNombres, etApellidos, etContrasenia, etCarnet, etCelular;
    Button btnRegistrarsUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_crear_cuenta5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_provisionalAdmin), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Inicializamos los campos
        etNombreUsuario = findViewById(R.id.edtxt_NomUsuRegistro);
        etNombres = findViewById(R.id.edtxt_NombreRegistro);
        etApellidos = findViewById(R.id.edtxt_ApellidosRegistro);
        etContrasenia = findViewById(R.id.edtxt_CrearContrasenia);
        etCarnet =         findViewById(R.id.edtxt_NroCarnetRegistro);
        etCelular =        findViewById(R.id.edtxt_NroCelular);

        btnRegistrarsUsuario= findViewById(R.id.btn_RegistrarUsuario);
        btnRegistrarsUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUsuario();
            }
        });
    }

    private void registrarUsuario() {
        // Enviando todos los datos a la API
        JSONObject parametros = new JSONObject();
        try {
            // Formato JSON
            parametros.put("username", etNombreUsuario.getText().toString());
            parametros.put("password", etContrasenia.getText().toString());
            parametros.put("name", etNombres.getText().toString());
            parametros.put("lastname", etApellidos.getText().toString());
            parametros.put("ci", etCarnet.getText().toString());
            parametros.put("phone_number", etCelular.getText().toString());
            parametros.put("role", "Cliente");


        } catch (JSONException e) {
            e.printStackTrace();
            return;
        }

        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.POST,
                Config.BASE_URL + "/auth/newRegister",
                parametros,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Toast.makeText(getApplicationContext(), "Registro realizado con exito! :3 ", Toast.LENGTH_SHORT).show();

                        Intent it = new Intent(getApplicationContext(), InicioSesion_4.class);
                        startActivity(it);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "Error al registrar: " + error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<>();
                headers.put("Content-Type", "application/json");
                return headers;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonRequest);
    }
}