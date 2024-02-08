package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class TextSizeAdapter : BaseAdapter(_context: Context _size: Array<int>) {

    private val context = _context
    private val size = _size

    override fun getCount(): Int {
        return size.size
    }

    override fun getItem(position: Int): Any {
        return size[position]
    }

    override fun getItemId(position: Int): Long {

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}