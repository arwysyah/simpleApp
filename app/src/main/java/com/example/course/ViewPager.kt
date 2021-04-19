package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.course.adapter.AdapterInterFace
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPager : AppCompatActivity() {
    lateinit var vdAdapter :AdapterInterFace
    val dots = arrayOfNulls<TextView>(3)
    var currentPage : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        vdAdapter = AdapterInterFace(this)
       vv_pager.adapter = vdAdapter
        slideIndicator(currentPage)

//initAction()
    }

    fun initAction(){
        vv_pager
    }
    fun slideIndicator (param :Int){
        ll_02.removeAllViews()
        for (i in 0..dots.size){
            dots[i]= TextView(this)
            dots[i]?.textSize= 35f
dots[i]?.setTextColor(resources.getColor(R.color.design_default_color_error))

        }
        if(dots.size>0){
            dots[param]?.setTextColor((resources.getColor(R.color.design_default_color_primary)))
        }
    }
}