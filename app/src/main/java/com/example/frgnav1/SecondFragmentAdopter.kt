package com.example.frgnav1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class SecondFragmentAdopter (val personList: List<Person>) :
        RecyclerView.Adapter<SecondFragmentAdopter.ViewHolder>(){
            class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val personName : AppCompatTextView
            val personAge: AppCompatTextView

            init {
                personName = itemView.findViewById(R.id.first_text)
                personAge = itemView.findViewById(R.id.secod_text)
            }}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item  = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.personName.text = personList[position].name
        holder.personAge.text = personList[position].age.toString()
    }

    override fun getItemCount(): Int {
        return personList.size
    }
}

