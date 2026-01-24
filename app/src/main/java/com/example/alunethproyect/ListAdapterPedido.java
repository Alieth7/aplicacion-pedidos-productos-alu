package com.example.alunethproyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapterPedido extends RecyclerView.Adapter<ListAdapterPedido.ViewHolder> {

   Context context;
   ArrayList<Cuaderno> arrayListPedido;

    public ListAdapterPedido(Context context, ArrayList<Cuaderno> arrayListPedido) {
        this.context = context;
        this.arrayListPedido = arrayListPedido;
    }

    @NonNull
    @Override
    public ListAdapterPedido.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item_pedido,parent,false);

        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ListAdapterPedido.ViewHolder holder, int position) {
///////////////////////
        holder.txtNombCuaderno.setText(arrayListPedido.get(position).getNombre());
        holder.btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mejorar implemetacion de recycler views
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListPedido.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombCuaderno;
        ImageButton btnEliminar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombCuaderno=itemView.findViewById(R.id.txt_NombreCuaderno);
            btnEliminar=itemView.findViewById(R.id.imgbtn_Eliminar);
        }
    }
}
