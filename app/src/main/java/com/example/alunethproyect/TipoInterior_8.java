package com.example.alunethproyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class TipoInterior_8 extends AppCompatActivity {

    ArrayList<CarouselItem> listaTipoHojas=new ArrayList<>();
    ArrayList<CarouselItem> listaTipoDisenio=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tipo_interior8);

        ImageCarousel carruselHoja= findViewById(R.id.imgcarru_Hoja);
        ImageCarousel carruselDisenio= findViewById(R.id.imgcarru_Disenio);

        listaTipoDisenio.add(new CarouselItem(
                Config.IMAGE_URL + "/disenio-hojas/1.jpg",
                "Photo by Aaron Wu on Unsplash"));
        listaTipoDisenio.add(new CarouselItem(
                Config.IMAGE_URL + "/disenio-hojas/2.jpg",
                "Descripcion"));
        listaTipoDisenio.add(new CarouselItem(
                Config.IMAGE_URL + "/disenio-hojas/3.jpg",
                "Descripcion"));
        listaTipoHojas.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo_hojas/1.jpg",
                "Photo by Aaron Wu on Unsplash"));
        listaTipoHojas.add(new CarouselItem(
                Config.IMAGE_URL + "/tipo_hojas/2.jpg",
                "Photo by Aaron Wu on Unsplash"));

        carruselHoja.setData(listaTipoHojas);
        carruselDisenio.setData(listaTipoDisenio);

    }

    public void listarPedidoFinal (View v){
        String saludo="Hola vengo de escoger el tipo de hojas";
        Intent it= new Intent(this, ListaPedido_2.class);
        it.putExtra("llaveprueba",saludo);
        startActivity(it);
    }
}