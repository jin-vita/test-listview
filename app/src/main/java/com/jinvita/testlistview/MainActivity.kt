package com.jinvita.testlistview

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.jinvita.testlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val dummy = listOf(
        "철이랑 수철이랑 수",
        "영이랑 희영이랑 희",
        "연이랑 수연이랑 수",
        "강이랑 혁강이랑 혁",
        "용이랑 찬용이랑 찬",
        "철이랑 수철이랑 수",
        "영이랑 희영이랑 희",
        "연이랑 수연이랑 수",
        "강이랑 혁강이랑 혁",
        "용이랑 찬용이랑 찬",
        "철이랑 수철이랑 수",
        "영이랑 희영이랑 희",
        "연이랑 수연이랑 수",
        "강이랑 혁강이랑 혁",
        "용이랑 찬용이랑 찬",
        "철이랑 수철이랑 수",
        "영이랑 희영이랑 희",
        "연이랑 수연이랑 수",
        "강이랑 혁강이랑 혁",
        "용이랑 찬용이랑 찬",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dummy)
        with(binding) {
            listView.adapter = adapter
            listView.setOnItemClickListener { parent, view, position, id ->
                textTitle.text = parent.getItemAtPosition(position).toString()
            }
        }
    }
}