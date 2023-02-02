package com.vt.kotlinexamples.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vt.kotlinexamples.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        //Empty List
        val dataList:MutableList<Recycler_Item> = ArrayList()

        //New static item
        val recyclerItem = Recycler_Item()
        recyclerItem.name = "Vinay"
        recyclerItem.imageUrl = "Dsd"

        //Adding item to the list
        dataList.add(recyclerItem)

        val recyclerItem2 = Recycler_Item()
        recyclerItem2.name = "Ganesh"
        recyclerItem2.imageUrl = "sds"

        dataList.add(recyclerItem2)

        val recyclerItem3 = Recycler_Item()
        recyclerItem3.name = "Suresh"
        recyclerItem3.imageUrl = "sds"

        dataList.add(recyclerItem3)

        val recyclerItem4 = Recycler_Item()
        recyclerItem4.name = "Suresh"
        recyclerItem4.imageUrl = "sds"

        dataList.add(recyclerItem4)

        val recyclerItem5 = Recycler_Item()
        recyclerItem5.name = "Naresh"
        recyclerItem5.imageUrl = "sds"

        dataList.add(recyclerItem5)



        //Initialization
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val expRecyclerView = findViewById<ExpandableHeightRecyclerView>(R.id.expRecyclerView)

        recyclerView.adapter = ItemAdapter(dataList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)

        expRecyclerView.adapter = ItemAdapter(dataList, this)
        expRecyclerView.layoutManager = LinearLayoutManager(this)
        expRecyclerView.setNestedScrollingEnabled(false)
        expRecyclerView.setExpanded(true)

    }
}