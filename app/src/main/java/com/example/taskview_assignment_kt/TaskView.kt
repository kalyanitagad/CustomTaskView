package com.example.taskview_assignment_kt

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.annotation.SuppressLint
import android.graphics.Color.RED
import android.hardware.camera2.params.RggbChannelVector.RED
import android.widget.TextView
import java.util.*

@SuppressLint("AppCompatCustomView")
class TaskView(context: Context,attribute: AttributeSet?):TextView(context, attribute)
{
    var taskStatus = false
    set(value){
        field=value
        if(field){
            setTextColor(Color.GREEN)
        }
        else{
            setTextColor(Color.RED)
        }
    }
    init {
        setTextColor(Color.RED)
        this.setOnClickListener(object :OnClickListener{
            override fun onClick(v: View?) {
                taskStatus=! taskStatus

            }
        })

        }

    override fun onDraw(canvas: Canvas?){
        super.onDraw(canvas)
        paint.strokeWidth =7f
        canvas?.drawLine(90f,30f,90f,160f, paint)
        canvas?.drawLine(110f,30f,110f,160f,paint)
    }

}