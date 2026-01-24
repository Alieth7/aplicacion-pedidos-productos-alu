package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class TipoEncuadernado_6 extends AppCompatActivity {

    ArrayList<CarouselItem> listaCarrusel = new ArrayList<>();
    Spinner spEncuadernado;
    Button btnIrTapas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_encuadernado6);

        ImageCarousel carrusel = findViewById(R.id.imgcarru_Encuadernado);

        listaCarrusel.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo/1.jpg",
                "Opcion 1"));
        listaCarrusel.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo/2.jpg",
                "Opcion 2"));
        listaCarrusel.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo/3.jpg",
                "Opcion 3"));
        listaCarrusel.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo/4.jpg",
                "Opcion 4"));
        listaCarrusel.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo/5.jpg",
                "Opcion 5"));

        carrusel.setData(listaCarrusel);
    }
    public void irTapasExterior (View v){
        String saludo="Hola vengo de escojer el tipo de encadernacion";
        Intent it= new Intent(this, TipoExterior_7.class);
        it.putExtra("llaveprueba",saludo);
        startActivity(it);
        //enviar el item seleccionado al sig activitie...
    }
}