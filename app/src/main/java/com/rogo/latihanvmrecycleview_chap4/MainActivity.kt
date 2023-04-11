package com.rogo.latihanvmrecycleview_chap4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rogo.latihanvmrecycleview_chap4.Adapter.FilmAdapter

class MainActivity : AppCompatActivity() {
    lateinit var nameFilm: RecyclerView
    lateinit var filmVm: FilmViewModel
    lateinit var filmAdapter: FilmAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFilm()
        filmVm = ViewModelProvider(this).get(FilmViewModel::class.java)
        filmVm.getFilmList()
        filmVm.filmList.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })
    }
    private fun initFilm(){
        nameFilm = findViewById(R.id.rvFilm)
        filmAdapter = FilmAdapter(ArrayList())
        nameFilm.layoutManager = GridLayoutManager(this,2)
        nameFilm.adapter = filmAdapter
    }
    fun setDataFilm(){

    }
}