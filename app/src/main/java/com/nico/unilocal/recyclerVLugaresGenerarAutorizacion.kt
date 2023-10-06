package com.nico.unilocal

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.nico.unilocal.models.Lugar
import java.time.LocalTime

class recyclerVLugaresGenerarAutorizacion : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    val lugares = listOf(
        Lugar(name = "Lugar 1", description = "Descripción del lugar 1", schedule = LocalTime.of(10,0)),
        Lugar(name = "Lugar 2", description = "Descripción del lugar 2", schedule = LocalTime.of(12,0)),
        Lugar(name = "Lugar 3", description = "Descripción del lugar 3", schedule = LocalTime.of(10,0))
    )


    private lateinit var recyclerviewLugares: RecyclerView
    private lateinit var lugarItemAdapter: LugarItemAdapter

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview_lugares_autorizar_ono)
        initComponents()
        initUI()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initUI() {
        TODO("Not yet implemented")
        lugarItemAdapter = LugarItemAdapter(lugares)
        recyclerviewLugares.adapter = lugarItemAdapter

    }

    private fun initComponents() {
        TODO("Not yet implemented")
        recyclerviewLugares = findViewById(R.id.rvLugares)
    }


}