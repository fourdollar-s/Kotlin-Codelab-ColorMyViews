package com.fourdollars.colormyviews

import android.graphics.Color//a library for Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()//call setListeners function
    }

    //change background color of text view
    private fun makeColored(view: View){
        val boxThreeText=findViewById<TextView>(R.id.box_three_text)
        val boxFourText=findViewById<TextView>(R.id.box_four_text)
        val boxFiveText=findViewById<TextView>(R.id.box_five_text)

        when(view.id){//when block to check view's resource ID

//            R.id.box_one_text->view.setBackgroundResource(R.drawable.balloons)
//            R.id.box_two_text->view.setBackgroundResource(R.drawable.flower)
//            R.id.box_three_text->view.setBackgroundResource(R.drawable.tree)
//            R.id.box_four_text->view.setBackgroundResource(R.drawable.tree2)
//            R.id.box_five_text->view.setBackgroundResource(R.drawable.wheat)

            //boxes using Color class colors for the background
            R.id.box_one_text->view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text->view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text->view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text->view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text->view.setBackgroundColor(Color.BLUE)
            // Boxes using custom colors for background
            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)
            else->view.setBackgroundColor(Color.LTGRAY)//if user doesnt touch boxes, but touch the background
        }
    }

    //click-listener function
    private fun setListeners(){

        //reference to view
        val boxOneText=findViewById<TextView>(R.id.box_one_text)
        val boxTwoText=findViewById<TextView>(R.id.box_two_text)
        val boxThreeText=findViewById<TextView>(R.id.box_three_text)
        val boxFourText=findViewById<TextView>(R.id.box_four_text)
        val boxFiveText=findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        //reference to buttons
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        //define a list of views which are clickable named clickableViews
        val clickableViews:List<View> =
        listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout,redButton, greenButton, yellowButton)

        //set listener for each view in clickableViews list
        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }
}