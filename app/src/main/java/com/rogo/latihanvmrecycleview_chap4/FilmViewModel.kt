package com.rogo.latihanvmrecycleview_chap4

import android.provider.ContactsContract.Data
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel: ViewModel(){
    val list = arrayListOf(
        DataFilm("Avenger Endgame", "17-05-2019", R.drawable.avender_endgame),
        DataFilm("Avatar 2", "5-03-2023", R.drawable.avatar),
        DataFilm("Doctor Strange 2", "1-07-2022", R.drawable.doctor_strange),
        DataFilm("fifthy of shades", "24-05-2019", R.drawable.shades),
        DataFilm("Spiderman 3", "20-06-2023", R.drawable.spiderman2)

        )
    val filmList: MutableLiveData<List<DataFilm>> = MutableLiveData()
    fun getFilmList(){
        var film = list
        filmList.value = film
    }
}