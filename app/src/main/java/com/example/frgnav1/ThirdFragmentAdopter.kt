package com.example.frgnav1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class ThirdFragmentAdopter(val list: List<Person1>) : RecyclerView.Adapter<ThirdFragmentAdopter.ViewHolder>(){

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val personImage : AppCompatImageView
        val personName : AppCompatTextView
        val personLastName : AppCompatTextView


    init {
        personImage = itemView.findViewById(R.id.imag_view)
        personName = itemView.findViewById(R.id.first_app_txt)
        personLastName = itemView.findViewById(R.id.second_app_txt)

    }

}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.list_itme, parent, false)
        return ViewHolder(item)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.personImage.setImageResource(list[position].image)
        holder.personName.text = list[position].name
        holder.personLastName.text = list[position].LastName
    }
    override fun getItemCount(): Int {
        return list.size
    }

}