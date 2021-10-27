package com.example.lemonaderecipeapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating variable for imageview object
        val myimageview = findViewById<ImageView>(R.id.imageView)
        val textview = findViewById<TextView>(R.id.textView)
        textview.setText(R.string.text1)

        // applying click function for image
        myimageview.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 1", Toast.LENGTH_SHORT).show()
            click_image1()
        }
    }

    // creating function for image click
    private fun click_image1() {
        val imageview1 = findViewById<ImageView>(R.id.imageView)
        val textview1 = findViewById<TextView>(R.id.textView)
        textview1.setText(R.string.text2)
        imageview1.setImageResource(R.drawable.lemonade_1)
        imageview1.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 2", Toast.LENGTH_SHORT).show()
            click_image2()
        }
    }

    private fun click_image2() {
        val imageview2 = findViewById<ImageView>(R.id.imageView)
        val textview2 = findViewById<TextView>(R.id.textView)
        textview2.setText(R.string.text3)
        imageview2.setImageResource(R.drawable.lemonade_2)
        imageview2.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 3", Toast.LENGTH_SHORT).show()
            click_image3()
        }
    }

    private fun click_image3() {
        val imageview3 = findViewById<ImageView>(R.id.imageView)
        val textview3 = findViewById<TextView>(R.id.textView)
        textview3.setText(R.string.text4)
        imageview3.setImageResource(R.drawable.lemonade_3)
        imageview3.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 4", Toast.LENGTH_SHORT).show()
            click_image4()
        }
    }

    private fun click_image4(){
        val imageview4 = findViewById<ImageView>(R.id.imageView)
        val textview4 = findViewById<TextView>(R.id.textView)
        textview4.setText(R.string.text5)
        imageview4.setImageResource(R.drawable.lemonade_4)
        imageview4.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 5", Toast.LENGTH_SHORT).show()
            click_image5()
        }
    }

    private fun click_image5(){
        val imageview5 = findViewById<ImageView>(R.id.imageView)
        val textview5 = findViewById<TextView>(R.id.textView)
        textview5.setText(R.string.text6)
        imageview5.setImageResource(R.drawable.lemonade_5)
        imageview5.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 6", Toast.LENGTH_SHORT).show()
            click_image6()
        }
    }

    private fun click_image6(){
        val imageview6 = findViewById<ImageView>(R.id.imageView)
        val textview6 = findViewById<TextView>(R.id.textView)
        textview6.setText(R.string.text7)
        imageview6.setImageResource(R.drawable.lemonade_6)
        imageview6.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 7", Toast.LENGTH_SHORT).show()
            click_image7()
        }
    }

    private fun click_image7(){
        val imageview7 = findViewById<ImageView>(R.id.imageView)
        val textview7 = findViewById<TextView>(R.id.textView)
        textview7.setText(R.string.text8)
        imageview7.setImageResource(R.drawable.lemonade_7)
        imageview7.setOnClickListener {
            Toast.makeText(this@MainActivity, "Step 8", Toast.LENGTH_SHORT).show()
            click_image8()
        }
    }

    private fun click_image8(){
        val imageview8 = findViewById<ImageView>(R.id.imageView)
        val textview8 = findViewById<TextView>(R.id.textView)
        textview8.setText(R.string.text9)
        imageview8.setImageResource(R.drawable.lemonade_8)
        imageview8.setOnClickListener {
            Toast.makeText(this@MainActivity, "Refreshing Lemonade is ready to drink...", Toast.LENGTH_SHORT).show()
        }
    }
}
