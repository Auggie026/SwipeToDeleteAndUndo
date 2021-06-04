package com.example.swipetodeleteandundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swipetodeleteandundo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var itemAdapter: ItemAdapter
    private val mList = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        itemAdapter = ItemAdapter()
        mData()
    }

    private fun mData(){
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")
        mList.add("Subscribe")

        itemAdapter.differ.submitList(mList)

        binding.recyclerView.apply {
           layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = itemAdapter
            setHasFixedSize(true)
        }
    }
}