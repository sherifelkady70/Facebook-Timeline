package com.route.facebook_timeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var itemsForRv :ArrayList<Items>
    lateinit var recyclerView : RecyclerView
    lateinit var myAdapter : MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        itemsForRv= ArrayList()
        createList()
        prepareRv()
    }
private fun prepareRv(){
    recyclerView = findViewById(R.id.mainRv)
    myAdapter= MyAdapter(itemsForRv)
    recyclerView.adapter = myAdapter
    recyclerView.layoutManager = LinearLayoutManager(this)
}
private fun createList(){
//    for(i in 0..100){
//        itemsForRv.add(Items("$i","$i",i))
//    }
    itemsForRv.add(Items("sherif","this post is good",10))
    itemsForRv.add(Items("mohamed","this post is bad",25))
    itemsForRv.add(Items("amr elkady","that is nice",20))
    itemsForRv.add(Items("AbdElrhman Elkady","yes..its fun",50))
    itemsForRv.add(Items("Sahar Twfik","No this is not good",150))
    itemsForRv.add(Items("mohamed Ayoub","can i help this post ",2))
    itemsForRv.add(Items("Waleed","yes because this is good",7))
    itemsForRv.add(Items("mohamed Said","this link is very helpful",45))
    itemsForRv.add(Items("Ahmed","this link is very useful",250))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
    itemsForRv.add(Items("Unblast","Buckle Up, Because change is coming to WordPress",15))
}
}