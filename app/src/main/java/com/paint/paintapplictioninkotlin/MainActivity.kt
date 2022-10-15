package com.paint.paintapplictioninkotlin

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.paint.paintapplictioninkotlin.PaintView.Companion.colorList
import com.paint.paintapplictioninkotlin.PaintView.Companion.currentBrush
import com.paint.paintapplictioninkotlin.PaintView.Companion.pathList


class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        val redBtn = findViewById<ImageButton>(R.id.redcolor)
        val blueBtn = findViewById<ImageButton>(R.id.bluecolor)
        val eraser = findViewById<ImageButton>(R.id.whitecolor)
        val yellowBtn = findViewById<ImageButton>(R.id.yellowcolor)


        redBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.RED)
            currentcolor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.BLUE)
            currentcolor(paintBrush.color)
        }
        yellowBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.YELLOW)
            currentcolor(paintBrush.color)

        }
        eraser.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentcolor(color: Int){
        currentBrush = color
        path = Path()
    }
}