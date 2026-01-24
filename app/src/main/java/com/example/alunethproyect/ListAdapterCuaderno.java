package com.example.alunethproyect;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapterCuaderno extends RecyclerView.Adapter<ListAdapterCuaderno.ViewHolder>{


    Context context;
    ArrayList<Cuaderno> listaCuadernos;

    //creamos su constructor de este ListAdapter
    public ListAdapterCuaderno(Context context, ArrayList<Cuaderno> listaCuadernos) {
        this.context = context;
        this.listaCuadernos = listaCuadernos;
    }

    @NonNull
    @Override
    public ListAdapterCuaderno.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item_cuadernos,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterCuaderno.ViewHolder holder, int position) {

        holder.imgviewCuaderno.setImageResource(listaCuadernos.get(position).getImagen());
        holder.textDescripcion.setText(listaCuadernos.get(position).getEspecificaciones());
        holder.imgbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaCuadernos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgviewCuaderno;
        TextView textDescripcion;
        ImageButton imgbtnAdd;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgviewCuaderno= itemView.findViewById(R.id.imgview_Cuaderno);
            textDescripcion =itemView.findViewById(R.id.txt_Descripcion);
            imgbtnAdd=itemView.findViewById(R.id.imgbtn_Add);
        }
    }
}
