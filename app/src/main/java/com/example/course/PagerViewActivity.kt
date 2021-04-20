package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.course.adapter.AdapterInterFace
import kotlinx.android.synthetic.main.activity_pager_view.*


class PagerViewActivity : AppCompatActivity()  {
    lateinit var vdAdapter :AdapterInterFace
    val dots = arrayOfNulls<TextView>(3)
    var currentPage : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager_view)
        vdAdapter = AdapterInterFace(this)
        vv_pager.adapter = vdAdapter
//        slideIndicator(currentPage)
//        initFunction()
    }

//    fun initFunction (){
//        vv_pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onPageSelected(position: Int) {
//               slideIndicator((position))
//                currentPage = position
//            }
//
//            override fun onPageScrollStateChanged(state: Int) {
//                TODO("Not yet implemented")
//            }
//
//        })
//    }
//    fun slideIndicator (param :Int){
//        ll_02.removeAllViews()
//        for (i in 0..dots.size-1){
//            dots[i]= TextView(this)
//            dots[i]?.textSize= 35f
//            dots[i]?.setTextColor(resources.getColor(R.color.design_default_color_error))
//
//        }
//        if(dots.size>0){
//            dots[param]?.setTextColor(resources.getColor(R.color.design_default_color_primary))
//        }
//    }

}
