package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class TipoExterior_7 extends AppCompatActivity {

    ArrayList<CarouselItem> listaTamanios = new ArrayList<>();
    ArrayList<CarouselItem>listaForros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tipo_exterior7);

        //Carousel
        ImageCarousel carruselTama = findViewById(R.id.imgcarru_Tamanio);
        ImageCarousel carruselForro = findViewById(R.id.imgcarru_Forro);

        listaTamanios.add(new CarouselItem(
                Config.IMAGE_URL + "/tamanio/tamanio.jpg",
                "Opcion 1"));
        listaTamanios.add(new CarouselItem(
                Config.IMAGE_URL + "/tamanio/tamanio.jpg",
                "Opcion 2"));
        listaForros.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo_material/1.jpg",
                "Opcion 1"));
        listaForros.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo_material/2.jpg",
                "Opcion 2"));
        listaForros.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo_material/3.jpg",
                "Opcion 3"));

        carruselTama.setData(listaTamanios);
        carruselForro.setData(listaForros);
    }

    public void irTapasInterior (View v){
        String saludo="Hola vengo de escoger el tipo de tapas";
        Intent it= new Intent(this, TipoInterior_8.class);
        it.putExtra("llaveprueba",saludo);
        startActivity(it);
    }
}