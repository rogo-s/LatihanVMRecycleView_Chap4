package com.rogo.latihanvmrecycleview_chap4.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.rogo.latihanvmrecycleview_chap4.DataFilm
import com.rogo.latihanvmrecycleview_chap4.R
import org.w3c.dom.Text

class FilmAdapter(var listFilm:ArrayList<DataFilm>): RecyclerView.Adapter<FilmAdapter.ViewHolder>(){
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var judul = itemView.findViewById<TextView>(R.id.judulName)
        var rilis = itemView.findViewById<TextView>(R.id.tglFilm)
        var img = itemView.findViewById<ImageView>(R.id.filmImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.itemlist,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder:FilmAdapter.ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.judul.text = data.namaJudul
        holder.rilis.text = data.tanggalRilis
        holder.img.setImageResource(data.gmr)
    }
    fun setFilmData(listFilm: ArrayList<DataFilm>){
        this.listFilm = listFilm
    }
}
