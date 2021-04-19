package com.example.course.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import com.example.course.R

class AdapterInterFace (val context:Context):PagerAdapter(){
    val arrayImage :IntArray = intArrayOf(R.drawable.youtube,R.drawable.instagram,R.drawable.facebook_logo_489)
    val titleView = arrayOf("Youtube","Instagram","Facebook")
    override fun getCount(): Int {
return arrayImage.size

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
        return view == `object`

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view:View = LayoutInflater.from(context).inflate(R.layout.layout_pager,container,false)
        val title :TextView = view.findViewById(R.id.tvViewPager)
        val img :ImageView = view.findViewById(R.id.iV_image)


        title.text = titleView[position]
        img.setImageDrawable(ContextCompat.getDrawable(context,arrayImage[position]))
      return  view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
      val view :View = `object` as View
container.removeView(view)
    }
}