package com.basic.programming.recyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var arrayList: ArrayList<Versions>? = null
    private var linearLayoutManager: LinearLayoutManager? = null
    private var versionAdapters: VersionAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)
        linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager?.orientation = LinearLayoutManager.VERTICAL
        recyclerView?.layoutManager = linearLayoutManager
        recyclerView?.setHasFixedSize(true)

        arrayList = ArrayList()
        arrayList = setVersionData()
        versionAdapters = VersionAdapters(this, arrayList!!)
        recyclerView?.adapter = versionAdapters


    }

    private fun setVersionData(): ArrayList<Versions> {

        var arrayList: ArrayList<Versions> = ArrayList()

        arrayList.add(Versions("Cupcake", "1.5"))
        arrayList.add(Versions("Donut", "1.6"))
        arrayList.add(Versions("Eclair", "2.0 – 2.1"))
        arrayList.add(Versions("Froyo", "2.2 – 2.2.3"))
        arrayList.add(Versions("Gingerbread", "2.3 – 2.3.7"))
        arrayList.add(Versions("Honeycomb", "3.0 – 3.2.6"))
        arrayList.add(Versions("Ice Cream Sandwich", "4.0 – 4.0.4"))
        arrayList.add(Versions("Jelly Bean", "4.1 – 4.3.1"))
        arrayList.add(Versions("KitKat", "4.4 – 4.4.4"))
        arrayList.add(Versions("Lollipop", "5.0 – 5.1.1"))

        return arrayList
    }

}
